/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Information to Normalize generated transcript. <br>
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
        builder = TranscriptionNormalization.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TranscriptionNormalization
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isPunctuationEnabled", "filters"})
    public TranscriptionNormalization(
            Boolean isPunctuationEnabled, java.util.List<TranscriptionFilter> filters) {
        super();
        this.isPunctuationEnabled = isPunctuationEnabled;
        this.filters = filters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Whether to add punctuation in the generated transcription. Enabled by default. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPunctuationEnabled")
        private Boolean isPunctuationEnabled;

        /**
         * Whether to add punctuation in the generated transcription. Enabled by default.
         *
         * @param isPunctuationEnabled the value to set
         * @return this builder
         */
        public Builder isPunctuationEnabled(Boolean isPunctuationEnabled) {
            this.isPunctuationEnabled = isPunctuationEnabled;
            this.__explicitlySet__.add("isPunctuationEnabled");
            return this;
        }
        /** List of filters. */
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<TranscriptionFilter> filters;

        /**
         * List of filters.
         *
         * @param filters the value to set
         * @return this builder
         */
        public Builder filters(java.util.List<TranscriptionFilter> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TranscriptionNormalization build() {
            TranscriptionNormalization model =
                    new TranscriptionNormalization(this.isPunctuationEnabled, this.filters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TranscriptionNormalization model) {
            if (model.wasPropertyExplicitlySet("isPunctuationEnabled")) {
                this.isPunctuationEnabled(model.getIsPunctuationEnabled());
            }
            if (model.wasPropertyExplicitlySet("filters")) {
                this.filters(model.getFilters());
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

    /** Whether to add punctuation in the generated transcription. Enabled by default. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPunctuationEnabled")
    private final Boolean isPunctuationEnabled;

    /**
     * Whether to add punctuation in the generated transcription. Enabled by default.
     *
     * @return the value
     */
    public Boolean getIsPunctuationEnabled() {
        return isPunctuationEnabled;
    }

    /** List of filters. */
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<TranscriptionFilter> filters;

    /**
     * List of filters.
     *
     * @return the value
     */
    public java.util.List<TranscriptionFilter> getFilters() {
        return filters;
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
        sb.append("TranscriptionNormalization(");
        sb.append("super=").append(super.toString());
        sb.append("isPunctuationEnabled=").append(String.valueOf(this.isPunctuationEnabled));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TranscriptionNormalization)) {
            return false;
        }

        TranscriptionNormalization other = (TranscriptionNormalization) o;
        return java.util.Objects.equals(this.isPunctuationEnabled, other.isPunctuationEnabled)
                && java.util.Objects.equals(this.filters, other.filters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isPunctuationEnabled == null
                                ? 43
                                : this.isPunctuationEnabled.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
