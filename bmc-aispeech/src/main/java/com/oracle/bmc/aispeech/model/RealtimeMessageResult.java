/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * The websocket result message received from service. <br>
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
        builder = RealtimeMessageResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "event")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RealtimeMessageResult extends RealtimeMessage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sessionId")
        private String sessionId;

        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            this.__explicitlySet__.add("sessionId");
            return this;
        }
        /** List of transcription objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("transcriptions")
        private java.util.List<RealtimeMessageResultTranscription> transcriptions;

        /**
         * List of transcription objects.
         *
         * @param transcriptions the value to set
         * @return this builder
         */
        public Builder transcriptions(
                java.util.List<RealtimeMessageResultTranscription> transcriptions) {
            this.transcriptions = transcriptions;
            this.__explicitlySet__.add("transcriptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RealtimeMessageResult build() {
            RealtimeMessageResult model =
                    new RealtimeMessageResult(this.sessionId, this.transcriptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RealtimeMessageResult model) {
            if (model.wasPropertyExplicitlySet("sessionId")) {
                this.sessionId(model.getSessionId());
            }
            if (model.wasPropertyExplicitlySet("transcriptions")) {
                this.transcriptions(model.getTranscriptions());
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
    public RealtimeMessageResult(
            String sessionId, java.util.List<RealtimeMessageResultTranscription> transcriptions) {
        super(sessionId);
        this.transcriptions = transcriptions;
    }

    /** List of transcription objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("transcriptions")
    private final java.util.List<RealtimeMessageResultTranscription> transcriptions;

    /**
     * List of transcription objects.
     *
     * @return the value
     */
    public java.util.List<RealtimeMessageResultTranscription> getTranscriptions() {
        return transcriptions;
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
        sb.append("RealtimeMessageResult(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", transcriptions=").append(String.valueOf(this.transcriptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RealtimeMessageResult)) {
            return false;
        }

        RealtimeMessageResult other = (RealtimeMessageResult) o;
        return java.util.Objects.equals(this.transcriptions, other.transcriptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.transcriptions == null ? 43 : this.transcriptions.hashCode());
        return result;
    }
}
