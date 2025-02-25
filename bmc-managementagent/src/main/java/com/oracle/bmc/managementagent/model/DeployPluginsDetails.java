/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * The information required to deploy new Management Agent Plugins.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DeployPluginsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeployPluginsDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pluginIds", "agentCompartmentId", "agentIds"})
    public DeployPluginsDetails(
            java.util.List<String> pluginIds,
            String agentCompartmentId,
            java.util.List<String> agentIds) {
        super();
        this.pluginIds = pluginIds;
        this.agentCompartmentId = agentCompartmentId;
        this.agentIds = agentIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Plugin Id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pluginIds")
        private java.util.List<String> pluginIds;

        /**
         * Plugin Id
         * @param pluginIds the value to set
         * @return this builder
         **/
        public Builder pluginIds(java.util.List<String> pluginIds) {
            this.pluginIds = pluginIds;
            this.__explicitlySet__.add("pluginIds");
            return this;
        }
        /**
         * Management Agent Compartment Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agentCompartmentId")
        private String agentCompartmentId;

        /**
         * Management Agent Compartment Identifier
         * @param agentCompartmentId the value to set
         * @return this builder
         **/
        public Builder agentCompartmentId(String agentCompartmentId) {
            this.agentCompartmentId = agentCompartmentId;
            this.__explicitlySet__.add("agentCompartmentId");
            return this;
        }
        /**
         * List of Agent identifiers
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agentIds")
        private java.util.List<String> agentIds;

        /**
         * List of Agent identifiers
         * @param agentIds the value to set
         * @return this builder
         **/
        public Builder agentIds(java.util.List<String> agentIds) {
            this.agentIds = agentIds;
            this.__explicitlySet__.add("agentIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeployPluginsDetails build() {
            DeployPluginsDetails model =
                    new DeployPluginsDetails(
                            this.pluginIds, this.agentCompartmentId, this.agentIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeployPluginsDetails model) {
            if (model.wasPropertyExplicitlySet("pluginIds")) {
                this.pluginIds(model.getPluginIds());
            }
            if (model.wasPropertyExplicitlySet("agentCompartmentId")) {
                this.agentCompartmentId(model.getAgentCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("agentIds")) {
                this.agentIds(model.getAgentIds());
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

    /**
     * Plugin Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pluginIds")
    private final java.util.List<String> pluginIds;

    /**
     * Plugin Id
     * @return the value
     **/
    public java.util.List<String> getPluginIds() {
        return pluginIds;
    }

    /**
     * Management Agent Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentCompartmentId")
    private final String agentCompartmentId;

    /**
     * Management Agent Compartment Identifier
     * @return the value
     **/
    public String getAgentCompartmentId() {
        return agentCompartmentId;
    }

    /**
     * List of Agent identifiers
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentIds")
    private final java.util.List<String> agentIds;

    /**
     * List of Agent identifiers
     * @return the value
     **/
    public java.util.List<String> getAgentIds() {
        return agentIds;
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
        sb.append("DeployPluginsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("pluginIds=").append(String.valueOf(this.pluginIds));
        sb.append(", agentCompartmentId=").append(String.valueOf(this.agentCompartmentId));
        sb.append(", agentIds=").append(String.valueOf(this.agentIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeployPluginsDetails)) {
            return false;
        }

        DeployPluginsDetails other = (DeployPluginsDetails) o;
        return java.util.Objects.equals(this.pluginIds, other.pluginIds)
                && java.util.Objects.equals(this.agentCompartmentId, other.agentCompartmentId)
                && java.util.Objects.equals(this.agentIds, other.agentIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pluginIds == null ? 43 : this.pluginIds.hashCode());
        result =
                (result * PRIME)
                        + (this.agentCompartmentId == null
                                ? 43
                                : this.agentCompartmentId.hashCode());
        result = (result * PRIME) + (this.agentIds == null ? 43 : this.agentIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
