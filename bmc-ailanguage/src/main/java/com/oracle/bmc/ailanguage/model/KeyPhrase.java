/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Key phrase for the given text.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KeyPhrase.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class KeyPhrase {
    @Deprecated
    @java.beans.ConstructorProperties({"text", "score"})
    public KeyPhrase(String text, Double score) {
        super();
        this.text = text;
        this.score = score;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Key phrase exreacted from given text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * Key phrase exreacted from given text.
         * @param text the value to set
         * @return this builder
         **/
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /**
         * Score or confidence of the key phrase.
         * Example: {@code 0.9999856066867399}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Double score;

        /**
         * Score or confidence of the key phrase.
         * Example: {@code 0.9999856066867399}
         *
         * @param score the value to set
         * @return this builder
         **/
        public Builder score(Double score) {
            this.score = score;
            this.__explicitlySet__.add("score");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyPhrase build() {
            KeyPhrase __instance__ = new KeyPhrase(text, score);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyPhrase o) {
            Builder copiedBuilder = text(o.getText()).score(o.getScore());

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
     * Key phrase exreacted from given text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * Key phrase exreacted from given text.
     * @return the value
     **/
    public String getText() {
        return text;
    }

    /**
     * Score or confidence of the key phrase.
     * Example: {@code 0.9999856066867399}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    private final Double score;

    /**
     * Score or confidence of the key phrase.
     * Example: {@code 0.9999856066867399}
     *
     * @return the value
     **/
    public Double getScore() {
        return score;
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
        sb.append("KeyPhrase(");
        sb.append("text=").append(String.valueOf(this.text));
        sb.append(", score=").append(String.valueOf(this.score));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyPhrase)) {
            return false;
        }

        KeyPhrase other = (KeyPhrase) o;
        return java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.score, other.score)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.score == null ? 43 : this.score.hashCode());
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
