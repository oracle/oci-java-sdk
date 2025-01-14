/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * The text generated during each run. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GeneratedText.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GeneratedText extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "text",
        "likelihood",
        "finishReason",
        "tokenLikelihoods"
    })
    public GeneratedText(
            String id,
            String text,
            Double likelihood,
            String finishReason,
            java.util.List<TokenLikelihood> tokenLikelihoods) {
        super();
        this.id = id;
        this.text = text;
        this.likelihood = likelihood;
        this.finishReason = finishReason;
        this.tokenLikelihoods = tokenLikelihoods;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A unique identifier for this text generation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier for this text generation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The generated text. */
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * The generated text.
         *
         * @param text the value to set
         * @return this builder
         */
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /**
         * The overall likelihood of the generated text.
         *
         * <p>When a large language model generates a new token for the output text, a likelihood is
         * assigned to all tokens, where tokens with higher likelihoods are more likely to follow
         * the current token. For example, it's more likely that the word favorite is followed by
         * the word food or book rather than the word zebra. A lower likelihood means that it's less
         * likely that token follows the current token.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("likelihood")
        private Double likelihood;

        /**
         * The overall likelihood of the generated text.
         *
         * <p>When a large language model generates a new token for the output text, a likelihood is
         * assigned to all tokens, where tokens with higher likelihoods are more likely to follow
         * the current token. For example, it's more likely that the word favorite is followed by
         * the word food or book rather than the word zebra. A lower likelihood means that it's less
         * likely that token follows the current token.
         *
         * @param likelihood the value to set
         * @return this builder
         */
        public Builder likelihood(Double likelihood) {
            this.likelihood = likelihood;
            this.__explicitlySet__.add("likelihood");
            return this;
        }
        /**
         * The reason why the model stopped generating tokens.
         *
         * <p>A model stops generating tokens if the model hits a natural stop point or reaches a
         * provided stop sequence.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("finishReason")
        private String finishReason;

        /**
         * The reason why the model stopped generating tokens.
         *
         * <p>A model stops generating tokens if the model hits a natural stop point or reaches a
         * provided stop sequence.
         *
         * @param finishReason the value to set
         * @return this builder
         */
        public Builder finishReason(String finishReason) {
            this.finishReason = finishReason;
            this.__explicitlySet__.add("finishReason");
            return this;
        }
        /** A collection of generated tokens and their corresponding likelihoods. */
        @com.fasterxml.jackson.annotation.JsonProperty("tokenLikelihoods")
        private java.util.List<TokenLikelihood> tokenLikelihoods;

        /**
         * A collection of generated tokens and their corresponding likelihoods.
         *
         * @param tokenLikelihoods the value to set
         * @return this builder
         */
        public Builder tokenLikelihoods(java.util.List<TokenLikelihood> tokenLikelihoods) {
            this.tokenLikelihoods = tokenLikelihoods;
            this.__explicitlySet__.add("tokenLikelihoods");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GeneratedText build() {
            GeneratedText model =
                    new GeneratedText(
                            this.id,
                            this.text,
                            this.likelihood,
                            this.finishReason,
                            this.tokenLikelihoods);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GeneratedText model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("likelihood")) {
                this.likelihood(model.getLikelihood());
            }
            if (model.wasPropertyExplicitlySet("finishReason")) {
                this.finishReason(model.getFinishReason());
            }
            if (model.wasPropertyExplicitlySet("tokenLikelihoods")) {
                this.tokenLikelihoods(model.getTokenLikelihoods());
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

    /** A unique identifier for this text generation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier for this text generation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The generated text. */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * The generated text.
     *
     * @return the value
     */
    public String getText() {
        return text;
    }

    /**
     * The overall likelihood of the generated text.
     *
     * <p>When a large language model generates a new token for the output text, a likelihood is
     * assigned to all tokens, where tokens with higher likelihoods are more likely to follow the
     * current token. For example, it's more likely that the word favorite is followed by the word
     * food or book rather than the word zebra. A lower likelihood means that it's less likely that
     * token follows the current token.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("likelihood")
    private final Double likelihood;

    /**
     * The overall likelihood of the generated text.
     *
     * <p>When a large language model generates a new token for the output text, a likelihood is
     * assigned to all tokens, where tokens with higher likelihoods are more likely to follow the
     * current token. For example, it's more likely that the word favorite is followed by the word
     * food or book rather than the word zebra. A lower likelihood means that it's less likely that
     * token follows the current token.
     *
     * @return the value
     */
    public Double getLikelihood() {
        return likelihood;
    }

    /**
     * The reason why the model stopped generating tokens.
     *
     * <p>A model stops generating tokens if the model hits a natural stop point or reaches a
     * provided stop sequence.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("finishReason")
    private final String finishReason;

    /**
     * The reason why the model stopped generating tokens.
     *
     * <p>A model stops generating tokens if the model hits a natural stop point or reaches a
     * provided stop sequence.
     *
     * @return the value
     */
    public String getFinishReason() {
        return finishReason;
    }

    /** A collection of generated tokens and their corresponding likelihoods. */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenLikelihoods")
    private final java.util.List<TokenLikelihood> tokenLikelihoods;

    /**
     * A collection of generated tokens and their corresponding likelihoods.
     *
     * @return the value
     */
    public java.util.List<TokenLikelihood> getTokenLikelihoods() {
        return tokenLikelihoods;
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
        sb.append("GeneratedText(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", likelihood=").append(String.valueOf(this.likelihood));
        sb.append(", finishReason=").append(String.valueOf(this.finishReason));
        sb.append(", tokenLikelihoods=").append(String.valueOf(this.tokenLikelihoods));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GeneratedText)) {
            return false;
        }

        GeneratedText other = (GeneratedText) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.likelihood, other.likelihood)
                && java.util.Objects.equals(this.finishReason, other.finishReason)
                && java.util.Objects.equals(this.tokenLikelihoods, other.tokenLikelihoods)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.likelihood == null ? 43 : this.likelihood.hashCode());
        result = (result * PRIME) + (this.finishReason == null ? 43 : this.finishReason.hashCode());
        result =
                (result * PRIME)
                        + (this.tokenLikelihoods == null ? 43 : this.tokenLikelihoods.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
