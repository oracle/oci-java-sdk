/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Speaker diarization is a combination of speaker segmentation and speaker clustering. Provide
 * diarization details to enable this feature. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Diarization.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Diarization extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isDiarizationEnabled", "numberOfSpeakers"})
    public Diarization(Boolean isDiarizationEnabled, Integer numberOfSpeakers) {
        super();
        this.isDiarizationEnabled = isDiarizationEnabled;
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Set true to enable Speaker diarization and tag transcription with speaker tags. By
         * default this is disabled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDiarizationEnabled")
        private Boolean isDiarizationEnabled;

        /**
         * Set true to enable Speaker diarization and tag transcription with speaker tags. By
         * default this is disabled.
         *
         * @param isDiarizationEnabled the value to set
         * @return this builder
         */
        public Builder isDiarizationEnabled(Boolean isDiarizationEnabled) {
            this.isDiarizationEnabled = isDiarizationEnabled;
            this.__explicitlySet__.add("isDiarizationEnabled");
            return this;
        }
        /**
         * Number of speakers in the audio provided. By default service will auto detect all
         * speakers in audio file
         */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfSpeakers")
        private Integer numberOfSpeakers;

        /**
         * Number of speakers in the audio provided. By default service will auto detect all
         * speakers in audio file
         *
         * @param numberOfSpeakers the value to set
         * @return this builder
         */
        public Builder numberOfSpeakers(Integer numberOfSpeakers) {
            this.numberOfSpeakers = numberOfSpeakers;
            this.__explicitlySet__.add("numberOfSpeakers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Diarization build() {
            Diarization model = new Diarization(this.isDiarizationEnabled, this.numberOfSpeakers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Diarization model) {
            if (model.wasPropertyExplicitlySet("isDiarizationEnabled")) {
                this.isDiarizationEnabled(model.getIsDiarizationEnabled());
            }
            if (model.wasPropertyExplicitlySet("numberOfSpeakers")) {
                this.numberOfSpeakers(model.getNumberOfSpeakers());
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
     * Set true to enable Speaker diarization and tag transcription with speaker tags. By default
     * this is disabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDiarizationEnabled")
    private final Boolean isDiarizationEnabled;

    /**
     * Set true to enable Speaker diarization and tag transcription with speaker tags. By default
     * this is disabled.
     *
     * @return the value
     */
    public Boolean getIsDiarizationEnabled() {
        return isDiarizationEnabled;
    }

    /**
     * Number of speakers in the audio provided. By default service will auto detect all speakers in
     * audio file
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfSpeakers")
    private final Integer numberOfSpeakers;

    /**
     * Number of speakers in the audio provided. By default service will auto detect all speakers in
     * audio file
     *
     * @return the value
     */
    public Integer getNumberOfSpeakers() {
        return numberOfSpeakers;
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
        sb.append("Diarization(");
        sb.append("super=").append(super.toString());
        sb.append("isDiarizationEnabled=").append(String.valueOf(this.isDiarizationEnabled));
        sb.append(", numberOfSpeakers=").append(String.valueOf(this.numberOfSpeakers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Diarization)) {
            return false;
        }

        Diarization other = (Diarization) o;
        return java.util.Objects.equals(this.isDiarizationEnabled, other.isDiarizationEnabled)
                && java.util.Objects.equals(this.numberOfSpeakers, other.numberOfSpeakers)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isDiarizationEnabled == null
                                ? 43
                                : this.isDiarizationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfSpeakers == null ? 43 : this.numberOfSpeakers.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
