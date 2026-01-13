/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * Agent configuration overrides that should apply to a subset of the agents associated with an
 * Agent Config object. <br>
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
        builder = AgentConfigOverride.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AgentConfigOverride
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"agentFilter", "overrideMap"})
    public AgentConfigOverride(String agentFilter, java.util.Map<String, String> overrideMap) {
        super();
        this.agentFilter = agentFilter;
        this.overrideMap = overrideMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The string that defines the Agent Filter expression. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentFilter")
        private String agentFilter;

        /**
         * The string that defines the Agent Filter expression.
         *
         * @param agentFilter the value to set
         * @return this builder
         */
        public Builder agentFilter(String agentFilter) {
            this.agentFilter = agentFilter;
            this.__explicitlySet__.add("agentFilter");
            return this;
        }
        /**
         * A map whose key is a substitution variable specified within the configuration's body. For
         * example, if below was specified in the configuration's body {{ isJfrEnabled | default
         * false }} Then a valid map key would be "isJfrEnabled". The value is typically different
         * than the default specified in the configuration's body. Thus, in this example, the map
         * entry could be "isJfrEnabled": true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("overrideMap")
        private java.util.Map<String, String> overrideMap;

        /**
         * A map whose key is a substitution variable specified within the configuration's body. For
         * example, if below was specified in the configuration's body {{ isJfrEnabled | default
         * false }} Then a valid map key would be "isJfrEnabled". The value is typically different
         * than the default specified in the configuration's body. Thus, in this example, the map
         * entry could be "isJfrEnabled": true
         *
         * @param overrideMap the value to set
         * @return this builder
         */
        public Builder overrideMap(java.util.Map<String, String> overrideMap) {
            this.overrideMap = overrideMap;
            this.__explicitlySet__.add("overrideMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AgentConfigOverride build() {
            AgentConfigOverride model = new AgentConfigOverride(this.agentFilter, this.overrideMap);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentConfigOverride model) {
            if (model.wasPropertyExplicitlySet("agentFilter")) {
                this.agentFilter(model.getAgentFilter());
            }
            if (model.wasPropertyExplicitlySet("overrideMap")) {
                this.overrideMap(model.getOverrideMap());
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

    /** The string that defines the Agent Filter expression. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentFilter")
    private final String agentFilter;

    /**
     * The string that defines the Agent Filter expression.
     *
     * @return the value
     */
    public String getAgentFilter() {
        return agentFilter;
    }

    /**
     * A map whose key is a substitution variable specified within the configuration's body. For
     * example, if below was specified in the configuration's body {{ isJfrEnabled | default false
     * }} Then a valid map key would be "isJfrEnabled". The value is typically different than the
     * default specified in the configuration's body. Thus, in this example, the map entry could be
     * "isJfrEnabled": true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("overrideMap")
    private final java.util.Map<String, String> overrideMap;

    /**
     * A map whose key is a substitution variable specified within the configuration's body. For
     * example, if below was specified in the configuration's body {{ isJfrEnabled | default false
     * }} Then a valid map key would be "isJfrEnabled". The value is typically different than the
     * default specified in the configuration's body. Thus, in this example, the map entry could be
     * "isJfrEnabled": true
     *
     * @return the value
     */
    public java.util.Map<String, String> getOverrideMap() {
        return overrideMap;
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
        sb.append("AgentConfigOverride(");
        sb.append("super=").append(super.toString());
        sb.append("agentFilter=").append(String.valueOf(this.agentFilter));
        sb.append(", overrideMap=").append(String.valueOf(this.overrideMap));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentConfigOverride)) {
            return false;
        }

        AgentConfigOverride other = (AgentConfigOverride) o;
        return java.util.Objects.equals(this.agentFilter, other.agentFilter)
                && java.util.Objects.equals(this.overrideMap, other.overrideMap)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentFilter == null ? 43 : this.agentFilter.hashCode());
        result = (result * PRIME) + (this.overrideMap == null ? 43 : this.overrideMap.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
