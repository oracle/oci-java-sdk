/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * The configuration of plugins associated with this instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceAgentPluginConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class InstanceAgentPluginConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "desiredState"})
    public InstanceAgentPluginConfigDetails(String name, DesiredState desiredState) {
        super();
        this.name = name;
        this.desiredState = desiredState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The plugin name. To get a list of available plugins, use the {@link
         * #listInstanceagentAvailablePlugins(ListInstanceagentAvailablePluginsRequest)
         * listInstanceagentAvailablePlugins} operation in the Oracle Cloud Agent API. For more
         * information about the available plugins, see [Managing Plugins with Oracle Cloud
         * Agent](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/manage-plugins.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The plugin name. To get a list of available plugins, use the {@link
         * #listInstanceagentAvailablePlugins(ListInstanceagentAvailablePluginsRequest)
         * listInstanceagentAvailablePlugins} operation in the Oracle Cloud Agent API. For more
         * information about the available plugins, see [Managing Plugins with Oracle Cloud
         * Agent](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/manage-plugins.htm).
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Whether the plugin should be enabled or disabled.
         *
         * <p>To enable the monitoring and management plugins, the {@code isMonitoringDisabled} and
         * {@code isManagementDisabled} attributes must also be set to false.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("desiredState")
        private DesiredState desiredState;

        /**
         * Whether the plugin should be enabled or disabled.
         *
         * <p>To enable the monitoring and management plugins, the {@code isMonitoringDisabled} and
         * {@code isManagementDisabled} attributes must also be set to false.
         *
         * @param desiredState the value to set
         * @return this builder
         */
        public Builder desiredState(DesiredState desiredState) {
            this.desiredState = desiredState;
            this.__explicitlySet__.add("desiredState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAgentPluginConfigDetails build() {
            InstanceAgentPluginConfigDetails model =
                    new InstanceAgentPluginConfigDetails(this.name, this.desiredState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentPluginConfigDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("desiredState")) {
                this.desiredState(model.getDesiredState());
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
     * The plugin name. To get a list of available plugins, use the {@link
     * #listInstanceagentAvailablePlugins(ListInstanceagentAvailablePluginsRequest)
     * listInstanceagentAvailablePlugins} operation in the Oracle Cloud Agent API. For more
     * information about the available plugins, see [Managing Plugins with Oracle Cloud
     * Agent](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/manage-plugins.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The plugin name. To get a list of available plugins, use the {@link
     * #listInstanceagentAvailablePlugins(ListInstanceagentAvailablePluginsRequest)
     * listInstanceagentAvailablePlugins} operation in the Oracle Cloud Agent API. For more
     * information about the available plugins, see [Managing Plugins with Oracle Cloud
     * Agent](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/manage-plugins.htm).
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Whether the plugin should be enabled or disabled.
     *
     * <p>To enable the monitoring and management plugins, the {@code isMonitoringDisabled} and
     * {@code isManagementDisabled} attributes must also be set to false.
     */
    public enum DesiredState implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DesiredState.class);

        private final String value;
        private static java.util.Map<String, DesiredState> map;

        static {
            map = new java.util.HashMap<>();
            for (DesiredState v : DesiredState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DesiredState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DesiredState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DesiredState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Whether the plugin should be enabled or disabled.
     *
     * <p>To enable the monitoring and management plugins, the {@code isMonitoringDisabled} and
     * {@code isManagementDisabled} attributes must also be set to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("desiredState")
    private final DesiredState desiredState;

    /**
     * Whether the plugin should be enabled or disabled.
     *
     * <p>To enable the monitoring and management plugins, the {@code isMonitoringDisabled} and
     * {@code isManagementDisabled} attributes must also be set to false.
     *
     * @return the value
     */
    public DesiredState getDesiredState() {
        return desiredState;
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
        sb.append("InstanceAgentPluginConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", desiredState=").append(String.valueOf(this.desiredState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceAgentPluginConfigDetails)) {
            return false;
        }

        InstanceAgentPluginConfigDetails other = (InstanceAgentPluginConfigDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.desiredState, other.desiredState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.desiredState == null ? 43 : this.desiredState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
