/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies load balancer traffic shift stage. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LoadBalancerTrafficShiftDeployStage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deployStageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LoadBalancerTrafficShiftDeployStage extends DeployStage {
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
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
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
         * Specifies the target or destination backend set. Example: BLUE - Traffic from the
         * existing backends of managed Load Balance Listener to blue Backend IPs, as per
         * rolloutPolicy. GREEN - Traffic from the existing backends of managed Load Balance
         * Listener to green Backend IPs as per rolloutPolicy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trafficShiftTarget")
        private TrafficShiftTarget trafficShiftTarget;

        /**
         * Specifies the target or destination backend set. Example: BLUE - Traffic from the
         * existing backends of managed Load Balance Listener to blue Backend IPs, as per
         * rolloutPolicy. GREEN - Traffic from the existing backends of managed Load Balance
         * Listener to green Backend IPs as per rolloutPolicy.
         *
         * @param trafficShiftTarget the value to set
         * @return this builder
         */
        public Builder trafficShiftTarget(TrafficShiftTarget trafficShiftTarget) {
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

        public LoadBalancerTrafficShiftDeployStage build() {
            LoadBalancerTrafficShiftDeployStage model =
                    new LoadBalancerTrafficShiftDeployStage(
                            this.id,
                            this.description,
                            this.displayName,
                            this.projectId,
                            this.deployPipelineId,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.deployStagePredecessorCollection,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.blueBackendIps,
                            this.greenBackendIps,
                            this.trafficShiftTarget,
                            this.rolloutPolicy,
                            this.loadBalancerConfig,
                            this.rollbackPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoadBalancerTrafficShiftDeployStage model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("deployPipelineId")) {
                this.deployPipelineId(model.getDeployPipelineId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("deployStagePredecessorCollection")) {
                this.deployStagePredecessorCollection(model.getDeployStagePredecessorCollection());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("blueBackendIps")) {
                this.blueBackendIps(model.getBlueBackendIps());
            }
            if (model.wasPropertyExplicitlySet("greenBackendIps")) {
                this.greenBackendIps(model.getGreenBackendIps());
            }
            if (model.wasPropertyExplicitlySet("trafficShiftTarget")) {
                this.trafficShiftTarget(model.getTrafficShiftTarget());
            }
            if (model.wasPropertyExplicitlySet("rolloutPolicy")) {
                this.rolloutPolicy(model.getRolloutPolicy());
            }
            if (model.wasPropertyExplicitlySet("loadBalancerConfig")) {
                this.loadBalancerConfig(model.getLoadBalancerConfig());
            }
            if (model.wasPropertyExplicitlySet("rollbackPolicy")) {
                this.rollbackPolicy(model.getRollbackPolicy());
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

    @Deprecated
    public LoadBalancerTrafficShiftDeployStage(
            String id,
            String description,
            String displayName,
            String projectId,
            String deployPipelineId,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            BackendSetIpCollection blueBackendIps,
            BackendSetIpCollection greenBackendIps,
            TrafficShiftTarget trafficShiftTarget,
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
     * Specifies the target or destination backend set. Example: BLUE - Traffic from the existing
     * backends of managed Load Balance Listener to blue Backend IPs, as per rolloutPolicy. GREEN -
     * Traffic from the existing backends of managed Load Balance Listener to green Backend IPs as
     * per rolloutPolicy.
     */
    public enum TrafficShiftTarget implements com.oracle.bmc.http.internal.BmcEnum {
        AutoSelect("AUTO_SELECT"),
        Blue("BLUE"),
        Green("GREEN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TrafficShiftTarget.class);

        private final String value;
        private static java.util.Map<String, TrafficShiftTarget> map;

        static {
            map = new java.util.HashMap<>();
            for (TrafficShiftTarget v : TrafficShiftTarget.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TrafficShiftTarget(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TrafficShiftTarget create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TrafficShiftTarget', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the target or destination backend set. Example: BLUE - Traffic from the existing
     * backends of managed Load Balance Listener to blue Backend IPs, as per rolloutPolicy. GREEN -
     * Traffic from the existing backends of managed Load Balance Listener to green Backend IPs as
     * per rolloutPolicy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trafficShiftTarget")
    private final TrafficShiftTarget trafficShiftTarget;

    /**
     * Specifies the target or destination backend set. Example: BLUE - Traffic from the existing
     * backends of managed Load Balance Listener to blue Backend IPs, as per rolloutPolicy. GREEN -
     * Traffic from the existing backends of managed Load Balance Listener to green Backend IPs as
     * per rolloutPolicy.
     *
     * @return the value
     */
    public TrafficShiftTarget getTrafficShiftTarget() {
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
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LoadBalancerTrafficShiftDeployStage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", blueBackendIps=").append(String.valueOf(this.blueBackendIps));
        sb.append(", greenBackendIps=").append(String.valueOf(this.greenBackendIps));
        sb.append(", trafficShiftTarget=").append(String.valueOf(this.trafficShiftTarget));
        sb.append(", rolloutPolicy=").append(String.valueOf(this.rolloutPolicy));
        sb.append(", loadBalancerConfig=").append(String.valueOf(this.loadBalancerConfig));
        sb.append(", rollbackPolicy=").append(String.valueOf(this.rollbackPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoadBalancerTrafficShiftDeployStage)) {
            return false;
        }

        LoadBalancerTrafficShiftDeployStage other = (LoadBalancerTrafficShiftDeployStage) o;
        return java.util.Objects.equals(this.blueBackendIps, other.blueBackendIps)
                && java.util.Objects.equals(this.greenBackendIps, other.greenBackendIps)
                && java.util.Objects.equals(this.trafficShiftTarget, other.trafficShiftTarget)
                && java.util.Objects.equals(this.rolloutPolicy, other.rolloutPolicy)
                && java.util.Objects.equals(this.loadBalancerConfig, other.loadBalancerConfig)
                && java.util.Objects.equals(this.rollbackPolicy, other.rollbackPolicy)
                && super.equals(other);
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
        return result;
    }
}
