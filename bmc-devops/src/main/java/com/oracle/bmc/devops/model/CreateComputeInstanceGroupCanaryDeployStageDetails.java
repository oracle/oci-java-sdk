/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Instance Group Canary deployment stage. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateComputeInstanceGroupCanaryDeployStageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deployStageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateComputeInstanceGroupCanaryDeployStageDetails
        extends CreateDeployStageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineId")
        private String deployPipelineId;

        public Builder deployPipelineId(String deployPipelineId) {
            this.deployPipelineId = deployPipelineId;
            this.__explicitlySet__.add("deployPipelineId");
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
        /** A compute instance group environment OCID for Canary deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeInstanceGroupDeployEnvironmentId")
        private String computeInstanceGroupDeployEnvironmentId;

        /**
         * A compute instance group environment OCID for Canary deployment.
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
        /** The list of file artifact OCIDs to deploy. */
        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactIds")
        private java.util.List<String> deployArtifactIds;

        /**
         * The list of file artifact OCIDs to deploy.
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

        @com.fasterxml.jackson.annotation.JsonProperty("testLoadBalancerConfig")
        private LoadBalancerConfig testLoadBalancerConfig;

        public Builder testLoadBalancerConfig(LoadBalancerConfig testLoadBalancerConfig) {
            this.testLoadBalancerConfig = testLoadBalancerConfig;
            this.__explicitlySet__.add("testLoadBalancerConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("productionLoadBalancerConfig")
        private LoadBalancerConfig productionLoadBalancerConfig;

        public Builder productionLoadBalancerConfig(
                LoadBalancerConfig productionLoadBalancerConfig) {
            this.productionLoadBalancerConfig = productionLoadBalancerConfig;
            this.__explicitlySet__.add("productionLoadBalancerConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateComputeInstanceGroupCanaryDeployStageDetails build() {
            CreateComputeInstanceGroupCanaryDeployStageDetails model =
                    new CreateComputeInstanceGroupCanaryDeployStageDetails(
                            this.description,
                            this.displayName,
                            this.deployPipelineId,
                            this.deployStagePredecessorCollection,
                            this.freeformTags,
                            this.definedTags,
                            this.computeInstanceGroupDeployEnvironmentId,
                            this.deploymentSpecDeployArtifactId,
                            this.deployArtifactIds,
                            this.rolloutPolicy,
                            this.testLoadBalancerConfig,
                            this.productionLoadBalancerConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateComputeInstanceGroupCanaryDeployStageDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("deployPipelineId")) {
                this.deployPipelineId(model.getDeployPipelineId());
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
            if (model.wasPropertyExplicitlySet("testLoadBalancerConfig")) {
                this.testLoadBalancerConfig(model.getTestLoadBalancerConfig());
            }
            if (model.wasPropertyExplicitlySet("productionLoadBalancerConfig")) {
                this.productionLoadBalancerConfig(model.getProductionLoadBalancerConfig());
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
    public CreateComputeInstanceGroupCanaryDeployStageDetails(
            String description,
            String displayName,
            String deployPipelineId,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String computeInstanceGroupDeployEnvironmentId,
            String deploymentSpecDeployArtifactId,
            java.util.List<String> deployArtifactIds,
            ComputeInstanceGroupRolloutPolicy rolloutPolicy,
            LoadBalancerConfig testLoadBalancerConfig,
            LoadBalancerConfig productionLoadBalancerConfig) {
        super(
                description,
                displayName,
                deployPipelineId,
                deployStagePredecessorCollection,
                freeformTags,
                definedTags);
        this.computeInstanceGroupDeployEnvironmentId = computeInstanceGroupDeployEnvironmentId;
        this.deploymentSpecDeployArtifactId = deploymentSpecDeployArtifactId;
        this.deployArtifactIds = deployArtifactIds;
        this.rolloutPolicy = rolloutPolicy;
        this.testLoadBalancerConfig = testLoadBalancerConfig;
        this.productionLoadBalancerConfig = productionLoadBalancerConfig;
    }

    /** A compute instance group environment OCID for Canary deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeInstanceGroupDeployEnvironmentId")
    private final String computeInstanceGroupDeployEnvironmentId;

    /**
     * A compute instance group environment OCID for Canary deployment.
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

    /** The list of file artifact OCIDs to deploy. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactIds")
    private final java.util.List<String> deployArtifactIds;

    /**
     * The list of file artifact OCIDs to deploy.
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

    @com.fasterxml.jackson.annotation.JsonProperty("testLoadBalancerConfig")
    private final LoadBalancerConfig testLoadBalancerConfig;

    public LoadBalancerConfig getTestLoadBalancerConfig() {
        return testLoadBalancerConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("productionLoadBalancerConfig")
    private final LoadBalancerConfig productionLoadBalancerConfig;

    public LoadBalancerConfig getProductionLoadBalancerConfig() {
        return productionLoadBalancerConfig;
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
        sb.append("CreateComputeInstanceGroupCanaryDeployStageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", computeInstanceGroupDeployEnvironmentId=")
                .append(String.valueOf(this.computeInstanceGroupDeployEnvironmentId));
        sb.append(", deploymentSpecDeployArtifactId=")
                .append(String.valueOf(this.deploymentSpecDeployArtifactId));
        sb.append(", deployArtifactIds=").append(String.valueOf(this.deployArtifactIds));
        sb.append(", rolloutPolicy=").append(String.valueOf(this.rolloutPolicy));
        sb.append(", testLoadBalancerConfig=").append(String.valueOf(this.testLoadBalancerConfig));
        sb.append(", productionLoadBalancerConfig=")
                .append(String.valueOf(this.productionLoadBalancerConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateComputeInstanceGroupCanaryDeployStageDetails)) {
            return false;
        }

        CreateComputeInstanceGroupCanaryDeployStageDetails other =
                (CreateComputeInstanceGroupCanaryDeployStageDetails) o;
        return java.util.Objects.equals(
                        this.computeInstanceGroupDeployEnvironmentId,
                        other.computeInstanceGroupDeployEnvironmentId)
                && java.util.Objects.equals(
                        this.deploymentSpecDeployArtifactId, other.deploymentSpecDeployArtifactId)
                && java.util.Objects.equals(this.deployArtifactIds, other.deployArtifactIds)
                && java.util.Objects.equals(this.rolloutPolicy, other.rolloutPolicy)
                && java.util.Objects.equals(
                        this.testLoadBalancerConfig, other.testLoadBalancerConfig)
                && java.util.Objects.equals(
                        this.productionLoadBalancerConfig, other.productionLoadBalancerConfig)
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
                        + (this.testLoadBalancerConfig == null
                                ? 43
                                : this.testLoadBalancerConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.productionLoadBalancerConfig == null
                                ? 43
                                : this.productionLoadBalancerConfig.hashCode());
        return result;
    }
}
