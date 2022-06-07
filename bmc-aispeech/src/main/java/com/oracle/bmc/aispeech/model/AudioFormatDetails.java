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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AudioFormatDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AudioFormatDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"format", "numberOfChannels", "encoding", "sampleRateInHz"})
    public AudioFormatDetails(
            String format, Integer numberOfChannels, String encoding, Integer sampleRateInHz) {
        super();
        this.format = format;
        this.numberOfChannels = numberOfChannels;
        this.encoding = encoding;
        this.sampleRateInHz = sampleRateInHz;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Input file format. Example - WAV.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final String format;

    public String getFormat() {
        return format;
    }

    /**
     * Input file number of channels.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfChannels")
    private final Integer numberOfChannels;

    public Integer getNumberOfChannels() {
        return numberOfChannels;
    }

    /**
     * Input file encoding. Example - PCM.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encoding")
    private final String encoding;

    public String getEncoding() {
        return encoding;
    }

    /**
     * Input file sampleRate. Example - 16000
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sampleRateInHz")
    private final Integer sampleRateInHz;

    public Integer getSampleRateInHz() {
        return sampleRateInHz;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AudioFormatDetails(");
        sb.append("format=").append(String.valueOf(this.format));
        sb.append(", numberOfChannels=").append(String.valueOf(this.numberOfChannels));
        sb.append(", encoding=").append(String.valueOf(this.encoding));
        sb.append(", sampleRateInHz=").append(String.valueOf(this.sampleRateInHz));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AudioFormatDetails)) {
            return false;
        }

        AudioFormatDetails other = (AudioFormatDetails) o;
        return java.util.Objects.equals(this.format, other.format)
                && java.util.Objects.equals(this.numberOfChannels, other.numberOfChannels)
                && java.util.Objects.equals(this.encoding, other.encoding)
                && java.util.Objects.equals(this.sampleRateInHz, other.sampleRateInHz)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfChannels == null ? 43 : this.numberOfChannels.hashCode());
        result = (result * PRIME) + (this.encoding == null ? 43 : this.encoding.hashCode());
        result =
                (result * PRIME)
                        + (this.sampleRateInHz == null ? 43 : this.sampleRateInHz.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
