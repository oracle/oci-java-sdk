/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The document response for sentiment detect call.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SentimentDocumentResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SentimentDocumentResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("documentSentiment")
        private String documentSentiment;

        public Builder documentSentiment(String documentSentiment) {
            this.documentSentiment = documentSentiment;
            this.__explicitlySet__.add("documentSentiment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("documentScores")
        private java.util.Map<String, Double> documentScores;

        public Builder documentScores(java.util.Map<String, Double> documentScores) {
            this.documentScores = documentScores;
            this.__explicitlySet__.add("documentScores");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("aspects")
        private java.util.List<SentimentAspect> aspects;

        public Builder aspects(java.util.List<SentimentAspect> aspects) {
            this.aspects = aspects;
            this.__explicitlySet__.add("aspects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sentences")
        private java.util.List<SentimentSentence> sentences;

        public Builder sentences(java.util.List<SentimentSentence> sentences) {
            this.sentences = sentences;
            this.__explicitlySet__.add("sentences");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SentimentDocumentResult build() {
            SentimentDocumentResult __instance__ =
                    new SentimentDocumentResult(
                            key,
                            documentSentiment,
                            documentScores,
                            aspects,
                            sentences,
                            languageCode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SentimentDocumentResult o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .documentSentiment(o.getDocumentSentiment())
                            .documentScores(o.getDocumentScores())
                            .aspects(o.getAspects())
                            .sentences(o.getSentences())
                            .languageCode(o.getLanguageCode());

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
     * Document Unique Identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * Document level sentiment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentSentiment")
    String documentSentiment;

    /**
     * Scores for each sentiment.
     * Example: {"positive": 1.0, "negative": 0.0}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentScores")
    java.util.Map<String, Double> documentScores;

    /**
     * List of detected aspects sentiment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aspects")
    java.util.List<SentimentAspect> aspects;

    /**
     * List of detected sentences sentiment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sentences")
    java.util.List<SentimentSentence> sentences;

    /**
     * Language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    String languageCode;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
