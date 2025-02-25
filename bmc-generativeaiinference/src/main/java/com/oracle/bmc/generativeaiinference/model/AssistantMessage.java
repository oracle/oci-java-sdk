/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Represents a single instance of assistant message.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AssistantMessage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "role"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AssistantMessage extends Message {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private java.util.List<ChatContent> content;

        public Builder content(java.util.List<ChatContent> content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /**
         * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The tool calls generated by the model, such as function calls.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("toolCalls")
        private java.util.List<ToolCall> toolCalls;

        /**
         * The tool calls generated by the model, such as function calls.
         * @param toolCalls the value to set
         * @return this builder
         **/
        public Builder toolCalls(java.util.List<ToolCall> toolCalls) {
            this.toolCalls = toolCalls;
            this.__explicitlySet__.add("toolCalls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssistantMessage build() {
            AssistantMessage model = new AssistantMessage(this.content, this.name, this.toolCalls);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssistantMessage model) {
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("toolCalls")) {
                this.toolCalls(model.getToolCalls());
            }
            return this;
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

    @Deprecated
    public AssistantMessage(
            java.util.List<ChatContent> content, String name, java.util.List<ToolCall> toolCalls) {
        super(content);
        this.name = name;
        this.toolCalls = toolCalls;
    }

    /**
     * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The tool calls generated by the model, such as function calls.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toolCalls")
    private final java.util.List<ToolCall> toolCalls;

    /**
     * The tool calls generated by the model, such as function calls.
     * @return the value
     **/
    public java.util.List<ToolCall> getToolCalls() {
        return toolCalls;
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
        sb.append("AssistantMessage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", toolCalls=").append(String.valueOf(this.toolCalls));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssistantMessage)) {
            return false;
        }

        AssistantMessage other = (AssistantMessage) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.toolCalls, other.toolCalls)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.toolCalls == null ? 43 : this.toolCalls.hashCode());
        return result;
    }
}
