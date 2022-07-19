/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Information to Normalize generated transcript.
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
    builder = TranscriptionNormalization.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TranscriptionNormalization {
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
        /**
         * Whether to add punctuation in generated transcription. By default it is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPunctuationEnabled")
        private Boolean isPunctuationEnabled;

        /**
         * Whether to add punctuation in generated transcription. By default it is enabled.
         * @param isPunctuationEnabled the value to set
         * @return this builder
         **/
        public Builder isPunctuationEnabled(Boolean isPunctuationEnabled) {
            this.isPunctuationEnabled = isPunctuationEnabled;
            this.__explicitlySet__.add("isPunctuationEnabled");
            return this;
        }
        /**
         * List of filters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<TranscriptionFilter> filters;

        /**
         * List of filters.
         * @param filters the value to set
         * @return this builder
         **/
        public Builder filters(java.util.List<TranscriptionFilter> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TranscriptionNormalization build() {
            TranscriptionNormalization __instance__ =
                    new TranscriptionNormalization(isPunctuationEnabled, filters);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TranscriptionNormalization o) {
            Builder copiedBuilder =
                    isPunctuationEnabled(o.getIsPunctuationEnabled()).filters(o.getFilters());

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
     * Whether to add punctuation in generated transcription. By default it is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPunctuationEnabled")
    private final Boolean isPunctuationEnabled;

    /**
     * Whether to add punctuation in generated transcription. By default it is enabled.
     * @return the value
     **/
    public Boolean getIsPunctuationEnabled() {
        return isPunctuationEnabled;
    }

    /**
     * List of filters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<TranscriptionFilter> filters;

    /**
     * List of filters.
     * @return the value
     **/
    public java.util.List<TranscriptionFilter> getFilters() {
        return filters;
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
        sb.append("TranscriptionNormalization(");
        sb.append("isPunctuationEnabled=").append(String.valueOf(this.isPunctuationEnabled));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
