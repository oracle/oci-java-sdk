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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TranscriptionNormalization.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TranscriptionNormalization {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isPunctuationEnabled")
        private Boolean isPunctuationEnabled;

        public Builder isPunctuationEnabled(Boolean isPunctuationEnabled) {
            this.isPunctuationEnabled = isPunctuationEnabled;
            this.__explicitlySet__.add("isPunctuationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<TranscriptionFilter> filters;

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

    /**
     * Whether to add punctuation in generated transcription. By default it is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPunctuationEnabled")
    Boolean isPunctuationEnabled;

    /**
     * List of filters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    java.util.List<TranscriptionFilter> filters;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
