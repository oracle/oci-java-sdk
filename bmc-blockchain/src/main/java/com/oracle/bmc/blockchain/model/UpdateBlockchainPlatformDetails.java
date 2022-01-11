/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Blockchain Platform details for updating a service.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateBlockchainPlatformDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateBlockchainPlatformDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
        private Double storageSizeInTBs;

        public Builder storageSizeInTBs(Double storageSizeInTBs) {
            this.storageSizeInTBs = storageSizeInTBs;
            this.__explicitlySet__.add("storageSizeInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicas")
        private ReplicaDetails replicas;

        public Builder replicas(ReplicaDetails replicas) {
            this.replicas = replicas;
            this.__explicitlySet__.add("replicas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalOcpuCapacity")
        private Integer totalOcpuCapacity;

        public Builder totalOcpuCapacity(Integer totalOcpuCapacity) {
            this.totalOcpuCapacity = totalOcpuCapacity;
            this.__explicitlySet__.add("totalOcpuCapacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerShape")
        private BlockchainPlatform.LoadBalancerShape loadBalancerShape;

        public Builder loadBalancerShape(BlockchainPlatform.LoadBalancerShape loadBalancerShape) {
            this.loadBalancerShape = loadBalancerShape;
            this.__explicitlySet__.add("loadBalancerShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBlockchainPlatformDetails build() {
            UpdateBlockchainPlatformDetails __instance__ =
                    new UpdateBlockchainPlatformDetails(
                            description,
                            storageSizeInTBs,
                            replicas,
                            totalOcpuCapacity,
                            loadBalancerShape,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBlockchainPlatformDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .storageSizeInTBs(o.getStorageSizeInTBs())
                            .replicas(o.getReplicas())
                            .totalOcpuCapacity(o.getTotalOcpuCapacity())
                            .loadBalancerShape(o.getLoadBalancerShape())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * Platform Description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Storage size in TBs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
    Double storageSizeInTBs;

    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    ReplicaDetails replicas;

    /**
     * Number of total OCPUs to allocate
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalOcpuCapacity")
    Integer totalOcpuCapacity;

    /**
     * Type of Load Balancer shape - LB_100_MBPS or LB_400_MBPS. Default is LB_100_MBPS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerShape")
    BlockchainPlatform.LoadBalancerShape loadBalancerShape;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
