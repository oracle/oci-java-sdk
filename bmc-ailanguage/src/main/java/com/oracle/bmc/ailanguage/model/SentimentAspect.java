/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Sentiment aspect object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SentimentAspect.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SentimentAspect {
    @Deprecated
    @java.beans.ConstructorProperties({"offset", "length", "text", "sentiment", "scores"})
    public SentimentAspect(
            Integer offset,
            Integer length,
            String text,
            String sentiment,
            java.util.Map<String, Double> scores) {
        super();
        this.offset = offset;
        this.length = length;
        this.text = text;
        this.sentiment = sentiment;
        this.scores = scores;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        public SentimentAspect build() {
            SentimentAspect __instance__ =
                    new SentimentAspect(offset, length, text, sentiment, scores);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SentimentAspect o) {
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The number of Unicode code points preceding this entity in the submitted text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    private final Integer offset;

    public Integer getOffset() {
        return offset;
    }

    /**
     * Length of aspect text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Integer length;

    public Integer getLength() {
        return length;
    }

    /**
     * Aspect text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    public String getText() {
        return text;
    }

    /**
     * The highest-score sentiment for the aspect text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sentiment")
    private final String sentiment;

    public String getSentiment() {
        return sentiment;
    }

    /**
     * Scores or confidences for each sentiment.
     * Example: {@code {"positive": 1.0, "negative": 0.0}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scores")
    private final java.util.Map<String, Double> scores;

    public java.util.Map<String, Double> getScores() {
        return scores;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SentimentAspect(");
        sb.append("offset=").append(String.valueOf(this.offset));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", sentiment=").append(String.valueOf(this.sentiment));
        sb.append(", scores=").append(String.valueOf(this.scores));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SentimentAspect)) {
            return false;
        }

        SentimentAspect other = (SentimentAspect) o;
        return java.util.Objects.equals(this.offset, other.offset)
                && java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.sentiment, other.sentiment)
                && java.util.Objects.equals(this.scores, other.scores)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.sentiment == null ? 43 : this.sentiment.hashCode());
        result = (result * PRIME) + (this.scores == null ? 43 : this.scores.hashCode());
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
