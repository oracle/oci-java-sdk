/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
        builder = AgentConfigSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AgentConfigSummary extends ConfigSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The agent attribute KEY by which an Agent configuration is matched to an agent. All agent
         * configuration objects share the same key. It is [ServiceName, service.name] by default.
         * The attribute VALUE corresponding to this KEY is in the matchAgentsWithAttributeValue
         * field.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("matchAgentsWithAttributeKey")
        private java.util.List<String> matchAgentsWithAttributeKey;

        /**
         * The agent attribute KEY by which an Agent configuration is matched to an agent. All agent
         * configuration objects share the same key. It is [ServiceName, service.name] by default.
         * The attribute VALUE corresponding to this KEY is in the matchAgentsWithAttributeValue
         * field.
         *
         * @param matchAgentsWithAttributeKey the value to set
         * @return this builder
         */
        public Builder matchAgentsWithAttributeKey(
                java.util.List<String> matchAgentsWithAttributeKey) {
            this.matchAgentsWithAttributeKey = matchAgentsWithAttributeKey;
            this.__explicitlySet__.add("matchAgentsWithAttributeKey");
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

        public AgentConfigSummary build() {
            AgentConfigSummary model =
                    new AgentConfigSummary(
                            this.id,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdBy,
                            this.updatedBy,
                            this.etag,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.matchAgentsWithAttributeKey,
                            this.matchAgentsWithAttributeValue,
                            this.config,
                            this.overrides);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentConfigSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("updatedBy")) {
                this.updatedBy(model.getUpdatedBy());
            }
            if (model.wasPropertyExplicitlySet("etag")) {
                this.etag(model.getEtag());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("matchAgentsWithAttributeKey")) {
                this.matchAgentsWithAttributeKey(model.getMatchAgentsWithAttributeKey());
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
    public AgentConfigSummary(
            String id,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdBy,
            String updatedBy,
            String etag,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<String> matchAgentsWithAttributeKey,
            String matchAgentsWithAttributeValue,
            AgentConfigMap config,
            AgentConfigOverrides overrides) {
        super(
                id,
                timeCreated,
                timeUpdated,
                createdBy,
                updatedBy,
                etag,
                freeformTags,
                definedTags,
                systemTags);
        this.matchAgentsWithAttributeKey = matchAgentsWithAttributeKey;
        this.matchAgentsWithAttributeValue = matchAgentsWithAttributeValue;
        this.config = config;
        this.overrides = overrides;
    }

    /**
     * The agent attribute KEY by which an Agent configuration is matched to an agent. All agent
     * configuration objects share the same key. It is [ServiceName, service.name] by default. The
     * attribute VALUE corresponding to this KEY is in the matchAgentsWithAttributeValue field.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("matchAgentsWithAttributeKey")
    private final java.util.List<String> matchAgentsWithAttributeKey;

    /**
     * The agent attribute KEY by which an Agent configuration is matched to an agent. All agent
     * configuration objects share the same key. It is [ServiceName, service.name] by default. The
     * attribute VALUE corresponding to this KEY is in the matchAgentsWithAttributeValue field.
     *
     * @return the value
     */
    public java.util.List<String> getMatchAgentsWithAttributeKey() {
        return matchAgentsWithAttributeKey;
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
        sb.append("AgentConfigSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", matchAgentsWithAttributeKey=")
                .append(String.valueOf(this.matchAgentsWithAttributeKey));
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
        if (!(o instanceof AgentConfigSummary)) {
            return false;
        }

        AgentConfigSummary other = (AgentConfigSummary) o;
        return java.util.Objects.equals(
                        this.matchAgentsWithAttributeKey, other.matchAgentsWithAttributeKey)
                && java.util.Objects.equals(
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
                        + (this.matchAgentsWithAttributeKey == null
                                ? 43
                                : this.matchAgentsWithAttributeKey.hashCode());
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
