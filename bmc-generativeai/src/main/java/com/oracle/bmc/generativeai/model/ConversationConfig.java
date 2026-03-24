/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Holds configuration related to conversation retention <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConversationConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConversationConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "responsesRetentionInHours",
        "conversationsRetentionInHours"
    })
    public ConversationConfig(
            Integer responsesRetentionInHours, Integer conversationsRetentionInHours) {
        super();
        this.responsesRetentionInHours = responsesRetentionInHours;
        this.conversationsRetentionInHours = conversationsRetentionInHours;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Retention period (in hours) for responses. The TTL starts from the time the response was
         * created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("responsesRetentionInHours")
        private Integer responsesRetentionInHours;

        /**
         * Retention period (in hours) for responses. The TTL starts from the time the response was
         * created.
         *
         * @param responsesRetentionInHours the value to set
         * @return this builder
         */
        public Builder responsesRetentionInHours(Integer responsesRetentionInHours) {
            this.responsesRetentionInHours = responsesRetentionInHours;
            this.__explicitlySet__.add("responsesRetentionInHours");
            return this;
        }
        /**
         * Retention period (in hours) for conversations. The TTL starts from the time the
         * conversation was last updated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("conversationsRetentionInHours")
        private Integer conversationsRetentionInHours;

        /**
         * Retention period (in hours) for conversations. The TTL starts from the time the
         * conversation was last updated.
         *
         * @param conversationsRetentionInHours the value to set
         * @return this builder
         */
        public Builder conversationsRetentionInHours(Integer conversationsRetentionInHours) {
            this.conversationsRetentionInHours = conversationsRetentionInHours;
            this.__explicitlySet__.add("conversationsRetentionInHours");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConversationConfig build() {
            ConversationConfig model =
                    new ConversationConfig(
                            this.responsesRetentionInHours, this.conversationsRetentionInHours);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConversationConfig model) {
            if (model.wasPropertyExplicitlySet("responsesRetentionInHours")) {
                this.responsesRetentionInHours(model.getResponsesRetentionInHours());
            }
            if (model.wasPropertyExplicitlySet("conversationsRetentionInHours")) {
                this.conversationsRetentionInHours(model.getConversationsRetentionInHours());
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
     * Retention period (in hours) for responses. The TTL starts from the time the response was
     * created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("responsesRetentionInHours")
    private final Integer responsesRetentionInHours;

    /**
     * Retention period (in hours) for responses. The TTL starts from the time the response was
     * created.
     *
     * @return the value
     */
    public Integer getResponsesRetentionInHours() {
        return responsesRetentionInHours;
    }

    /**
     * Retention period (in hours) for conversations. The TTL starts from the time the conversation
     * was last updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conversationsRetentionInHours")
    private final Integer conversationsRetentionInHours;

    /**
     * Retention period (in hours) for conversations. The TTL starts from the time the conversation
     * was last updated.
     *
     * @return the value
     */
    public Integer getConversationsRetentionInHours() {
        return conversationsRetentionInHours;
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
        sb.append("ConversationConfig(");
        sb.append("super=").append(super.toString());
        sb.append("responsesRetentionInHours=")
                .append(String.valueOf(this.responsesRetentionInHours));
        sb.append(", conversationsRetentionInHours=")
                .append(String.valueOf(this.conversationsRetentionInHours));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConversationConfig)) {
            return false;
        }

        ConversationConfig other = (ConversationConfig) o;
        return java.util.Objects.equals(
                        this.responsesRetentionInHours, other.responsesRetentionInHours)
                && java.util.Objects.equals(
                        this.conversationsRetentionInHours, other.conversationsRetentionInHours)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.responsesRetentionInHours == null
                                ? 43
                                : this.responsesRetentionInHours.hashCode());
        result =
                (result * PRIME)
                        + (this.conversationsRetentionInHours == null
                                ? 43
                                : this.conversationsRetentionInHours.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
