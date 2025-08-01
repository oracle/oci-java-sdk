/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * The response of a chat request. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ChatResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ChatResult extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "message",
        "traces",
        "toolResults",
        "toolOutputs",
        "requiredActions",
        "guardrailResult"
    })
    public ChatResult(
            Message message,
            java.util.List<Trace> traces,
            java.util.Map<String, String> toolResults,
            java.util.List<ToolOutput> toolOutputs,
            java.util.List<RequiredAction> requiredActions,
            String guardrailResult) {
        super();
        this.message = message;
        this.traces = traces;
        this.toolResults = toolResults;
        this.toolOutputs = toolOutputs;
        this.requiredActions = requiredActions;
        this.guardrailResult = guardrailResult;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private Message message;

        public Builder message(Message message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * The trace that displays the internal progression, such as reasoning and actions during an
         * execution.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("traces")
        private java.util.List<Trace> traces;

        /**
         * The trace that displays the internal progression, such as reasoning and actions during an
         * execution.
         *
         * @param traces the value to set
         * @return this builder
         */
        public Builder traces(java.util.List<Trace> traces) {
            this.traces = traces;
            this.__explicitlySet__.add("traces");
            return this;
        }
        /**
         * A map where each key is a toolId and the value contains tool type and additional dynamic
         * results. This field is deprecated and will be removed after July 02 2026.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("toolResults")
        private java.util.Map<String, String> toolResults;

        /**
         * A map where each key is a toolId and the value contains tool type and additional dynamic
         * results. This field is deprecated and will be removed after July 02 2026.
         *
         * @param toolResults the value to set
         * @return this builder
         */
        public Builder toolResults(java.util.Map<String, String> toolResults) {
            this.toolResults = toolResults;
            this.__explicitlySet__.add("toolResults");
            return this;
        }
        /**
         * Array of tool outputs in execution order. Each item includes the tool OCID, output type,
         * and corresponding content. The result structure is defined by the {@code toolOutputType}
         * discriminator.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("toolOutputs")
        private java.util.List<ToolOutput> toolOutputs;

        /**
         * Array of tool outputs in execution order. Each item includes the tool OCID, output type,
         * and corresponding content. The result structure is defined by the {@code toolOutputType}
         * discriminator.
         *
         * @param toolOutputs the value to set
         * @return this builder
         */
        public Builder toolOutputs(java.util.List<ToolOutput> toolOutputs) {
            this.toolOutputs = toolOutputs;
            this.__explicitlySet__.add("toolOutputs");
            return this;
        }
        /** A list of actions the agent requires the user or agent client to perform. */
        @com.fasterxml.jackson.annotation.JsonProperty("requiredActions")
        private java.util.List<RequiredAction> requiredActions;

        /**
         * A list of actions the agent requires the user or agent client to perform.
         *
         * @param requiredActions the value to set
         * @return this builder
         */
        public Builder requiredActions(java.util.List<RequiredAction> requiredActions) {
            this.requiredActions = requiredActions;
            this.__explicitlySet__.add("requiredActions");
            return this;
        }
        /**
         * Captures the result of guardrail evaluations as JSON string performed on either the input
         * to the agent or the output generated by the agent.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("guardrailResult")
        private String guardrailResult;

        /**
         * Captures the result of guardrail evaluations as JSON string performed on either the input
         * to the agent or the output generated by the agent.
         *
         * @param guardrailResult the value to set
         * @return this builder
         */
        public Builder guardrailResult(String guardrailResult) {
            this.guardrailResult = guardrailResult;
            this.__explicitlySet__.add("guardrailResult");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChatResult build() {
            ChatResult model =
                    new ChatResult(
                            this.message,
                            this.traces,
                            this.toolResults,
                            this.toolOutputs,
                            this.requiredActions,
                            this.guardrailResult);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChatResult model) {
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("traces")) {
                this.traces(model.getTraces());
            }
            if (model.wasPropertyExplicitlySet("toolResults")) {
                this.toolResults(model.getToolResults());
            }
            if (model.wasPropertyExplicitlySet("toolOutputs")) {
                this.toolOutputs(model.getToolOutputs());
            }
            if (model.wasPropertyExplicitlySet("requiredActions")) {
                this.requiredActions(model.getRequiredActions());
            }
            if (model.wasPropertyExplicitlySet("guardrailResult")) {
                this.guardrailResult(model.getGuardrailResult());
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

    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final Message message;

    public Message getMessage() {
        return message;
    }

    /**
     * The trace that displays the internal progression, such as reasoning and actions during an
     * execution.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("traces")
    private final java.util.List<Trace> traces;

    /**
     * The trace that displays the internal progression, such as reasoning and actions during an
     * execution.
     *
     * @return the value
     */
    public java.util.List<Trace> getTraces() {
        return traces;
    }

    /**
     * A map where each key is a toolId and the value contains tool type and additional dynamic
     * results. This field is deprecated and will be removed after July 02 2026.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("toolResults")
    private final java.util.Map<String, String> toolResults;

    /**
     * A map where each key is a toolId and the value contains tool type and additional dynamic
     * results. This field is deprecated and will be removed after July 02 2026.
     *
     * @return the value
     */
    public java.util.Map<String, String> getToolResults() {
        return toolResults;
    }

    /**
     * Array of tool outputs in execution order. Each item includes the tool OCID, output type, and
     * corresponding content. The result structure is defined by the {@code toolOutputType}
     * discriminator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("toolOutputs")
    private final java.util.List<ToolOutput> toolOutputs;

    /**
     * Array of tool outputs in execution order. Each item includes the tool OCID, output type, and
     * corresponding content. The result structure is defined by the {@code toolOutputType}
     * discriminator.
     *
     * @return the value
     */
    public java.util.List<ToolOutput> getToolOutputs() {
        return toolOutputs;
    }

    /** A list of actions the agent requires the user or agent client to perform. */
    @com.fasterxml.jackson.annotation.JsonProperty("requiredActions")
    private final java.util.List<RequiredAction> requiredActions;

    /**
     * A list of actions the agent requires the user or agent client to perform.
     *
     * @return the value
     */
    public java.util.List<RequiredAction> getRequiredActions() {
        return requiredActions;
    }

    /**
     * Captures the result of guardrail evaluations as JSON string performed on either the input to
     * the agent or the output generated by the agent.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("guardrailResult")
    private final String guardrailResult;

    /**
     * Captures the result of guardrail evaluations as JSON string performed on either the input to
     * the agent or the output generated by the agent.
     *
     * @return the value
     */
    public String getGuardrailResult() {
        return guardrailResult;
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
        sb.append("ChatResult(");
        sb.append("super=").append(super.toString());
        sb.append("message=").append(String.valueOf(this.message));
        sb.append(", traces=").append(String.valueOf(this.traces));
        sb.append(", toolResults=").append(String.valueOf(this.toolResults));
        sb.append(", toolOutputs=").append(String.valueOf(this.toolOutputs));
        sb.append(", requiredActions=").append(String.valueOf(this.requiredActions));
        sb.append(", guardrailResult=").append(String.valueOf(this.guardrailResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatResult)) {
            return false;
        }

        ChatResult other = (ChatResult) o;
        return java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.traces, other.traces)
                && java.util.Objects.equals(this.toolResults, other.toolResults)
                && java.util.Objects.equals(this.toolOutputs, other.toolOutputs)
                && java.util.Objects.equals(this.requiredActions, other.requiredActions)
                && java.util.Objects.equals(this.guardrailResult, other.guardrailResult)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.traces == null ? 43 : this.traces.hashCode());
        result = (result * PRIME) + (this.toolResults == null ? 43 : this.toolResults.hashCode());
        result = (result * PRIME) + (this.toolOutputs == null ? 43 : this.toolOutputs.hashCode());
        result =
                (result * PRIME)
                        + (this.requiredActions == null ? 43 : this.requiredActions.hashCode());
        result =
                (result * PRIME)
                        + (this.guardrailResult == null ? 43 : this.guardrailResult.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
