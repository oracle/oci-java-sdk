/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The data to create an endpoint. <br>
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
        builder = CreateAgentEndpointDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAgentEndpointDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "agentId",
        "contentModerationConfig",
        "shouldEnableTrace",
        "shouldEnableCitation",
        "shouldEnableSession",
        "sessionConfig",
        "compartmentId",
        "freeformTags",
        "definedTags"
    })
    public CreateAgentEndpointDetails(
            String displayName,
            String description,
            String agentId,
            ContentModerationConfig contentModerationConfig,
            Boolean shouldEnableTrace,
            Boolean shouldEnableCitation,
            Boolean shouldEnableSession,
            SessionConfig sessionConfig,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.agentId = agentId;
        this.contentModerationConfig = contentModerationConfig;
        this.shouldEnableTrace = shouldEnableTrace;
        this.shouldEnableCitation = shouldEnableCitation;
        this.shouldEnableSession = shouldEnableSession;
        this.sessionConfig = sessionConfig;
        this.compartmentId = compartmentId;
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
        /** An optional description of the endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * An optional description of the endpoint.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The OCID of the agent that this endpoint is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The OCID of the agent that this endpoint is associated with.
         *
         * @param agentId the value to set
         * @return this builder
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentModerationConfig")
        private ContentModerationConfig contentModerationConfig;

        public Builder contentModerationConfig(ContentModerationConfig contentModerationConfig) {
            this.contentModerationConfig = contentModerationConfig;
            this.__explicitlySet__.add("contentModerationConfig");
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
        /** Whether or not to enable Session-based chat. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableSession")
        private Boolean shouldEnableSession;

        /**
         * Whether or not to enable Session-based chat.
         *
         * @param shouldEnableSession the value to set
         * @return this builder
         */
        public Builder shouldEnableSession(Boolean shouldEnableSession) {
            this.shouldEnableSession = shouldEnableSession;
            this.__explicitlySet__.add("shouldEnableSession");
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment to create the endpoint in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment to create the endpoint in.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        public CreateAgentEndpointDetails build() {
            CreateAgentEndpointDetails model =
                    new CreateAgentEndpointDetails(
                            this.displayName,
                            this.description,
                            this.agentId,
                            this.contentModerationConfig,
                            this.shouldEnableTrace,
                            this.shouldEnableCitation,
                            this.shouldEnableSession,
                            this.sessionConfig,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAgentEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("agentId")) {
                this.agentId(model.getAgentId());
            }
            if (model.wasPropertyExplicitlySet("contentModerationConfig")) {
                this.contentModerationConfig(model.getContentModerationConfig());
            }
            if (model.wasPropertyExplicitlySet("shouldEnableTrace")) {
                this.shouldEnableTrace(model.getShouldEnableTrace());
            }
            if (model.wasPropertyExplicitlySet("shouldEnableCitation")) {
                this.shouldEnableCitation(model.getShouldEnableCitation());
            }
            if (model.wasPropertyExplicitlySet("shouldEnableSession")) {
                this.shouldEnableSession(model.getShouldEnableSession());
            }
            if (model.wasPropertyExplicitlySet("sessionConfig")) {
                this.sessionConfig(model.getSessionConfig());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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

    /** An optional description of the endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * An optional description of the endpoint.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The OCID of the agent that this endpoint is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The OCID of the agent that this endpoint is associated with.
     *
     * @return the value
     */
    public String getAgentId() {
        return agentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("contentModerationConfig")
    private final ContentModerationConfig contentModerationConfig;

    public ContentModerationConfig getContentModerationConfig() {
        return contentModerationConfig;
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

    /** Whether or not to enable Session-based chat. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableSession")
    private final Boolean shouldEnableSession;

    /**
     * Whether or not to enable Session-based chat.
     *
     * @return the value
     */
    public Boolean getShouldEnableSession() {
        return shouldEnableSession;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sessionConfig")
    private final SessionConfig sessionConfig;

    public SessionConfig getSessionConfig() {
        return sessionConfig;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment to create the endpoint in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment to create the endpoint in.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        sb.append("CreateAgentEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", agentId=").append(String.valueOf(this.agentId));
        sb.append(", contentModerationConfig=")
                .append(String.valueOf(this.contentModerationConfig));
        sb.append(", shouldEnableTrace=").append(String.valueOf(this.shouldEnableTrace));
        sb.append(", shouldEnableCitation=").append(String.valueOf(this.shouldEnableCitation));
        sb.append(", shouldEnableSession=").append(String.valueOf(this.shouldEnableSession));
        sb.append(", sessionConfig=").append(String.valueOf(this.sessionConfig));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
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
        if (!(o instanceof CreateAgentEndpointDetails)) {
            return false;
        }

        CreateAgentEndpointDetails other = (CreateAgentEndpointDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(
                        this.contentModerationConfig, other.contentModerationConfig)
                && java.util.Objects.equals(this.shouldEnableTrace, other.shouldEnableTrace)
                && java.util.Objects.equals(this.shouldEnableCitation, other.shouldEnableCitation)
                && java.util.Objects.equals(this.shouldEnableSession, other.shouldEnableSession)
                && java.util.Objects.equals(this.sessionConfig, other.sessionConfig)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
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
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentModerationConfig == null
                                ? 43
                                : this.contentModerationConfig.hashCode());
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
                        + (this.shouldEnableSession == null
                                ? 43
                                : this.shouldEnableSession.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionConfig == null ? 43 : this.sessionConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
