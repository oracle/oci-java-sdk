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
public final class ManagementAgentPluginAggregationDimensions
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pluginName", "pluginDisplayName"})
    public ManagementAgentPluginAggregationDimensions(String pluginName, String pluginDisplayName) {
        super();
        this.pluginName = pluginName;
        this.pluginDisplayName = pluginDisplayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Management Agent Plugin Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pluginName")
        private String pluginName;

        /**
         * Management Agent Plugin Name
         * @param pluginName the value to set
         * @return this builder
         **/
        public Builder pluginName(String pluginName) {
            this.pluginName = pluginName;
            this.__explicitlySet__.add("pluginName");
            return this;
        }
        /**
         * Management Agent Plugin Display Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pluginDisplayName")
        private String pluginDisplayName;

        /**
         * Management Agent Plugin Display Name
         * @param pluginDisplayName the value to set
         * @return this builder
         **/
        public Builder pluginDisplayName(String pluginDisplayName) {
            this.pluginDisplayName = pluginDisplayName;
            this.__explicitlySet__.add("pluginDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementAgentPluginAggregationDimensions build() {
            ManagementAgentPluginAggregationDimensions model =
                    new ManagementAgentPluginAggregationDimensions(
                            this.pluginName, this.pluginDisplayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementAgentPluginAggregationDimensions model) {
            if (model.wasPropertyExplicitlySet("pluginName")) {
                this.pluginName(model.getPluginName());
            }
            if (model.wasPropertyExplicitlySet("pluginDisplayName")) {
                this.pluginDisplayName(model.getPluginDisplayName());
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
     * Management Agent Plugin Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pluginName")
    private final String pluginName;

    /**
     * Management Agent Plugin Name
     * @return the value
     **/
    public String getPluginName() {
        return pluginName;
    }

    /**
     * Management Agent Plugin Display Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pluginDisplayName")
    private final String pluginDisplayName;

    /**
     * Management Agent Plugin Display Name
     * @return the value
     **/
    public String getPluginDisplayName() {
        return pluginDisplayName;
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
        sb.append("ManagementAgentPluginAggregationDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("pluginName=").append(String.valueOf(this.pluginName));
        sb.append(", pluginDisplayName=").append(String.valueOf(this.pluginDisplayName));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pluginName == null ? 43 : this.pluginName.hashCode());
        result =
                (result * PRIME)
                        + (this.pluginDisplayName == null ? 43 : this.pluginDisplayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
