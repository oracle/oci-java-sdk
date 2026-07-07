/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.realtimespeech;

/**
 * Details about an audio chunk processed by the realtime speech client. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AudioChunkProcessingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AudioChunkProcessingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    /**
     * Creates an audio chunk processing details model.
     *
     * @param sourceSampleRate The sample rate, in hertz, of the audio bytes provided by the caller.
     * @param targetSampleRate The sample rate, in hertz, sent to the realtime speech service.
     * @param inputBytes The number of audio bytes provided by the caller.
     * @param outputBytes The number of audio bytes sent to the realtime speech service.
     * @param resampled Whether the client resampled the audio chunk before sending it.
     * @param resamplingNanos The time spent preparing and resampling the audio chunk, in
     *     nanoseconds.
     * @param sendNanos The time spent sending the audio chunk to the websocket, in nanoseconds.
     */
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceSampleRate",
        "targetSampleRate",
        "inputBytes",
        "outputBytes",
        "resampled",
        "resamplingNanos",
        "sendNanos"
    })
    public AudioChunkProcessingDetails(
            Integer sourceSampleRate,
            Integer targetSampleRate,
            Integer inputBytes,
            Integer outputBytes,
            Boolean resampled,
            Long resamplingNanos,
            Long sendNanos) {
        super();
        this.sourceSampleRate = sourceSampleRate;
        this.targetSampleRate = targetSampleRate;
        this.inputBytes = inputBytes;
        this.outputBytes = outputBytes;
        this.resampled = resampled;
        this.resamplingNanos = resamplingNanos;
        this.sendNanos = sendNanos;
    }

    /** Builder for {@link AudioChunkProcessingDetails}. */
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sourceSampleRate")
        private Integer sourceSampleRate;

        /**
         * The sample rate, in hertz, of the audio bytes provided by the caller.
         *
         * @param sourceSampleRate the value to set
         * @return this builder
         */
        public Builder sourceSampleRate(Integer sourceSampleRate) {
            this.sourceSampleRate = sourceSampleRate;
            this.__explicitlySet__.add("sourceSampleRate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetSampleRate")
        private Integer targetSampleRate;

        /**
         * The sample rate, in hertz, sent to the realtime speech service.
         *
         * @param targetSampleRate the value to set
         * @return this builder
         */
        public Builder targetSampleRate(Integer targetSampleRate) {
            this.targetSampleRate = targetSampleRate;
            this.__explicitlySet__.add("targetSampleRate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputBytes")
        private Integer inputBytes;

        /**
         * The number of audio bytes provided by the caller.
         *
         * @param inputBytes the value to set
         * @return this builder
         */
        public Builder inputBytes(Integer inputBytes) {
            this.inputBytes = inputBytes;
            this.__explicitlySet__.add("inputBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputBytes")
        private Integer outputBytes;

        /**
         * The number of audio bytes sent to the realtime speech service.
         *
         * @param outputBytes the value to set
         * @return this builder
         */
        public Builder outputBytes(Integer outputBytes) {
            this.outputBytes = outputBytes;
            this.__explicitlySet__.add("outputBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resampled")
        private Boolean resampled;

        /**
         * Whether the client resampled the audio chunk before sending it.
         *
         * @param resampled the value to set
         * @return this builder
         */
        public Builder resampled(Boolean resampled) {
            this.resampled = resampled;
            this.__explicitlySet__.add("resampled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resamplingNanos")
        private Long resamplingNanos;

        /**
         * The time spent preparing and resampling the audio chunk, in nanoseconds.
         *
         * @param resamplingNanos the value to set
         * @return this builder
         */
        public Builder resamplingNanos(Long resamplingNanos) {
            this.resamplingNanos = resamplingNanos;
            this.__explicitlySet__.add("resamplingNanos");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sendNanos")
        private Long sendNanos;

        /**
         * The time spent sending the audio chunk to the websocket, in nanoseconds.
         *
         * @param sendNanos the value to set
         * @return this builder
         */
        public Builder sendNanos(Long sendNanos) {
            this.sendNanos = sendNanos;
            this.__explicitlySet__.add("sendNanos");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        /**
         * Builds an {@link AudioChunkProcessingDetails} instance.
         *
         * @return the model instance
         */
        public AudioChunkProcessingDetails build() {
            AudioChunkProcessingDetails model =
                    new AudioChunkProcessingDetails(
                            this.sourceSampleRate,
                            this.targetSampleRate,
                            this.inputBytes,
                            this.outputBytes,
                            this.resampled,
                            this.resamplingNanos,
                            this.sendNanos);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        /**
         * Copies explicitly set values from another {@link AudioChunkProcessingDetails} instance.
         *
         * @param model the model to copy from
         * @return this builder
         */
        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AudioChunkProcessingDetails model) {
            if (model.wasPropertyExplicitlySet("sourceSampleRate")) {
                this.sourceSampleRate(model.getSourceSampleRate());
            }
            if (model.wasPropertyExplicitlySet("targetSampleRate")) {
                this.targetSampleRate(model.getTargetSampleRate());
            }
            if (model.wasPropertyExplicitlySet("inputBytes")) {
                this.inputBytes(model.getInputBytes());
            }
            if (model.wasPropertyExplicitlySet("outputBytes")) {
                this.outputBytes(model.getOutputBytes());
            }
            if (model.wasPropertyExplicitlySet("resampled")) {
                this.resampled(model.getResampled());
            }
            if (model.wasPropertyExplicitlySet("resamplingNanos")) {
                this.resamplingNanos(model.getResamplingNanos());
            }
            if (model.wasPropertyExplicitlySet("sendNanos")) {
                this.sendNanos(model.getSendNanos());
            }
            return this;
        }
    }

    /**
     * Creates a new builder.
     *
     * @return a new builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Creates a builder initialized with this model's explicitly set values.
     *
     * @return a builder copied from this model
     */
    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceSampleRate")
    private final Integer sourceSampleRate;

    /**
     * Gets the sample rate, in hertz, of the audio bytes provided by the caller.
     *
     * @return the source sample rate
     */
    public Integer getSourceSampleRate() {
        return sourceSampleRate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetSampleRate")
    private final Integer targetSampleRate;

    /**
     * Gets the sample rate, in hertz, sent to the realtime speech service.
     *
     * @return the target sample rate
     */
    public Integer getTargetSampleRate() {
        return targetSampleRate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inputBytes")
    private final Integer inputBytes;

    /**
     * Gets the number of audio bytes provided by the caller.
     *
     * @return the input byte count
     */
    public Integer getInputBytes() {
        return inputBytes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputBytes")
    private final Integer outputBytes;

    /**
     * Gets the number of audio bytes sent to the realtime speech service.
     *
     * @return the output byte count
     */
    public Integer getOutputBytes() {
        return outputBytes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resampled")
    private final Boolean resampled;

    /**
     * Gets whether the client resampled the audio chunk before sending it.
     *
     * @return {@code true} if the chunk was resampled, otherwise {@code false}
     */
    public Boolean getResampled() {
        return resampled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resamplingNanos")
    private final Long resamplingNanos;

    /**
     * Gets the time spent preparing and resampling the audio chunk, in nanoseconds.
     *
     * @return the resampling duration in nanoseconds
     */
    public Long getResamplingNanos() {
        return resamplingNanos;
    }

    /**
     * Gets the time spent preparing and resampling the audio chunk, in milliseconds.
     *
     * @return the resampling duration in milliseconds, or {@code 0.0} when unset
     */
    public double getResamplingMillis() {
        return resamplingNanos == null ? 0.0d : resamplingNanos / 1_000_000.0d;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sendNanos")
    private final Long sendNanos;

    /**
     * Gets the time spent sending the audio chunk to the websocket, in nanoseconds.
     *
     * @return the send duration in nanoseconds
     */
    public Long getSendNanos() {
        return sendNanos;
    }

    /**
     * Gets the time spent sending the audio chunk to the websocket, in milliseconds.
     *
     * @return the send duration in milliseconds, or {@code 0.0} when unset
     */
    public double getSendMillis() {
        return sendNanos == null ? 0.0d : sendNanos / 1_000_000.0d;
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
        sb.append("AudioChunkProcessingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceSampleRate=").append(String.valueOf(this.sourceSampleRate));
        sb.append(", targetSampleRate=").append(String.valueOf(this.targetSampleRate));
        sb.append(", inputBytes=").append(String.valueOf(this.inputBytes));
        sb.append(", outputBytes=").append(String.valueOf(this.outputBytes));
        sb.append(", resampled=").append(String.valueOf(this.resampled));
        sb.append(", resamplingNanos=").append(String.valueOf(this.resamplingNanos));
        sb.append(", sendNanos=").append(String.valueOf(this.sendNanos));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AudioChunkProcessingDetails)) {
            return false;
        }

        AudioChunkProcessingDetails other = (AudioChunkProcessingDetails) o;
        return java.util.Objects.equals(this.sourceSampleRate, other.sourceSampleRate)
                && java.util.Objects.equals(this.targetSampleRate, other.targetSampleRate)
                && java.util.Objects.equals(this.inputBytes, other.inputBytes)
                && java.util.Objects.equals(this.outputBytes, other.outputBytes)
                && java.util.Objects.equals(this.resampled, other.resampled)
                && java.util.Objects.equals(this.resamplingNanos, other.resamplingNanos)
                && java.util.Objects.equals(this.sendNanos, other.sendNanos)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        result =
                (result * prime)
                        + (this.sourceSampleRate == null ? 43 : this.sourceSampleRate.hashCode());
        result =
                (result * prime)
                        + (this.targetSampleRate == null ? 43 : this.targetSampleRate.hashCode());
        result = (result * prime) + (this.inputBytes == null ? 43 : this.inputBytes.hashCode());
        result = (result * prime) + (this.outputBytes == null ? 43 : this.outputBytes.hashCode());
        result = (result * prime) + (this.resampled == null ? 43 : this.resampled.hashCode());
        result =
                (result * prime)
                        + (this.resamplingNanos == null ? 43 : this.resamplingNanos.hashCode());
        result = (result * prime) + (this.sendNanos == null ? 43 : this.sendNanos.hashCode());
        result = (result * prime) + super.hashCode();
        return result;
    }
}
