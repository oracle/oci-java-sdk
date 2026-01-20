/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * Collection of agent configuration files. For agents that use a single configuration file, this
 * SHOULD contain a single entry and the key MAY be an empty string. To apply a different
 * configuration in a subset of the agents, put this block anywhere in the body of the configuration
 * and edit <some variable> and <some content> {{ <some variable> | default <some content> }}
 * Example: com.oracle.apm.agent.tracer.enable.jfr = {{ isJfrEnabled | default false }} Then, in the
 * configuration's overrides, specify a different value for <some variable> along with the desired
 * agent filter. Example: "agentFilter": "ApplicationType='Tomcat'" "overrideMap": { "isJfrEnabled":
 * true } <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AgentConfigMap.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AgentConfigMap
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"configMap"})
    public AgentConfigMap(java.util.Map<String, AgentConfigFile> configMap) {
        super();
        this.configMap = configMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Map of agent configuration files, where keys are file names. */
        @com.fasterxml.jackson.annotation.JsonProperty("configMap")
        private java.util.Map<String, AgentConfigFile> configMap;

        /**
         * Map of agent configuration files, where keys are file names.
         *
         * @param configMap the value to set
         * @return this builder
         */
        public Builder configMap(java.util.Map<String, AgentConfigFile> configMap) {
            this.configMap = configMap;
            this.__explicitlySet__.add("configMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AgentConfigMap build() {
            AgentConfigMap model = new AgentConfigMap(this.configMap);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentConfigMap model) {
            if (model.wasPropertyExplicitlySet("configMap")) {
                this.configMap(model.getConfigMap());
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

    /** Map of agent configuration files, where keys are file names. */
    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    private final java.util.Map<String, AgentConfigFile> configMap;

    /**
     * Map of agent configuration files, where keys are file names.
     *
     * @return the value
     */
    public java.util.Map<String, AgentConfigFile> getConfigMap() {
        return configMap;
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
        sb.append("AgentConfigMap(");
        sb.append("super=").append(super.toString());
        sb.append("configMap=").append(String.valueOf(this.configMap));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentConfigMap)) {
            return false;
        }

        AgentConfigMap other = (AgentConfigMap) o;
        return java.util.Objects.equals(this.configMap, other.configMap) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.configMap == null ? 43 : this.configMap.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
