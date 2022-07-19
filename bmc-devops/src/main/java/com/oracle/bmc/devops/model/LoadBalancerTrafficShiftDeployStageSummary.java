/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LoadBalancerTrafficShiftDeployStageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LoadBalancerTrafficShiftDeployStageSummary extends DeployStageSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineId")
        private String deployPipelineId;

        public Builder deployPipelineId(String deployPipelineId) {
            this.deployPipelineId = deployPipelineId;
            this.__explicitlySet__.add("deployPipelineId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DeployStage.LifecycleState lifecycleState;

        public Builder lifecycleState(DeployStage.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
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
        /**
         * Specifies the target or destination backend set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trafficShiftTarget")
        private LoadBalancerTrafficShiftDeployStage.TrafficShiftTarget trafficShiftTarget;

        /**
         * Specifies the target or destination backend set.
         * @param trafficShiftTarget the value to set
         * @return this builder
         **/
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

        public LoadBalancerTrafficShiftDeployStageSummary build() {
            LoadBalancerTrafficShiftDeployStageSummary __instance__ =
                    new LoadBalancerTrafficShiftDeployStageSummary(
                            id,
                            description,
                            displayName,
                            projectId,
                            deployPipelineId,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            deployStagePredecessorCollection,
                            freeformTags,
                            definedTags,
                            systemTags,
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
        public Builder copy(LoadBalancerTrafficShiftDeployStageSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .projectId(o.getProjectId())
                            .deployPipelineId(o.getDeployPipelineId())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .deployStagePredecessorCollection(
                                    o.getDeployStagePredecessorCollection())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public LoadBalancerTrafficShiftDeployStageSummary(
            String id,
            String description,
            String displayName,
            String projectId,
            String deployPipelineId,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            DeployStage.LifecycleState lifecycleState,
            String lifecycleDetails,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            BackendSetIpCollection blueBackendIps,
            BackendSetIpCollection greenBackendIps,
            LoadBalancerTrafficShiftDeployStage.TrafficShiftTarget trafficShiftTarget,
            LoadBalancerTrafficShiftRolloutPolicy rolloutPolicy,
            LoadBalancerConfig loadBalancerConfig,
            DeployStageRollbackPolicy rollbackPolicy) {
        super(
                id,
                description,
                displayName,
                projectId,
                deployPipelineId,
                compartmentId,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails,
                deployStagePredecessorCollection,
                freeformTags,
                definedTags,
                systemTags);
        this.blueBackendIps = blueBackendIps;
        this.greenBackendIps = greenBackendIps;
        this.trafficShiftTarget = trafficShiftTarget;
        this.rolloutPolicy = rolloutPolicy;
        this.loadBalancerConfig = loadBalancerConfig;
        this.rollbackPolicy = rollbackPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("blueBackendIps")
    private final BackendSetIpCollection blueBackendIps;

    public BackendSetIpCollection getBlueBackendIps() {
        return blueBackendIps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("greenBackendIps")
    private final BackendSetIpCollection greenBackendIps;

    public BackendSetIpCollection getGreenBackendIps() {
        return greenBackendIps;
    }

    /**
     * Specifies the target or destination backend set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trafficShiftTarget")
    private final LoadBalancerTrafficShiftDeployStage.TrafficShiftTarget trafficShiftTarget;

    /**
     * Specifies the target or destination backend set.
     * @return the value
     **/
    public LoadBalancerTrafficShiftDeployStage.TrafficShiftTarget getTrafficShiftTarget() {
        return trafficShiftTarget;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rolloutPolicy")
    private final LoadBalancerTrafficShiftRolloutPolicy rolloutPolicy;

    public LoadBalancerTrafficShiftRolloutPolicy getRolloutPolicy() {
        return rolloutPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerConfig")
    private final LoadBalancerConfig loadBalancerConfig;

    public LoadBalancerConfig getLoadBalancerConfig() {
        return loadBalancerConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rollbackPolicy")
    private final DeployStageRollbackPolicy rollbackPolicy;

    public DeployStageRollbackPolicy getRollbackPolicy() {
        return rollbackPolicy;
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
        sb.append("LoadBalancerTrafficShiftDeployStageSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", blueBackendIps=").append(String.valueOf(this.blueBackendIps));
        sb.append(", greenBackendIps=").append(String.valueOf(this.greenBackendIps));
        sb.append(", trafficShiftTarget=").append(String.valueOf(this.trafficShiftTarget));
        sb.append(", rolloutPolicy=").append(String.valueOf(this.rolloutPolicy));
        sb.append(", loadBalancerConfig=").append(String.valueOf(this.loadBalancerConfig));
        sb.append(", rollbackPolicy=").append(String.valueOf(this.rollbackPolicy));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoadBalancerTrafficShiftDeployStageSummary)) {
            return false;
        }

        LoadBalancerTrafficShiftDeployStageSummary other =
                (LoadBalancerTrafficShiftDeployStageSummary) o;
        return java.util.Objects.equals(this.blueBackendIps, other.blueBackendIps)
                && java.util.Objects.equals(this.greenBackendIps, other.greenBackendIps)
                && java.util.Objects.equals(this.trafficShiftTarget, other.trafficShiftTarget)
                && java.util.Objects.equals(this.rolloutPolicy, other.rolloutPolicy)
                && java.util.Objects.equals(this.loadBalancerConfig, other.loadBalancerConfig)
                && java.util.Objects.equals(this.rollbackPolicy, other.rollbackPolicy)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.blueBackendIps == null ? 43 : this.blueBackendIps.hashCode());
        result =
                (result * PRIME)
                        + (this.greenBackendIps == null ? 43 : this.greenBackendIps.hashCode());
        result =
                (result * PRIME)
                        + (this.trafficShiftTarget == null
                                ? 43
                                : this.trafficShiftTarget.hashCode());
        result =
                (result * PRIME)
                        + (this.rolloutPolicy == null ? 43 : this.rolloutPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerConfig == null
                                ? 43
                                : this.loadBalancerConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.rollbackPolicy == null ? 43 : this.rollbackPolicy.hashCode());
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
