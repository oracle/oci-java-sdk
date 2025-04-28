/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The data to update an endpoint. <br>
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
        builder = UpdateAgentEndpointDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateAgentEndpointDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "contentModerationConfig",
        "guardrailConfig",
        "metadata",
        "humanInputConfig",
        "outputConfig",
        "shouldEnableTrace",
        "shouldEnableCitation",
        "shouldEnableMultiLanguage",
        "sessionConfig",
        "freeformTags",
        "definedTags"
    })
    public UpdateAgentEndpointDetails(
            String displayName,
            String description,
            ContentModerationConfig contentModerationConfig,
            GuardrailConfig guardrailConfig,
            java.util.Map<String, String> metadata,
            HumanInputConfig humanInputConfig,
            OutputConfig outputConfig,
            Boolean shouldEnableTrace,
            Boolean shouldEnableCitation,
            Boolean shouldEnableMultiLanguage,
            SessionConfig sessionConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.contentModerationConfig = contentModerationConfig;
        this.guardrailConfig = guardrailConfig;
        this.metadata = metadata;
        this.humanInputConfig = humanInputConfig;
        this.outputConfig = outputConfig;
        this.shouldEnableTrace = shouldEnableTrace;
        this.shouldEnableCitation = shouldEnableCitation;
        this.shouldEnableMultiLanguage = shouldEnableMultiLanguage;
        this.sessionConfig = sessionConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** An optional description of the AgentEndpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * An optional description of the AgentEndpoint.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentModerationConfig")
        private ContentModerationConfig contentModerationConfig;

        public Builder contentModerationConfig(ContentModerationConfig contentModerationConfig) {
            this.contentModerationConfig = contentModerationConfig;
            this.__explicitlySet__.add("contentModerationConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("guardrailConfig")
        private GuardrailConfig guardrailConfig;

        public Builder guardrailConfig(GuardrailConfig guardrailConfig) {
            this.guardrailConfig = guardrailConfig;
            this.__explicitlySet__.add("guardrailConfig");
            return this;
        }
        /** Key-value pairs to allow additional configurations. */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Key-value pairs to allow additional configurations.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("humanInputConfig")
        private HumanInputConfig humanInputConfig;

        public Builder humanInputConfig(HumanInputConfig humanInputConfig) {
            this.humanInputConfig = humanInputConfig;
            this.__explicitlySet__.add("humanInputConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputConfig")
        private OutputConfig outputConfig;

        public Builder outputConfig(OutputConfig outputConfig) {
            this.outputConfig = outputConfig;
            this.__explicitlySet__.add("outputConfig");
            return this;
        }
        /** Whether to show traces in the chat result. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableTrace")
        private Boolean shouldEnableTrace;

        /**
         * Whether to show traces in the chat result.
         *
         * @param shouldEnableTrace the value to set
         * @return this builder
         */
        public Builder shouldEnableTrace(Boolean shouldEnableTrace) {
            this.shouldEnableTrace = shouldEnableTrace;
            this.__explicitlySet__.add("shouldEnableTrace");
            return this;
        }
        /** Whether to show citations in the chat result. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableCitation")
        private Boolean shouldEnableCitation;

        /**
         * Whether to show citations in the chat result.
         *
         * @param shouldEnableCitation the value to set
         * @return this builder
         */
        public Builder shouldEnableCitation(Boolean shouldEnableCitation) {
            this.shouldEnableCitation = shouldEnableCitation;
            this.__explicitlySet__.add("shouldEnableCitation");
            return this;
        }
        /** Whether to enable multi-language for chat. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableMultiLanguage")
        private Boolean shouldEnableMultiLanguage;

        /**
         * Whether to enable multi-language for chat.
         *
         * @param shouldEnableMultiLanguage the value to set
         * @return this builder
         */
        public Builder shouldEnableMultiLanguage(Boolean shouldEnableMultiLanguage) {
            this.shouldEnableMultiLanguage = shouldEnableMultiLanguage;
            this.__explicitlySet__.add("shouldEnableMultiLanguage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionConfig")
        private SessionConfig sessionConfig;

        public Builder sessionConfig(SessionConfig sessionConfig) {
            this.sessionConfig = sessionConfig;
            this.__explicitlySet__.add("sessionConfig");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAgentEndpointDetails build() {
            UpdateAgentEndpointDetails model =
                    new UpdateAgentEndpointDetails(
                            this.displayName,
                            this.description,
                            this.contentModerationConfig,
                            this.guardrailConfig,
                            this.metadata,
                            this.humanInputConfig,
                            this.outputConfig,
                            this.shouldEnableTrace,
                            this.shouldEnableCitation,
                            this.shouldEnableMultiLanguage,
                            this.sessionConfig,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAgentEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("contentModerationConfig")) {
                this.contentModerationConfig(model.getContentModerationConfig());
            }
            if (model.wasPropertyExplicitlySet("guardrailConfig")) {
                this.guardrailConfig(model.getGuardrailConfig());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("humanInputConfig")) {
                this.humanInputConfig(model.getHumanInputConfig());
            }
            if (model.wasPropertyExplicitlySet("outputConfig")) {
                this.outputConfig(model.getOutputConfig());
            }
            if (model.wasPropertyExplicitlySet("shouldEnableTrace")) {
                this.shouldEnableTrace(model.getShouldEnableTrace());
            }
            if (model.wasPropertyExplicitlySet("shouldEnableCitation")) {
                this.shouldEnableCitation(model.getShouldEnableCitation());
            }
            if (model.wasPropertyExplicitlySet("shouldEnableMultiLanguage")) {
                this.shouldEnableMultiLanguage(model.getShouldEnableMultiLanguage());
            }
            if (model.wasPropertyExplicitlySet("sessionConfig")) {
                this.sessionConfig(model.getSessionConfig());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** An optional description of the AgentEndpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * An optional description of the AgentEndpoint.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("contentModerationConfig")
    private final ContentModerationConfig contentModerationConfig;

    public ContentModerationConfig getContentModerationConfig() {
        return contentModerationConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("guardrailConfig")
    private final GuardrailConfig guardrailConfig;

    public GuardrailConfig getGuardrailConfig() {
        return guardrailConfig;
    }

    /** Key-value pairs to allow additional configurations. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Key-value pairs to allow additional configurations.
     *
     * @return the value
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("humanInputConfig")
    private final HumanInputConfig humanInputConfig;

    public HumanInputConfig getHumanInputConfig() {
        return humanInputConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputConfig")
    private final OutputConfig outputConfig;

    public OutputConfig getOutputConfig() {
        return outputConfig;
    }

    /** Whether to show traces in the chat result. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableTrace")
    private final Boolean shouldEnableTrace;

    /**
     * Whether to show traces in the chat result.
     *
     * @return the value
     */
    public Boolean getShouldEnableTrace() {
        return shouldEnableTrace;
    }

    /** Whether to show citations in the chat result. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableCitation")
    private final Boolean shouldEnableCitation;

    /**
     * Whether to show citations in the chat result.
     *
     * @return the value
     */
    public Boolean getShouldEnableCitation() {
        return shouldEnableCitation;
    }

    /** Whether to enable multi-language for chat. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableMultiLanguage")
    private final Boolean shouldEnableMultiLanguage;

    /**
     * Whether to enable multi-language for chat.
     *
     * @return the value
     */
    public Boolean getShouldEnableMultiLanguage() {
        return shouldEnableMultiLanguage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sessionConfig")
    private final SessionConfig sessionConfig;

    public SessionConfig getSessionConfig() {
        return sessionConfig;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateAgentEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", contentModerationConfig=")
                .append(String.valueOf(this.contentModerationConfig));
        sb.append(", guardrailConfig=").append(String.valueOf(this.guardrailConfig));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", humanInputConfig=").append(String.valueOf(this.humanInputConfig));
        sb.append(", outputConfig=").append(String.valueOf(this.outputConfig));
        sb.append(", shouldEnableTrace=").append(String.valueOf(this.shouldEnableTrace));
        sb.append(", shouldEnableCitation=").append(String.valueOf(this.shouldEnableCitation));
        sb.append(", shouldEnableMultiLanguage=")
                .append(String.valueOf(this.shouldEnableMultiLanguage));
        sb.append(", sessionConfig=").append(String.valueOf(this.sessionConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAgentEndpointDetails)) {
            return false;
        }

        UpdateAgentEndpointDetails other = (UpdateAgentEndpointDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.contentModerationConfig, other.contentModerationConfig)
                && java.util.Objects.equals(this.guardrailConfig, other.guardrailConfig)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.humanInputConfig, other.humanInputConfig)
                && java.util.Objects.equals(this.outputConfig, other.outputConfig)
                && java.util.Objects.equals(this.shouldEnableTrace, other.shouldEnableTrace)
                && java.util.Objects.equals(this.shouldEnableCitation, other.shouldEnableCitation)
                && java.util.Objects.equals(
                        this.shouldEnableMultiLanguage, other.shouldEnableMultiLanguage)
                && java.util.Objects.equals(this.sessionConfig, other.sessionConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.contentModerationConfig == null
                                ? 43
                                : this.contentModerationConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.guardrailConfig == null ? 43 : this.guardrailConfig.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.humanInputConfig == null ? 43 : this.humanInputConfig.hashCode());
        result = (result * PRIME) + (this.outputConfig == null ? 43 : this.outputConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldEnableTrace == null ? 43 : this.shouldEnableTrace.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldEnableCitation == null
                                ? 43
                                : this.shouldEnableCitation.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldEnableMultiLanguage == null
                                ? 43
                                : this.shouldEnableMultiLanguage.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionConfig == null ? 43 : this.sessionConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
