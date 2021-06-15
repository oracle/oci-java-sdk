/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ClusterMigrateToNativeVcnDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ClusterMigrateToNativeVcnDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("endpointConfig")
        private ClusterEndpointConfig endpointConfig;

        public Builder endpointConfig(ClusterEndpointConfig endpointConfig) {
            this.endpointConfig = endpointConfig;
            this.__explicitlySet__.add("endpointConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("decommissionDelayDuration")
        private String decommissionDelayDuration;

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

    /**
     * The network configuration for access to the Cluster control plane.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpointConfig")
    ClusterEndpointConfig endpointConfig;

    /**
     * The optional override of the non-native endpoint decommission time after migration is complete. Defaults to 30 days.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("decommissionDelayDuration")
    String decommissionDelayDuration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
