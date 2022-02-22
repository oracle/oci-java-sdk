/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Audio format details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AudioFormatDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AudioFormatDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("format")
        private String format;

        public Builder format(String format) {
            this.format = format;
            this.__explicitlySet__.add("format");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numberOfChannels")
        private Integer numberOfChannels;

        public Builder numberOfChannels(Integer numberOfChannels) {
            this.numberOfChannels = numberOfChannels;
            this.__explicitlySet__.add("numberOfChannels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encoding")
        private String encoding;

        public Builder encoding(String encoding) {
            this.encoding = encoding;
            this.__explicitlySet__.add("encoding");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sampleRateInHz")
        private Integer sampleRateInHz;

        public Builder sampleRateInHz(Integer sampleRateInHz) {
            this.sampleRateInHz = sampleRateInHz;
            this.__explicitlySet__.add("sampleRateInHz");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AudioFormatDetails build() {
            AudioFormatDetails __instance__ =
                    new AudioFormatDetails(format, numberOfChannels, encoding, sampleRateInHz);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AudioFormatDetails o) {
            Builder copiedBuilder =
                    format(o.getFormat())
                            .numberOfChannels(o.getNumberOfChannels())
                            .encoding(o.getEncoding())
                            .sampleRateInHz(o.getSampleRateInHz());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Input file format. Example - WAV.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    String format;

    /**
     * Input file number of channels.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfChannels")
    Integer numberOfChannels;

    /**
     * Input file encoding. Example - PCM.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encoding")
    String encoding;

    /**
     * Input file sampleRate. Example - 16000
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sampleRateInHz")
    Integer sampleRateInHz;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
