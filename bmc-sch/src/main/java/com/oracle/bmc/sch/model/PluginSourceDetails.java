/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * Details about a connector plugin used to fetch data from a source.
 * For configuration instructions, see
 * [Creating a Connector](https://docs.oracle.com/iaas/Content/connector-hub/create-service-connector.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PluginSourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PluginSourceDetails extends SourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the connector plugin. This name indicates the service to be called by the connector plugin. For example, {@code QueueSource} indicates the Queue service.
         * To find names of connector plugins, list the plugin using (ListConnectorPlugin)[#/en/serviceconnectors/latest/ConnectorPluginSummary/ListConnectorPlugins].
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pluginName")
        private String pluginName;

        /**
         * The name of the connector plugin. This name indicates the service to be called by the connector plugin. For example, {@code QueueSource} indicates the Queue service.
         * To find names of connector plugins, list the plugin using (ListConnectorPlugin)[#/en/serviceconnectors/latest/ConnectorPluginSummary/ListConnectorPlugins].
         *
         * @param pluginName the value to set
         * @return this builder
         **/
        public Builder pluginName(String pluginName) {
            this.pluginName = pluginName;
            this.__explicitlySet__.add("pluginName");
            return this;
        }
        /**
         * The configuration map for the connector plugin. This map includes parameters specific to the connector plugin type.
         * For example, for {@code QueueSource}, the map lists the OCID of the selected queue.
         * To find the parameters for a connector plugin, get the plugin using (GetConnectorPlugin)[#/en/serviceconnectors/latest/ConnectorPlugin/GetConnectorPlugin] and review its schema value.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configMap")
        private Object configMap;

        /**
         * The configuration map for the connector plugin. This map includes parameters specific to the connector plugin type.
         * For example, for {@code QueueSource}, the map lists the OCID of the selected queue.
         * To find the parameters for a connector plugin, get the plugin using (GetConnectorPlugin)[#/en/serviceconnectors/latest/ConnectorPlugin/GetConnectorPlugin] and review its schema value.
         *
         * @param configMap the value to set
         * @return this builder
         **/
        public Builder configMap(Object configMap) {
            this.configMap = configMap;
            this.__explicitlySet__.add("configMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PluginSourceDetails build() {
            PluginSourceDetails model = new PluginSourceDetails(this.pluginName, this.configMap);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PluginSourceDetails model) {
            if (model.wasPropertyExplicitlySet("pluginName")) {
                this.pluginName(model.getPluginName());
            }
            if (model.wasPropertyExplicitlySet("configMap")) {
                this.configMap(model.getConfigMap());
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

    @Deprecated
    public PluginSourceDetails(String pluginName, Object configMap) {
        super();
        this.pluginName = pluginName;
        this.configMap = configMap;
    }

    /**
     * The name of the connector plugin. This name indicates the service to be called by the connector plugin. For example, {@code QueueSource} indicates the Queue service.
     * To find names of connector plugins, list the plugin using (ListConnectorPlugin)[#/en/serviceconnectors/latest/ConnectorPluginSummary/ListConnectorPlugins].
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pluginName")
    private final String pluginName;

    /**
     * The name of the connector plugin. This name indicates the service to be called by the connector plugin. For example, {@code QueueSource} indicates the Queue service.
     * To find names of connector plugins, list the plugin using (ListConnectorPlugin)[#/en/serviceconnectors/latest/ConnectorPluginSummary/ListConnectorPlugins].
     *
     * @return the value
     **/
    public String getPluginName() {
        return pluginName;
    }

    /**
     * The configuration map for the connector plugin. This map includes parameters specific to the connector plugin type.
     * For example, for {@code QueueSource}, the map lists the OCID of the selected queue.
     * To find the parameters for a connector plugin, get the plugin using (GetConnectorPlugin)[#/en/serviceconnectors/latest/ConnectorPlugin/GetConnectorPlugin] and review its schema value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    private final Object configMap;

    /**
     * The configuration map for the connector plugin. This map includes parameters specific to the connector plugin type.
     * For example, for {@code QueueSource}, the map lists the OCID of the selected queue.
     * To find the parameters for a connector plugin, get the plugin using (GetConnectorPlugin)[#/en/serviceconnectors/latest/ConnectorPlugin/GetConnectorPlugin] and review its schema value.
     *
     * @return the value
     **/
    public Object getConfigMap() {
        return configMap;
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
        sb.append("PluginSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", pluginName=").append(String.valueOf(this.pluginName));
        sb.append(", configMap=").append(String.valueOf(this.configMap));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PluginSourceDetails)) {
            return false;
        }

        PluginSourceDetails other = (PluginSourceDetails) o;
        return java.util.Objects.equals(this.pluginName, other.pluginName)
                && java.util.Objects.equals(this.configMap, other.configMap)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.pluginName == null ? 43 : this.pluginName.hashCode());
        result = (result * PRIME) + (this.configMap == null ? 43 : this.configMap.hashCode());
        return result;
    }
}
