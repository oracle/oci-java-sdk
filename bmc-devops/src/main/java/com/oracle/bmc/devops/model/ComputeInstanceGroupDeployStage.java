/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Instance Group Rolling deployment stage. <br>
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
        builder = ComputeInstanceGroupDeployStage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deployStageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ComputeInstanceGroupDeployStage extends DeployStage {
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
        /** A compute instance group environment OCID for rolling deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeInstanceGroupDeployEnvironmentId")
        private String computeInstanceGroupDeployEnvironmentId;

        /**
         * A compute instance group environment OCID for rolling deployment.
         *
         * @param computeInstanceGroupDeployEnvironmentId the value to set
         * @return this builder
         */
        public Builder computeInstanceGroupDeployEnvironmentId(
                String computeInstanceGroupDeployEnvironmentId) {
            this.computeInstanceGroupDeployEnvironmentId = computeInstanceGroupDeployEnvironmentId;
            this.__explicitlySet__.add("computeInstanceGroupDeployEnvironmentId");
            return this;
        }
        /** The OCID of the artifact that contains the deployment specification. */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentSpecDeployArtifactId")
        private String deploymentSpecDeployArtifactId;

        /**
         * The OCID of the artifact that contains the deployment specification.
         *
         * @param deploymentSpecDeployArtifactId the value to set
         * @return this builder
         */
        public Builder deploymentSpecDeployArtifactId(String deploymentSpecDeployArtifactId) {
            this.deploymentSpecDeployArtifactId = deploymentSpecDeployArtifactId;
            this.__explicitlySet__.add("deploymentSpecDeployArtifactId");
            return this;
        }
        /** Additional file artifact OCIDs. */
        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactIds")
        private java.util.List<String> deployArtifactIds;

        /**
         * Additional file artifact OCIDs.
         *
         * @param deployArtifactIds the value to set
         * @return this builder
         */
        public Builder deployArtifactIds(java.util.List<String> deployArtifactIds) {
            this.deployArtifactIds = deployArtifactIds;
            this.__explicitlySet__.add("deployArtifactIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rolloutPolicy")
        private ComputeInstanceGroupRolloutPolicy rolloutPolicy;

        public Builder rolloutPolicy(ComputeInstanceGroupRolloutPolicy rolloutPolicy) {
            this.rolloutPolicy = rolloutPolicy;
            this.__explicitlySet__.add("rolloutPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rollbackPolicy")
        private DeployStageRollbackPolicy rollbackPolicy;

        public Builder rollbackPolicy(DeployStageRollbackPolicy rollbackPolicy) {
            this.rollbackPolicy = rollbackPolicy;
            this.__explicitlySet__.add("rollbackPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failurePolicy")
        private ComputeInstanceGroupFailurePolicy failurePolicy;

        public Builder failurePolicy(ComputeInstanceGroupFailurePolicy failurePolicy) {
            this.failurePolicy = failurePolicy;
            this.__explicitlySet__.add("failurePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerConfig")
        private LoadBalancerConfig loadBalancerConfig;

        public Builder loadBalancerConfig(LoadBalancerConfig loadBalancerConfig) {
            this.loadBalancerConfig = loadBalancerConfig;
            this.__explicitlySet__.add("loadBalancerConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeInstanceGroupDeployStage build() {
            ComputeInstanceGroupDeployStage model =
                    new ComputeInstanceGroupDeployStage(
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
                            this.computeInstanceGroupDeployEnvironmentId,
                            this.deploymentSpecDeployArtifactId,
                            this.deployArtifactIds,
                            this.rolloutPolicy,
                            this.rollbackPolicy,
                            this.failurePolicy,
                            this.loadBalancerConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeInstanceGroupDeployStage model) {
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
            if (model.wasPropertyExplicitlySet("computeInstanceGroupDeployEnvironmentId")) {
                this.computeInstanceGroupDeployEnvironmentId(
                        model.getComputeInstanceGroupDeployEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("deploymentSpecDeployArtifactId")) {
                this.deploymentSpecDeployArtifactId(model.getDeploymentSpecDeployArtifactId());
            }
            if (model.wasPropertyExplicitlySet("deployArtifactIds")) {
                this.deployArtifactIds(model.getDeployArtifactIds());
            }
            if (model.wasPropertyExplicitlySet("rolloutPolicy")) {
                this.rolloutPolicy(model.getRolloutPolicy());
            }
            if (model.wasPropertyExplicitlySet("rollbackPolicy")) {
                this.rollbackPolicy(model.getRollbackPolicy());
            }
            if (model.wasPropertyExplicitlySet("failurePolicy")) {
                this.failurePolicy(model.getFailurePolicy());
            }
            if (model.wasPropertyExplicitlySet("loadBalancerConfig")) {
                this.loadBalancerConfig(model.getLoadBalancerConfig());
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
    public ComputeInstanceGroupDeployStage(
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
            String computeInstanceGroupDeployEnvironmentId,
            String deploymentSpecDeployArtifactId,
            java.util.List<String> deployArtifactIds,
            ComputeInstanceGroupRolloutPolicy rolloutPolicy,
            DeployStageRollbackPolicy rollbackPolicy,
            ComputeInstanceGroupFailurePolicy failurePolicy,
            LoadBalancerConfig loadBalancerConfig) {
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
        this.computeInstanceGroupDeployEnvironmentId = computeInstanceGroupDeployEnvironmentId;
        this.deploymentSpecDeployArtifactId = deploymentSpecDeployArtifactId;
        this.deployArtifactIds = deployArtifactIds;
        this.rolloutPolicy = rolloutPolicy;
        this.rollbackPolicy = rollbackPolicy;
        this.failurePolicy = failurePolicy;
        this.loadBalancerConfig = loadBalancerConfig;
    }

    /** A compute instance group environment OCID for rolling deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeInstanceGroupDeployEnvironmentId")
    private final String computeInstanceGroupDeployEnvironmentId;

    /**
     * A compute instance group environment OCID for rolling deployment.
     *
     * @return the value
     */
    public String getComputeInstanceGroupDeployEnvironmentId() {
        return computeInstanceGroupDeployEnvironmentId;
    }

    /** The OCID of the artifact that contains the deployment specification. */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentSpecDeployArtifactId")
    private final String deploymentSpecDeployArtifactId;

    /**
     * The OCID of the artifact that contains the deployment specification.
     *
     * @return the value
     */
    public String getDeploymentSpecDeployArtifactId() {
        return deploymentSpecDeployArtifactId;
    }

    /** Additional file artifact OCIDs. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactIds")
    private final java.util.List<String> deployArtifactIds;

    /**
     * Additional file artifact OCIDs.
     *
     * @return the value
     */
    public java.util.List<String> getDeployArtifactIds() {
        return deployArtifactIds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rolloutPolicy")
    private final ComputeInstanceGroupRolloutPolicy rolloutPolicy;

    public ComputeInstanceGroupRolloutPolicy getRolloutPolicy() {
        return rolloutPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rollbackPolicy")
    private final DeployStageRollbackPolicy rollbackPolicy;

    public DeployStageRollbackPolicy getRollbackPolicy() {
        return rollbackPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("failurePolicy")
    private final ComputeInstanceGroupFailurePolicy failurePolicy;

    public ComputeInstanceGroupFailurePolicy getFailurePolicy() {
        return failurePolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerConfig")
    private final LoadBalancerConfig loadBalancerConfig;

    public LoadBalancerConfig getLoadBalancerConfig() {
        return loadBalancerConfig;
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
        sb.append("ComputeInstanceGroupDeployStage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", computeInstanceGroupDeployEnvironmentId=")
                .append(String.valueOf(this.computeInstanceGroupDeployEnvironmentId));
        sb.append(", deploymentSpecDeployArtifactId=")
                .append(String.valueOf(this.deploymentSpecDeployArtifactId));
        sb.append(", deployArtifactIds=").append(String.valueOf(this.deployArtifactIds));
        sb.append(", rolloutPolicy=").append(String.valueOf(this.rolloutPolicy));
        sb.append(", rollbackPolicy=").append(String.valueOf(this.rollbackPolicy));
        sb.append(", failurePolicy=").append(String.valueOf(this.failurePolicy));
        sb.append(", loadBalancerConfig=").append(String.valueOf(this.loadBalancerConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeInstanceGroupDeployStage)) {
            return false;
        }

        ComputeInstanceGroupDeployStage other = (ComputeInstanceGroupDeployStage) o;
        return java.util.Objects.equals(
                        this.computeInstanceGroupDeployEnvironmentId,
                        other.computeInstanceGroupDeployEnvironmentId)
                && java.util.Objects.equals(
                        this.deploymentSpecDeployArtifactId, other.deploymentSpecDeployArtifactId)
                && java.util.Objects.equals(this.deployArtifactIds, other.deployArtifactIds)
                && java.util.Objects.equals(this.rolloutPolicy, other.rolloutPolicy)
                && java.util.Objects.equals(this.rollbackPolicy, other.rollbackPolicy)
                && java.util.Objects.equals(this.failurePolicy, other.failurePolicy)
                && java.util.Objects.equals(this.loadBalancerConfig, other.loadBalancerConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.computeInstanceGroupDeployEnvironmentId == null
                                ? 43
                                : this.computeInstanceGroupDeployEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentSpecDeployArtifactId == null
                                ? 43
                                : this.deploymentSpecDeployArtifactId.hashCode());
        result =
                (result * PRIME)
                        + (this.deployArtifactIds == null ? 43 : this.deployArtifactIds.hashCode());
        result =
                (result * PRIME)
                        + (this.rolloutPolicy == null ? 43 : this.rolloutPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.rollbackPolicy == null ? 43 : this.rollbackPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.failurePolicy == null ? 43 : this.failurePolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerConfig == null
                                ? 43
                                : this.loadBalancerConfig.hashCode());
        return result;
    }
}
