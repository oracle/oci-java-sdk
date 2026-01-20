/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Chat details for managing user interactions and tool executions. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ChatDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ChatDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "userMessage",
        "shouldStream",
        "sessionId",
        "toolParameters",
        "toolInputs",
        "performedActions"
    })
    public ChatDetails(
            String userMessage,
            Boolean shouldStream,
            String sessionId,
            java.util.Map<String, String> toolParameters,
            java.util.List<ToolInput> toolInputs,
            java.util.List<PerformedAction> performedActions) {
        super();
        this.userMessage = userMessage;
        this.shouldStream = shouldStream;
        this.sessionId = sessionId;
        this.toolParameters = toolParameters;
        this.toolInputs = toolInputs;
        this.performedActions = performedActions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The input user message content for the chat. */
        @com.fasterxml.jackson.annotation.JsonProperty("userMessage")
        private String userMessage;

        /**
         * The input user message content for the chat.
         *
         * @param userMessage the value to set
         * @return this builder
         */
        public Builder userMessage(String userMessage) {
            this.userMessage = userMessage;
            this.__explicitlySet__.add("userMessage");
            return this;
        }
        /** Whether to stream the response. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldStream")
        private Boolean shouldStream;

        /**
         * Whether to stream the response.
         *
         * @param shouldStream the value to set
         * @return this builder
         */
        public Builder shouldStream(Boolean shouldStream) {
            this.shouldStream = shouldStream;
            this.__explicitlySet__.add("shouldStream");
            return this;
        }
        /** Optional sessionId. If not provided, will chat without any prior context. */
        @com.fasterxml.jackson.annotation.JsonProperty("sessionId")
        private String sessionId;

        /**
         * Optional sessionId. If not provided, will chat without any prior context.
         *
         * @param sessionId the value to set
         * @return this builder
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            this.__explicitlySet__.add("sessionId");
            return this;
        }
        /**
         * A map where each key is a toolId and the value contains tool type and additional dynamic
         * parameters. This field is deprecated and will be removed after July 02 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("toolParameters")
        private java.util.Map<String, String> toolParameters;

        /**
         * A map where each key is a toolId and the value contains tool type and additional dynamic
         * parameters. This field is deprecated and will be removed after July 02 2026.
         *
         * @param toolParameters the value to set
         * @return this builder
         */
        public Builder toolParameters(java.util.Map<String, String> toolParameters) {
            this.toolParameters = toolParameters;
            this.__explicitlySet__.add("toolParameters");
            return this;
        }
        /**
         * Array of tool input objects, each specifying a tool's ID, type, and corresponding input
         * parameters required for execution.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("toolInputs")
        private java.util.List<ToolInput> toolInputs;

        /**
         * Array of tool input objects, each specifying a tool's ID, type, and corresponding input
         * parameters required for execution.
         *
         * @param toolInputs the value to set
         * @return this builder
         */
        public Builder toolInputs(java.util.List<ToolInput> toolInputs) {
            this.toolInputs = toolInputs;
            this.__explicitlySet__.add("toolInputs");
            return this;
        }
        /** A list of actions that have been performed based on prior required actions. */
        @com.fasterxml.jackson.annotation.JsonProperty("performedActions")
        private java.util.List<PerformedAction> performedActions;

        /**
         * A list of actions that have been performed based on prior required actions.
         *
         * @param performedActions the value to set
         * @return this builder
         */
        public Builder performedActions(java.util.List<PerformedAction> performedActions) {
            this.performedActions = performedActions;
            this.__explicitlySet__.add("performedActions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChatDetails build() {
            ChatDetails model =
                    new ChatDetails(
                            this.userMessage,
                            this.shouldStream,
                            this.sessionId,
                            this.toolParameters,
                            this.toolInputs,
                            this.performedActions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChatDetails model) {
            if (model.wasPropertyExplicitlySet("userMessage")) {
                this.userMessage(model.getUserMessage());
            }
            if (model.wasPropertyExplicitlySet("shouldStream")) {
                this.shouldStream(model.getShouldStream());
            }
            if (model.wasPropertyExplicitlySet("sessionId")) {
                this.sessionId(model.getSessionId());
            }
            if (model.wasPropertyExplicitlySet("toolParameters")) {
                this.toolParameters(model.getToolParameters());
            }
            if (model.wasPropertyExplicitlySet("toolInputs")) {
                this.toolInputs(model.getToolInputs());
            }
            if (model.wasPropertyExplicitlySet("performedActions")) {
                this.performedActions(model.getPerformedActions());
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

    /** The input user message content for the chat. */
    @com.fasterxml.jackson.annotation.JsonProperty("userMessage")
    private final String userMessage;

    /**
     * The input user message content for the chat.
     *
     * @return the value
     */
    public String getUserMessage() {
        return userMessage;
    }

    /** Whether to stream the response. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldStream")
    private final Boolean shouldStream;

    /**
     * Whether to stream the response.
     *
     * @return the value
     */
    public Boolean getShouldStream() {
        return shouldStream;
    }

    /** Optional sessionId. If not provided, will chat without any prior context. */
    @com.fasterxml.jackson.annotation.JsonProperty("sessionId")
    private final String sessionId;

    /**
     * Optional sessionId. If not provided, will chat without any prior context.
     *
     * @return the value
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * A map where each key is a toolId and the value contains tool type and additional dynamic
     * parameters. This field is deprecated and will be removed after July 02 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("toolParameters")
    private final java.util.Map<String, String> toolParameters;

    /**
     * A map where each key is a toolId and the value contains tool type and additional dynamic
     * parameters. This field is deprecated and will be removed after July 02 2026.
     *
     * @return the value
     */
    public java.util.Map<String, String> getToolParameters() {
        return toolParameters;
    }

    /**
     * Array of tool input objects, each specifying a tool's ID, type, and corresponding input
     * parameters required for execution.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("toolInputs")
    private final java.util.List<ToolInput> toolInputs;

    /**
     * Array of tool input objects, each specifying a tool's ID, type, and corresponding input
     * parameters required for execution.
     *
     * @return the value
     */
    public java.util.List<ToolInput> getToolInputs() {
        return toolInputs;
    }

    /** A list of actions that have been performed based on prior required actions. */
    @com.fasterxml.jackson.annotation.JsonProperty("performedActions")
    private final java.util.List<PerformedAction> performedActions;

    /**
     * A list of actions that have been performed based on prior required actions.
     *
     * @return the value
     */
    public java.util.List<PerformedAction> getPerformedActions() {
        return performedActions;
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
        sb.append("ChatDetails(");
        sb.append("super=").append(super.toString());
        sb.append("userMessage=").append(String.valueOf(this.userMessage));
        sb.append(", shouldStream=").append(String.valueOf(this.shouldStream));
        sb.append(", sessionId=").append(String.valueOf(this.sessionId));
        sb.append(", toolParameters=").append(String.valueOf(this.toolParameters));
        sb.append(", toolInputs=").append(String.valueOf(this.toolInputs));
        sb.append(", performedActions=").append(String.valueOf(this.performedActions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatDetails)) {
            return false;
        }

        ChatDetails other = (ChatDetails) o;
        return java.util.Objects.equals(this.userMessage, other.userMessage)
                && java.util.Objects.equals(this.shouldStream, other.shouldStream)
                && java.util.Objects.equals(this.sessionId, other.sessionId)
                && java.util.Objects.equals(this.toolParameters, other.toolParameters)
                && java.util.Objects.equals(this.toolInputs, other.toolInputs)
                && java.util.Objects.equals(this.performedActions, other.performedActions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.userMessage == null ? 43 : this.userMessage.hashCode());
        result = (result * PRIME) + (this.shouldStream == null ? 43 : this.shouldStream.hashCode());
        result = (result * PRIME) + (this.sessionId == null ? 43 : this.sessionId.hashCode());
        result =
                (result * PRIME)
                        + (this.toolParameters == null ? 43 : this.toolParameters.hashCode());
        result = (result * PRIME) + (this.toolInputs == null ? 43 : this.toolInputs.hashCode());
        result =
                (result * PRIME)
                        + (this.performedActions == null ? 43 : this.performedActions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
