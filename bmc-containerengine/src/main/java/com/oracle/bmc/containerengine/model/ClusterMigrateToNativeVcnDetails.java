/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a request to migrate a cluster to Native VCN.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ClusterMigrateToNativeVcnDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClusterMigrateToNativeVcnDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"endpointConfig", "decommissionDelayDuration"})
    public ClusterMigrateToNativeVcnDetails(
            ClusterEndpointConfig endpointConfig, String decommissionDelayDuration) {
        super();
        this.endpointConfig = endpointConfig;
        this.decommissionDelayDuration = decommissionDelayDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The network configuration for access to the Cluster control plane.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpointConfig")
        private ClusterEndpointConfig endpointConfig;

        /**
         * The network configuration for access to the Cluster control plane.
         *
         * @param endpointConfig the value to set
         * @return this builder
         **/
        public Builder endpointConfig(ClusterEndpointConfig endpointConfig) {
            this.endpointConfig = endpointConfig;
            this.__explicitlySet__.add("endpointConfig");
            return this;
        }
        /**
         * The optional override of the non-native endpoint decommission time after migration is complete. Defaults to 30 days.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("decommissionDelayDuration")
        private String decommissionDelayDuration;

        /**
         * The optional override of the non-native endpoint decommission time after migration is complete. Defaults to 30 days.
         * @param decommissionDelayDuration the value to set
         * @return this builder
         **/
        public Builder decommissionDelayDuration(String decommissionDelayDuration) {
            this.decommissionDelayDuration = decommissionDelayDuration;
            this.__explicitlySet__.add("decommissionDelayDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterMigrateToNativeVcnDetails build() {
            ClusterMigrateToNativeVcnDetails __instance__ =
                    new ClusterMigrateToNativeVcnDetails(endpointConfig, decommissionDelayDuration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterMigrateToNativeVcnDetails o) {
            Builder copiedBuilder =
                    endpointConfig(o.getEndpointConfig())
                            .decommissionDelayDuration(o.getDecommissionDelayDuration());

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
     * The network configuration for access to the Cluster control plane.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpointConfig")
    private final ClusterEndpointConfig endpointConfig;

    /**
     * The network configuration for access to the Cluster control plane.
     *
     * @return the value
     **/
    public ClusterEndpointConfig getEndpointConfig() {
        return endpointConfig;
    }

    /**
     * The optional override of the non-native endpoint decommission time after migration is complete. Defaults to 30 days.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("decommissionDelayDuration")
    private final String decommissionDelayDuration;

    /**
     * The optional override of the non-native endpoint decommission time after migration is complete. Defaults to 30 days.
     * @return the value
     **/
    public String getDecommissionDelayDuration() {
        return decommissionDelayDuration;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ClusterMigrateToNativeVcnDetails(");
        sb.append("endpointConfig=").append(String.valueOf(this.endpointConfig));
        sb.append(", decommissionDelayDuration=")
                .append(String.valueOf(this.decommissionDelayDuration));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterMigrateToNativeVcnDetails)) {
            return false;
        }

        ClusterMigrateToNativeVcnDetails other = (ClusterMigrateToNativeVcnDetails) o;
        return java.util.Objects.equals(this.endpointConfig, other.endpointConfig)
                && java.util.Objects.equals(
                        this.decommissionDelayDuration, other.decommissionDelayDuration)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.endpointConfig == null ? 43 : this.endpointConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.decommissionDelayDuration == null
                                ? 43
                                : this.decommissionDelayDuration.hashCode());
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
