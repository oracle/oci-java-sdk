/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * The trace information about the tool selection from multiple tools. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ToolInvocationTrace.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "traceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ToolInvocationTrace extends Trace {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
        private String parentKey;

        public Builder parentKey(String parentKey) {
            this.parentKey = parentKey;
            this.__explicitlySet__.add("parentKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private SourceDetails source;

        public Builder source(SourceDetails source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /** The ID of the selected tool based on the user query. */
        @com.fasterxml.jackson.annotation.JsonProperty("toolId")
        private String toolId;

        /**
         * The ID of the selected tool based on the user query.
         *
         * @param toolId the value to set
         * @return this builder
         */
        public Builder toolId(String toolId) {
            this.toolId = toolId;
            this.__explicitlySet__.add("toolId");
            return this;
        }
        /** The display name of the selected tool. */
        @com.fasterxml.jackson.annotation.JsonProperty("toolName")
        private String toolName;

        /**
         * The display name of the selected tool.
         *
         * @param toolName the value to set
         * @return this builder
         */
        public Builder toolName(String toolName) {
            this.toolName = toolName;
            this.__explicitlySet__.add("toolName");
            return this;
        }
        /** The invocation details related to the selected tool. */
        @com.fasterxml.jackson.annotation.JsonProperty("invocationDetails")
        private String invocationDetails;

        /**
         * The invocation details related to the selected tool.
         *
         * @param invocationDetails the value to set
         * @return this builder
         */
        public Builder invocationDetails(String invocationDetails) {
            this.invocationDetails = invocationDetails;
            this.__explicitlySet__.add("invocationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ToolInvocationTrace build() {
            ToolInvocationTrace model =
                    new ToolInvocationTrace(
                            this.key,
                            this.parentKey,
                            this.source,
                            this.timeCreated,
                            this.timeFinished,
                            this.toolId,
                            this.toolName,
                            this.invocationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ToolInvocationTrace model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("parentKey")) {
                this.parentKey(model.getParentKey());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("toolId")) {
                this.toolId(model.getToolId());
            }
            if (model.wasPropertyExplicitlySet("toolName")) {
                this.toolName(model.getToolName());
            }
            if (model.wasPropertyExplicitlySet("invocationDetails")) {
                this.invocationDetails(model.getInvocationDetails());
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

    @Deprecated
    public ToolInvocationTrace(
            String key,
            String parentKey,
            SourceDetails source,
            java.util.Date timeCreated,
            java.util.Date timeFinished,
            String toolId,
            String toolName,
            String invocationDetails) {
        super(key, parentKey, source, timeCreated, timeFinished);
        this.toolId = toolId;
        this.toolName = toolName;
        this.invocationDetails = invocationDetails;
    }

    /** The ID of the selected tool based on the user query. */
    @com.fasterxml.jackson.annotation.JsonProperty("toolId")
    private final String toolId;

    /**
     * The ID of the selected tool based on the user query.
     *
     * @return the value
     */
    public String getToolId() {
        return toolId;
    }

    /** The display name of the selected tool. */
    @com.fasterxml.jackson.annotation.JsonProperty("toolName")
    private final String toolName;

    /**
     * The display name of the selected tool.
     *
     * @return the value
     */
    public String getToolName() {
        return toolName;
    }

    /** The invocation details related to the selected tool. */
    @com.fasterxml.jackson.annotation.JsonProperty("invocationDetails")
    private final String invocationDetails;

    /**
     * The invocation details related to the selected tool.
     *
     * @return the value
     */
    public String getInvocationDetails() {
        return invocationDetails;
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
        sb.append("ToolInvocationTrace(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", toolId=").append(String.valueOf(this.toolId));
        sb.append(", toolName=").append(String.valueOf(this.toolName));
        sb.append(", invocationDetails=").append(String.valueOf(this.invocationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ToolInvocationTrace)) {
            return false;
        }

        ToolInvocationTrace other = (ToolInvocationTrace) o;
        return java.util.Objects.equals(this.toolId, other.toolId)
                && java.util.Objects.equals(this.toolName, other.toolName)
                && java.util.Objects.equals(this.invocationDetails, other.invocationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.toolId == null ? 43 : this.toolId.hashCode());
        result = (result * PRIME) + (this.toolName == null ? 43 : this.toolName.hashCode());
        result =
                (result * PRIME)
                        + (this.invocationDetails == null ? 43 : this.invocationDetails.hashCode());
        return result;
    }
}
