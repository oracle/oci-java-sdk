/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * An object that contains the returned token and its corresponding likelihood. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TokenLikelihood.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TokenLikelihood
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"token", "likelihood"})
    public TokenLikelihood(String token, Double likelihood) {
        super();
        this.token = token;
        this.likelihood = likelihood;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A word, part of a word, or a punctuation.
         *
         * <p>For example, apple is a token and friendship is made up of two tokens, friend and
         * ship. When you run a model, you can set the maximum number of output tokens. Estimate
         * three tokens per word.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("token")
        private String token;

        /**
         * A word, part of a word, or a punctuation.
         *
         * <p>For example, apple is a token and friendship is made up of two tokens, friend and
         * ship. When you run a model, you can set the maximum number of output tokens. Estimate
         * three tokens per word.
         *
         * @param token the value to set
         * @return this builder
         */
        public Builder token(String token) {
            this.token = token;
            this.__explicitlySet__.add("token");
            return this;
        }
        /** The likelihood of this token during generation. */
        @com.fasterxml.jackson.annotation.JsonProperty("likelihood")
        private Double likelihood;

        /**
         * The likelihood of this token during generation.
         *
         * @param likelihood the value to set
         * @return this builder
         */
        public Builder likelihood(Double likelihood) {
            this.likelihood = likelihood;
            this.__explicitlySet__.add("likelihood");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TokenLikelihood build() {
            TokenLikelihood model = new TokenLikelihood(this.token, this.likelihood);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TokenLikelihood model) {
            if (model.wasPropertyExplicitlySet("token")) {
                this.token(model.getToken());
            }
            if (model.wasPropertyExplicitlySet("likelihood")) {
                this.likelihood(model.getLikelihood());
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

    /**
     * A word, part of a word, or a punctuation.
     *
     * <p>For example, apple is a token and friendship is made up of two tokens, friend and ship.
     * When you run a model, you can set the maximum number of output tokens. Estimate three tokens
     * per word.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("token")
    private final String token;

    /**
     * A word, part of a word, or a punctuation.
     *
     * <p>For example, apple is a token and friendship is made up of two tokens, friend and ship.
     * When you run a model, you can set the maximum number of output tokens. Estimate three tokens
     * per word.
     *
     * @return the value
     */
    public String getToken() {
        return token;
    }

    /** The likelihood of this token during generation. */
    @com.fasterxml.jackson.annotation.JsonProperty("likelihood")
    private final Double likelihood;

    /**
     * The likelihood of this token during generation.
     *
     * @return the value
     */
    public Double getLikelihood() {
        return likelihood;
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
        sb.append("TokenLikelihood(");
        sb.append("super=").append(super.toString());
        sb.append("token=").append(String.valueOf(this.token));
        sb.append(", likelihood=").append(String.valueOf(this.likelihood));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TokenLikelihood)) {
            return false;
        }

        TokenLikelihood other = (TokenLikelihood) o;
        return java.util.Objects.equals(this.token, other.token)
                && java.util.Objects.equals(this.likelihood, other.likelihood)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.token == null ? 43 : this.token.hashCode());
        result = (result * PRIME) + (this.likelihood == null ? 43 : this.likelihood.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
