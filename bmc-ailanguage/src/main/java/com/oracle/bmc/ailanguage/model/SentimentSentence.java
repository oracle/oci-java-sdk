/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Sentiment sentence object.
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
    builder = SentimentSentence.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SentimentSentence {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private Integer offset;

        public Builder offset(Integer offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Integer length;

        public Builder length(Integer length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sentiment")
        private String sentiment;

        public Builder sentiment(String sentiment) {
            this.sentiment = sentiment;
            this.__explicitlySet__.add("sentiment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scores")
        private java.util.Map<String, Double> scores;

        public Builder scores(java.util.Map<String, Double> scores) {
            this.scores = scores;
            this.__explicitlySet__.add("scores");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SentimentSentence build() {
            SentimentSentence __instance__ =
                    new SentimentSentence(offset, length, text, sentiment, scores);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SentimentSentence o) {
            Builder copiedBuilder =
                    offset(o.getOffset())
                            .length(o.getLength())
                            .text(o.getText())
                            .sentiment(o.getSentiment())
                            .scores(o.getScores());

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
     * The number of Unicode code points preceding this entity in the submitted text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    Integer offset;

    /**
     * Length of sentence text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    Integer length;

    /**
     * Sentence text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    String text;

    /**
     * The highest-score sentiment for the sentence text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sentiment")
    String sentiment;

    /**
     * Scores or confidences for each sentiment.
     * Example: {@code {"positive": 1.0, "negative": 0.0}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scores")
    java.util.Map<String, Double> scores;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
