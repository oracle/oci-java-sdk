/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * The Aggregation of Management Agent Plugin Dimensions
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
    builder = ManagementAgentPluginAggregationDimensions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagementAgentPluginAggregationDimensions {
    @Deprecated
    @java.beans.ConstructorProperties({"pluginName", "pluginDisplayName"})
    public ManagementAgentPluginAggregationDimensions(String pluginName, String pluginDisplayName) {
        super();
        this.pluginName = pluginName;
        this.pluginDisplayName = pluginDisplayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("pluginName")
        private String pluginName;

        public Builder pluginName(String pluginName) {
            this.pluginName = pluginName;
            this.__explicitlySet__.add("pluginName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pluginDisplayName")
        private String pluginDisplayName;

        public Builder pluginDisplayName(String pluginDisplayName) {
            this.pluginDisplayName = pluginDisplayName;
            this.__explicitlySet__.add("pluginDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementAgentPluginAggregationDimensions build() {
            ManagementAgentPluginAggregationDimensions __instance__ =
                    new ManagementAgentPluginAggregationDimensions(pluginName, pluginDisplayName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementAgentPluginAggregationDimensions o) {
            Builder copiedBuilder =
                    pluginName(o.getPluginName()).pluginDisplayName(o.getPluginDisplayName());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Management Agent Plugin Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pluginName")
    private final String pluginName;

    public String getPluginName() {
        return pluginName;
    }

    /**
     * Management Agent Plugin Display Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pluginDisplayName")
    private final String pluginDisplayName;

    public String getPluginDisplayName() {
        return pluginDisplayName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ManagementAgentPluginAggregationDimensions(");
        sb.append("pluginName=").append(String.valueOf(this.pluginName));
        sb.append(", pluginDisplayName=").append(String.valueOf(this.pluginDisplayName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementAgentPluginAggregationDimensions)) {
            return false;
        }

        ManagementAgentPluginAggregationDimensions other =
                (ManagementAgentPluginAggregationDimensions) o;
        return java.util.Objects.equals(this.pluginName, other.pluginName)
                && java.util.Objects.equals(this.pluginDisplayName, other.pluginDisplayName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pluginName == null ? 43 : this.pluginName.hashCode());
        result =
                (result * PRIME)
                        + (this.pluginDisplayName == null ? 43 : this.pluginDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
