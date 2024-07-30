/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Pronunciation Object Reference <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Pronunciation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Pronunciation extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"soundsLike", "audio"})
    public Pronunciation(String soundsLike, LocationDetails audio) {
        super();
        this.soundsLike = soundsLike;
        this.audio = audio;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Written phonetic representation of entity value */
        @com.fasterxml.jackson.annotation.JsonProperty("soundsLike")
        private String soundsLike;

        /**
         * Written phonetic representation of entity value
         *
         * @param soundsLike the value to set
         * @return this builder
         */
        public Builder soundsLike(String soundsLike) {
            this.soundsLike = soundsLike;
            this.__explicitlySet__.add("soundsLike");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("audio")
        private LocationDetails audio;

        public Builder audio(LocationDetails audio) {
            this.audio = audio;
            this.__explicitlySet__.add("audio");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Pronunciation build() {
            Pronunciation model = new Pronunciation(this.soundsLike, this.audio);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Pronunciation model) {
            if (model.wasPropertyExplicitlySet("soundsLike")) {
                this.soundsLike(model.getSoundsLike());
            }
            if (model.wasPropertyExplicitlySet("audio")) {
                this.audio(model.getAudio());
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

    /** Written phonetic representation of entity value */
    @com.fasterxml.jackson.annotation.JsonProperty("soundsLike")
    private final String soundsLike;

    /**
     * Written phonetic representation of entity value
     *
     * @return the value
     */
    public String getSoundsLike() {
        return soundsLike;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("audio")
    private final LocationDetails audio;

    public LocationDetails getAudio() {
        return audio;
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
        sb.append("Pronunciation(");
        sb.append("super=").append(super.toString());
        sb.append("soundsLike=").append(String.valueOf(this.soundsLike));
        sb.append(", audio=").append(String.valueOf(this.audio));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pronunciation)) {
            return false;
        }

        Pronunciation other = (Pronunciation) o;
        return java.util.Objects.equals(this.soundsLike, other.soundsLike)
                && java.util.Objects.equals(this.audio, other.audio)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.soundsLike == null ? 43 : this.soundsLike.hashCode());
        result = (result * PRIME) + (this.audio == null ? 43 : this.audio.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
