/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Individual transcription tokens.
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
    builder = RealtimeMessageResultTranscriptionToken.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RealtimeMessageResultTranscriptionToken
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "token",
        "startTimeInMs",
        "endTimeInMs",
        "confidence",
        "type"
    })
    public RealtimeMessageResultTranscriptionToken(
            String token, Integer startTimeInMs, Integer endTimeInMs, Float confidence, Type type) {
        super();
        this.token = token;
        this.startTimeInMs = startTimeInMs;
        this.endTimeInMs = endTimeInMs;
        this.confidence = confidence;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Transcription token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("token")
        private String token;

        /**
         * Transcription token.
         * @param token the value to set
         * @return this builder
         **/
        public Builder token(String token) {
            this.token = token;
            this.__explicitlySet__.add("token");
            return this;
        }
        /**
         * Start time in milliseconds for the transcription token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTimeInMs")
        private Integer startTimeInMs;

        /**
         * Start time in milliseconds for the transcription token.
         * @param startTimeInMs the value to set
         * @return this builder
         **/
        public Builder startTimeInMs(Integer startTimeInMs) {
            this.startTimeInMs = startTimeInMs;
            this.__explicitlySet__.add("startTimeInMs");
            return this;
        }
        /**
         * End time in milliseconds for the transcription token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endTimeInMs")
        private Integer endTimeInMs;

        /**
         * End time in milliseconds for the transcription token.
         * @param endTimeInMs the value to set
         * @return this builder
         **/
        public Builder endTimeInMs(Integer endTimeInMs) {
            this.endTimeInMs = endTimeInMs;
            this.__explicitlySet__.add("endTimeInMs");
            return this;
        }
        /**
         * Confidence score for the transcription token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Float confidence;

        /**
         * Confidence score for the transcription token.
         * @param confidence the value to set
         * @return this builder
         **/
        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }
        /**
         * Type of the transcription token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Type of the transcription token.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RealtimeMessageResultTranscriptionToken build() {
            RealtimeMessageResultTranscriptionToken model =
                    new RealtimeMessageResultTranscriptionToken(
                            this.token,
                            this.startTimeInMs,
                            this.endTimeInMs,
                            this.confidence,
                            this.type);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RealtimeMessageResultTranscriptionToken model) {
            if (model.wasPropertyExplicitlySet("token")) {
                this.token(model.getToken());
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
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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
     * Transcription token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("token")
    private final String token;

    /**
     * Transcription token.
     * @return the value
     **/
    public String getToken() {
        return token;
    }

    /**
     * Start time in milliseconds for the transcription token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTimeInMs")
    private final Integer startTimeInMs;

    /**
     * Start time in milliseconds for the transcription token.
     * @return the value
     **/
    public Integer getStartTimeInMs() {
        return startTimeInMs;
    }

    /**
     * End time in milliseconds for the transcription token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTimeInMs")
    private final Integer endTimeInMs;

    /**
     * End time in milliseconds for the transcription token.
     * @return the value
     **/
    public Integer getEndTimeInMs() {
        return endTimeInMs;
    }

    /**
     * Confidence score for the transcription token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Float confidence;

    /**
     * Confidence score for the transcription token.
     * @return the value
     **/
    public Float getConfidence() {
        return confidence;
    }

    /**
     * Type of the transcription token.
     **/
    public enum Type {
        Word("WORD"),
        Punctuation("PUNCTUATION"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /**
     * Type of the transcription token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Type of the transcription token.
     * @return the value
     **/
    public Type getType() {
        return type;
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
        sb.append("RealtimeMessageResultTranscriptionToken(");
        sb.append("super=").append(super.toString());
        sb.append("token=").append(String.valueOf(this.token));
        sb.append(", startTimeInMs=").append(String.valueOf(this.startTimeInMs));
        sb.append(", endTimeInMs=").append(String.valueOf(this.endTimeInMs));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RealtimeMessageResultTranscriptionToken)) {
            return false;
        }

        RealtimeMessageResultTranscriptionToken other = (RealtimeMessageResultTranscriptionToken) o;
        return java.util.Objects.equals(this.token, other.token)
                && java.util.Objects.equals(this.startTimeInMs, other.startTimeInMs)
                && java.util.Objects.equals(this.endTimeInMs, other.endTimeInMs)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.type, other.type)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.token == null ? 43 : this.token.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimeInMs == null ? 43 : this.startTimeInMs.hashCode());
        result = (result * PRIME) + (this.endTimeInMs == null ? 43 : this.endTimeInMs.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
