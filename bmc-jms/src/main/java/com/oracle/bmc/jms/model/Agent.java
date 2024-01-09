/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Information about the agent. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Agent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Agent extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "type",
        "javaVersion",
        "javaSecurityStatus",
        "plugins"
    })
    public Agent(
            String displayName,
            AgentType type,
            String javaVersion,
            JreSecurityStatus javaSecurityStatus,
            java.util.List<Plugin> plugins) {
        super();
        this.displayName = displayName;
        this.type = type;
        this.javaVersion = javaVersion;
        this.javaSecurityStatus = javaSecurityStatus;
        this.plugins = plugins;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the agent.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The agent type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private AgentType type;

        /**
         * The agent type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(AgentType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The java version. */
        @com.fasterxml.jackson.annotation.JsonProperty("javaVersion")
        private String javaVersion;

        /**
         * The java version.
         *
         * @param javaVersion the value to set
         * @return this builder
         */
        public Builder javaVersion(String javaVersion) {
            this.javaVersion = javaVersion;
            this.__explicitlySet__.add("javaVersion");
            return this;
        }
        /** The security status of the Java Runtime. */
        @com.fasterxml.jackson.annotation.JsonProperty("javaSecurityStatus")
        private JreSecurityStatus javaSecurityStatus;

        /**
         * The security status of the Java Runtime.
         *
         * @param javaSecurityStatus the value to set
         * @return this builder
         */
        public Builder javaSecurityStatus(JreSecurityStatus javaSecurityStatus) {
            this.javaSecurityStatus = javaSecurityStatus;
            this.__explicitlySet__.add("javaSecurityStatus");
            return this;
        }
        /** A list of plugins installed on this agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("plugins")
        private java.util.List<Plugin> plugins;

        /**
         * A list of plugins installed on this agent.
         *
         * @param plugins the value to set
         * @return this builder
         */
        public Builder plugins(java.util.List<Plugin> plugins) {
            this.plugins = plugins;
            this.__explicitlySet__.add("plugins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Agent build() {
            Agent model =
                    new Agent(
                            this.displayName,
                            this.type,
                            this.javaVersion,
                            this.javaSecurityStatus,
                            this.plugins);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Agent model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("javaVersion")) {
                this.javaVersion(model.getJavaVersion());
            }
            if (model.wasPropertyExplicitlySet("javaSecurityStatus")) {
                this.javaSecurityStatus(model.getJavaSecurityStatus());
            }
            if (model.wasPropertyExplicitlySet("plugins")) {
                this.plugins(model.getPlugins());
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

    /** The name of the agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the agent.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The agent type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final AgentType type;

    /**
     * The agent type.
     *
     * @return the value
     */
    public AgentType getType() {
        return type;
    }

    /** The java version. */
    @com.fasterxml.jackson.annotation.JsonProperty("javaVersion")
    private final String javaVersion;

    /**
     * The java version.
     *
     * @return the value
     */
    public String getJavaVersion() {
        return javaVersion;
    }

    /** The security status of the Java Runtime. */
    @com.fasterxml.jackson.annotation.JsonProperty("javaSecurityStatus")
    private final JreSecurityStatus javaSecurityStatus;

    /**
     * The security status of the Java Runtime.
     *
     * @return the value
     */
    public JreSecurityStatus getJavaSecurityStatus() {
        return javaSecurityStatus;
    }

    /** A list of plugins installed on this agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("plugins")
    private final java.util.List<Plugin> plugins;

    /**
     * A list of plugins installed on this agent.
     *
     * @return the value
     */
    public java.util.List<Plugin> getPlugins() {
        return plugins;
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
        sb.append("Agent(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", javaVersion=").append(String.valueOf(this.javaVersion));
        sb.append(", javaSecurityStatus=").append(String.valueOf(this.javaSecurityStatus));
        sb.append(", plugins=").append(String.valueOf(this.plugins));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Agent)) {
            return false;
        }

        Agent other = (Agent) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.javaVersion, other.javaVersion)
                && java.util.Objects.equals(this.javaSecurityStatus, other.javaSecurityStatus)
                && java.util.Objects.equals(this.plugins, other.plugins)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.javaVersion == null ? 43 : this.javaVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.javaSecurityStatus == null
                                ? 43
                                : this.javaSecurityStatus.hashCode());
        result = (result * PRIME) + (this.plugins == null ? 43 : this.plugins.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
