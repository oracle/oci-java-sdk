/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies load balancer traffic shift stage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateLoadBalancerTrafficShiftDeployStageDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateLoadBalancerTrafficShiftDeployStageDetails extends UpdateDeployStageDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessorCollection")
        private DeployStagePredecessorCollection deployStagePredecessorCollection;

        public Builder deployStagePredecessorCollection(
                DeployStagePredecessorCollection deployStagePredecessorCollection) {
            this.deployStagePredecessorCollection = deployStagePredecessorCollection;
            this.__explicitlySet__.add("deployStagePredecessorCollection");
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

        @com.fasterxml.jackson.annotation.JsonProperty("blueBackendIps")
        private BackendSetIpCollection blueBackendIps;

        public Builder blueBackendIps(BackendSetIpCollection blueBackendIps) {
            this.blueBackendIps = blueBackendIps;
            this.__explicitlySet__.add("blueBackendIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("greenBackendIps")
        private BackendSetIpCollection greenBackendIps;

        public Builder greenBackendIps(BackendSetIpCollection greenBackendIps) {
            this.greenBackendIps = greenBackendIps;
            this.__explicitlySet__.add("greenBackendIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trafficShiftTarget")
        private LoadBalancerTrafficShiftDeployStage.TrafficShiftTarget trafficShiftTarget;

        public Builder trafficShiftTarget(
                LoadBalancerTrafficShiftDeployStage.TrafficShiftTarget trafficShiftTarget) {
            this.trafficShiftTarget = trafficShiftTarget;
            this.__explicitlySet__.add("trafficShiftTarget");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rolloutPolicy")
        private LoadBalancerTrafficShiftRolloutPolicy rolloutPolicy;

        public Builder rolloutPolicy(LoadBalancerTrafficShiftRolloutPolicy rolloutPolicy) {
            this.rolloutPolicy = rolloutPolicy;
            this.__explicitlySet__.add("rolloutPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerConfig")
        private LoadBalancerConfig loadBalancerConfig;

        public Builder loadBalancerConfig(LoadBalancerConfig loadBalancerConfig) {
            this.loadBalancerConfig = loadBalancerConfig;
            this.__explicitlySet__.add("loadBalancerConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rollbackPolicy")
        private DeployStageRollbackPolicy rollbackPolicy;

        public Builder rollbackPolicy(DeployStageRollbackPolicy rollbackPolicy) {
            this.rollbackPolicy = rollbackPolicy;
            this.__explicitlySet__.add("rollbackPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateLoadBalancerTrafficShiftDeployStageDetails build() {
            UpdateLoadBalancerTrafficShiftDeployStageDetails __instance__ =
                    new UpdateLoadBalancerTrafficShiftDeployStageDetails(
                            description,
                            displayName,
                            deployStagePredecessorCollection,
                            freeformTags,
                            definedTags,
                            blueBackendIps,
                            greenBackendIps,
                            trafficShiftTarget,
                            rolloutPolicy,
                            loadBalancerConfig,
                            rollbackPolicy);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateLoadBalancerTrafficShiftDeployStageDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .deployStagePredecessorCollection(
                                    o.getDeployStagePredecessorCollection())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .blueBackendIps(o.getBlueBackendIps())
                            .greenBackendIps(o.getGreenBackendIps())
                            .trafficShiftTarget(o.getTrafficShiftTarget())
                            .rolloutPolicy(o.getRolloutPolicy())
                            .loadBalancerConfig(o.getLoadBalancerConfig())
                            .rollbackPolicy(o.getRollbackPolicy());

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

    @Deprecated
    public UpdateLoadBalancerTrafficShiftDeployStageDetails(
            String description,
            String displayName,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            BackendSetIpCollection blueBackendIps,
            BackendSetIpCollection greenBackendIps,
            LoadBalancerTrafficShiftDeployStage.TrafficShiftTarget trafficShiftTarget,
            LoadBalancerTrafficShiftRolloutPolicy rolloutPolicy,
            LoadBalancerConfig loadBalancerConfig,
            DeployStageRollbackPolicy rollbackPolicy) {
        super(
                description,
                displayName,
                deployStagePredecessorCollection,
                freeformTags,
                definedTags);
        this.blueBackendIps = blueBackendIps;
        this.greenBackendIps = greenBackendIps;
        this.trafficShiftTarget = trafficShiftTarget;
        this.rolloutPolicy = rolloutPolicy;
        this.loadBalancerConfig = loadBalancerConfig;
        this.rollbackPolicy = rollbackPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("blueBackendIps")
    BackendSetIpCollection blueBackendIps;

    @com.fasterxml.jackson.annotation.JsonProperty("greenBackendIps")
    BackendSetIpCollection greenBackendIps;

    /**
     * Specifies the target or destination backend set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trafficShiftTarget")
    LoadBalancerTrafficShiftDeployStage.TrafficShiftTarget trafficShiftTarget;

    @com.fasterxml.jackson.annotation.JsonProperty("rolloutPolicy")
    LoadBalancerTrafficShiftRolloutPolicy rolloutPolicy;

    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerConfig")
    LoadBalancerConfig loadBalancerConfig;

    @com.fasterxml.jackson.annotation.JsonProperty("rollbackPolicy")
    DeployStageRollbackPolicy rollbackPolicy;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
