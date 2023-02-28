/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Profanity transcription filter to recognize profane words. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProfanityTranscriptionFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ProfanityTranscriptionFilter extends TranscriptionFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * - {@code MASK}: Will mask detected profanity in transcription. - {@code REMOVE}: Will
         * replace profane word with * in transcription. - {@code TAG}: Will tag profane word as
         * profanity but will show actual word.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        /**
         * - {@code MASK}: Will mask detected profanity in transcription. - {@code REMOVE}: Will
         * replace profane word with * in transcription. - {@code TAG}: Will tag profane word as
         * profanity but will show actual word.
         *
         * @param mode the value to set
         * @return this builder
         */
        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProfanityTranscriptionFilter build() {
            ProfanityTranscriptionFilter model = new ProfanityTranscriptionFilter(this.mode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProfanityTranscriptionFilter model) {
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
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
    public ProfanityTranscriptionFilter(Mode mode) {
        super();
        this.mode = mode;
    }

    /**
     * - {@code MASK}: Will mask detected profanity in transcription. - {@code REMOVE}: Will replace
     * profane word with * in transcription. - {@code TAG}: Will tag profane word as profanity but
     * will show actual word.
     */
    public enum Mode implements com.oracle.bmc.http.internal.BmcEnum {
        Mask("MASK"),
        Remove("REMOVE"),
        Tag("TAG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Mode.class);

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Mode', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * - {@code MASK}: Will mask detected profanity in transcription. - {@code REMOVE}: Will replace
     * profane word with * in transcription. - {@code TAG}: Will tag profane word as profanity but
     * will show actual word.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final Mode mode;

    /**
     * - {@code MASK}: Will mask detected profanity in transcription. - {@code REMOVE}: Will replace
     * profane word with * in transcription. - {@code TAG}: Will tag profane word as profanity but
     * will show actual word.
     *
     * @return the value
     */
    public Mode getMode() {
        return mode;
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
        sb.append("ProfanityTranscriptionFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProfanityTranscriptionFilter)) {
            return false;
        }

        ProfanityTranscriptionFilter other = (ProfanityTranscriptionFilter) o;
        return java.util.Objects.equals(this.mode, other.mode) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        return result;
    }
}
