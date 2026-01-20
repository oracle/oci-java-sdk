/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Processes to perform on the generated transcription. <br>
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
        builder = TranscriptionSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TranscriptionSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"diarization", "additionalSettings"})
    public TranscriptionSettings(
            Diarization diarization, java.util.Map<String, String> additionalSettings) {
        super();
        this.diarization = diarization;
        this.additionalSettings = additionalSettings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("diarization")
        private Diarization diarization;

        public Builder diarization(Diarization diarization) {
            this.diarization = diarization;
            this.__explicitlySet__.add("diarization");
            return this;
        }
        /**
         * Simple key-value pair for setting model specific properties. For more details, refer the
         * documentation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalSettings")
        private java.util.Map<String, String> additionalSettings;

        /**
         * Simple key-value pair for setting model specific properties. For more details, refer the
         * documentation.
         *
         * @param additionalSettings the value to set
         * @return this builder
         */
        public Builder additionalSettings(java.util.Map<String, String> additionalSettings) {
            this.additionalSettings = additionalSettings;
            this.__explicitlySet__.add("additionalSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TranscriptionSettings build() {
            TranscriptionSettings model =
                    new TranscriptionSettings(this.diarization, this.additionalSettings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TranscriptionSettings model) {
            if (model.wasPropertyExplicitlySet("diarization")) {
                this.diarization(model.getDiarization());
            }
            if (model.wasPropertyExplicitlySet("additionalSettings")) {
                this.additionalSettings(model.getAdditionalSettings());
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

    @com.fasterxml.jackson.annotation.JsonProperty("diarization")
    private final Diarization diarization;

    public Diarization getDiarization() {
        return diarization;
    }

    /**
     * Simple key-value pair for setting model specific properties. For more details, refer the
     * documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalSettings")
    private final java.util.Map<String, String> additionalSettings;

    /**
     * Simple key-value pair for setting model specific properties. For more details, refer the
     * documentation.
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalSettings() {
        return additionalSettings;
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
        sb.append("TranscriptionSettings(");
        sb.append("super=").append(super.toString());
        sb.append("diarization=").append(String.valueOf(this.diarization));
        sb.append(", additionalSettings=").append(String.valueOf(this.additionalSettings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TranscriptionSettings)) {
            return false;
        }

        TranscriptionSettings other = (TranscriptionSettings) o;
        return java.util.Objects.equals(this.diarization, other.diarization)
                && java.util.Objects.equals(this.additionalSettings, other.additionalSettings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.diarization == null ? 43 : this.diarization.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalSettings == null
                                ? 43
                                : this.additionalSettings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
