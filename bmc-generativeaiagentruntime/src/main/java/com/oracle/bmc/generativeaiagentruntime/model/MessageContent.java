/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * The content of the message. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MessageContent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MessageContent
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"text", "citations", "paragraphCitations"})
    public MessageContent(
            String text,
            java.util.List<Citation> citations,
            java.util.List<ParagraphCitation> paragraphCitations) {
        super();
        this.text = text;
        this.citations = citations;
        this.paragraphCitations = paragraphCitations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The content of the message. */
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * The content of the message.
         *
         * @param text the value to set
         * @return this builder
         */
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /** Citations to data sources used for generating an agent's message. */
        @com.fasterxml.jackson.annotation.JsonProperty("citations")
        private java.util.List<Citation> citations;

        /**
         * Citations to data sources used for generating an agent's message.
         *
         * @param citations the value to set
         * @return this builder
         */
        public Builder citations(java.util.List<Citation> citations) {
            this.citations = citations;
            this.__explicitlySet__.add("citations");
            return this;
        }
        /** A list of citations used to generate the paragraphs of the agent message. */
        @com.fasterxml.jackson.annotation.JsonProperty("paragraphCitations")
        private java.util.List<ParagraphCitation> paragraphCitations;

        /**
         * A list of citations used to generate the paragraphs of the agent message.
         *
         * @param paragraphCitations the value to set
         * @return this builder
         */
        public Builder paragraphCitations(java.util.List<ParagraphCitation> paragraphCitations) {
            this.paragraphCitations = paragraphCitations;
            this.__explicitlySet__.add("paragraphCitations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MessageContent build() {
            MessageContent model =
                    new MessageContent(this.text, this.citations, this.paragraphCitations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MessageContent model) {
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("citations")) {
                this.citations(model.getCitations());
            }
            if (model.wasPropertyExplicitlySet("paragraphCitations")) {
                this.paragraphCitations(model.getParagraphCitations());
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

    /** The content of the message. */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * The content of the message.
     *
     * @return the value
     */
    public String getText() {
        return text;
    }

    /** Citations to data sources used for generating an agent's message. */
    @com.fasterxml.jackson.annotation.JsonProperty("citations")
    private final java.util.List<Citation> citations;

    /**
     * Citations to data sources used for generating an agent's message.
     *
     * @return the value
     */
    public java.util.List<Citation> getCitations() {
        return citations;
    }

    /** A list of citations used to generate the paragraphs of the agent message. */
    @com.fasterxml.jackson.annotation.JsonProperty("paragraphCitations")
    private final java.util.List<ParagraphCitation> paragraphCitations;

    /**
     * A list of citations used to generate the paragraphs of the agent message.
     *
     * @return the value
     */
    public java.util.List<ParagraphCitation> getParagraphCitations() {
        return paragraphCitations;
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
        sb.append("MessageContent(");
        sb.append("super=").append(super.toString());
        sb.append("text=").append(String.valueOf(this.text));
        sb.append(", citations=").append(String.valueOf(this.citations));
        sb.append(", paragraphCitations=").append(String.valueOf(this.paragraphCitations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessageContent)) {
            return false;
        }

        MessageContent other = (MessageContent) o;
        return java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.citations, other.citations)
                && java.util.Objects.equals(this.paragraphCitations, other.paragraphCitations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.citations == null ? 43 : this.citations.hashCode());
        result =
                (result * PRIME)
                        + (this.paragraphCitations == null
                                ? 43
                                : this.paragraphCitations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
