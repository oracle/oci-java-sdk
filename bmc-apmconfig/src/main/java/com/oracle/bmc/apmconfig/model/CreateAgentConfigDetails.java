/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * Agent configuration for any Agent complying with the OpAMP specification. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAgentConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAgentConfigDetails extends CreateConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The agent attribute VALUE by which an agent configuration is matched to an agent. Each
         * agent configuration object must specify a different value. The attribute KEY
         * corresponding to this VALUE is in the matchAgentsWithAttributeKey field.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("matchAgentsWithAttributeValue")
        private String matchAgentsWithAttributeValue;

        /**
         * The agent attribute VALUE by which an agent configuration is matched to an agent. Each
         * agent configuration object must specify a different value. The attribute KEY
         * corresponding to this VALUE is in the matchAgentsWithAttributeKey field.
         *
         * @param matchAgentsWithAttributeValue the value to set
         * @return this builder
         */
        public Builder matchAgentsWithAttributeValue(String matchAgentsWithAttributeValue) {
            this.matchAgentsWithAttributeValue = matchAgentsWithAttributeValue;
            this.__explicitlySet__.add("matchAgentsWithAttributeValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("config")
        private AgentConfigMap config;

        public Builder config(AgentConfigMap config) {
            this.config = config;
            this.__explicitlySet__.add("config");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("overrides")
        private AgentConfigOverrides overrides;

        public Builder overrides(AgentConfigOverrides overrides) {
            this.overrides = overrides;
            this.__explicitlySet__.add("overrides");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAgentConfigDetails build() {
            CreateAgentConfigDetails model =
                    new CreateAgentConfigDetails(
                            this.freeformTags,
                            this.definedTags,
                            this.matchAgentsWithAttributeValue,
                            this.config,
                            this.overrides);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAgentConfigDetails model) {
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("matchAgentsWithAttributeValue")) {
                this.matchAgentsWithAttributeValue(model.getMatchAgentsWithAttributeValue());
            }
            if (model.wasPropertyExplicitlySet("config")) {
                this.config(model.getConfig());
            }
            if (model.wasPropertyExplicitlySet("overrides")) {
                this.overrides(model.getOverrides());
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
    public CreateAgentConfigDetails(
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String matchAgentsWithAttributeValue,
            AgentConfigMap config,
            AgentConfigOverrides overrides) {
        super(freeformTags, definedTags);
        this.matchAgentsWithAttributeValue = matchAgentsWithAttributeValue;
        this.config = config;
        this.overrides = overrides;
    }

    /**
     * The agent attribute VALUE by which an agent configuration is matched to an agent. Each agent
     * configuration object must specify a different value. The attribute KEY corresponding to this
     * VALUE is in the matchAgentsWithAttributeKey field.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("matchAgentsWithAttributeValue")
    private final String matchAgentsWithAttributeValue;

    /**
     * The agent attribute VALUE by which an agent configuration is matched to an agent. Each agent
     * configuration object must specify a different value. The attribute KEY corresponding to this
     * VALUE is in the matchAgentsWithAttributeKey field.
     *
     * @return the value
     */
    public String getMatchAgentsWithAttributeValue() {
        return matchAgentsWithAttributeValue;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final AgentConfigMap config;

    public AgentConfigMap getConfig() {
        return config;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("overrides")
    private final AgentConfigOverrides overrides;

    public AgentConfigOverrides getOverrides() {
        return overrides;
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
        sb.append("CreateAgentConfigDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", matchAgentsWithAttributeValue=")
                .append(String.valueOf(this.matchAgentsWithAttributeValue));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(", overrides=").append(String.valueOf(this.overrides));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAgentConfigDetails)) {
            return false;
        }

        CreateAgentConfigDetails other = (CreateAgentConfigDetails) o;
        return java.util.Objects.equals(
                        this.matchAgentsWithAttributeValue, other.matchAgentsWithAttributeValue)
                && java.util.Objects.equals(this.config, other.config)
                && java.util.Objects.equals(this.overrides, other.overrides)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.matchAgentsWithAttributeValue == null
                                ? 43
                                : this.matchAgentsWithAttributeValue.hashCode());
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        result = (result * PRIME) + (this.overrides == null ? 43 : this.overrides.hashCode());
        return result;
    }
}
