/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Container Engine for Kubernetes (OKE) cluster Canary deployment stage. <br>
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
        builder = OkeCanaryDeployStageSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deployStageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OkeCanaryDeployStageSummary extends DeployStageSummary {
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
        /** Kubernetes cluster environment OCID for deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("okeClusterDeployEnvironmentId")
        private String okeClusterDeployEnvironmentId;

        /**
         * Kubernetes cluster environment OCID for deployment.
         *
         * @param okeClusterDeployEnvironmentId the value to set
         * @return this builder
         */
        public Builder okeClusterDeployEnvironmentId(String okeClusterDeployEnvironmentId) {
            this.okeClusterDeployEnvironmentId = okeClusterDeployEnvironmentId;
            this.__explicitlySet__.add("okeClusterDeployEnvironmentId");
            return this;
        }
        /** List of Kubernetes manifest artifact OCIDs. */
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesManifestDeployArtifactIds")
        private java.util.List<String> kubernetesManifestDeployArtifactIds;

        /**
         * List of Kubernetes manifest artifact OCIDs.
         *
         * @param kubernetesManifestDeployArtifactIds the value to set
         * @return this builder
         */
        public Builder kubernetesManifestDeployArtifactIds(
                java.util.List<String> kubernetesManifestDeployArtifactIds) {
            this.kubernetesManifestDeployArtifactIds = kubernetesManifestDeployArtifactIds;
            this.__explicitlySet__.add("kubernetesManifestDeployArtifactIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canaryStrategy")
        private OkeCanaryStrategy canaryStrategy;

        public Builder canaryStrategy(OkeCanaryStrategy canaryStrategy) {
            this.canaryStrategy = canaryStrategy;
            this.__explicitlySet__.add("canaryStrategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OkeCanaryDeployStageSummary build() {
            OkeCanaryDeployStageSummary model =
                    new OkeCanaryDeployStageSummary(
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
                            this.okeClusterDeployEnvironmentId,
                            this.kubernetesManifestDeployArtifactIds,
                            this.canaryStrategy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OkeCanaryDeployStageSummary model) {
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
            if (model.wasPropertyExplicitlySet("okeClusterDeployEnvironmentId")) {
                this.okeClusterDeployEnvironmentId(model.getOkeClusterDeployEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("kubernetesManifestDeployArtifactIds")) {
                this.kubernetesManifestDeployArtifactIds(
                        model.getKubernetesManifestDeployArtifactIds());
            }
            if (model.wasPropertyExplicitlySet("canaryStrategy")) {
                this.canaryStrategy(model.getCanaryStrategy());
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
    public OkeCanaryDeployStageSummary(
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
            String okeClusterDeployEnvironmentId,
            java.util.List<String> kubernetesManifestDeployArtifactIds,
            OkeCanaryStrategy canaryStrategy) {
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
        this.okeClusterDeployEnvironmentId = okeClusterDeployEnvironmentId;
        this.kubernetesManifestDeployArtifactIds = kubernetesManifestDeployArtifactIds;
        this.canaryStrategy = canaryStrategy;
    }

    /** Kubernetes cluster environment OCID for deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("okeClusterDeployEnvironmentId")
    private final String okeClusterDeployEnvironmentId;

    /**
     * Kubernetes cluster environment OCID for deployment.
     *
     * @return the value
     */
    public String getOkeClusterDeployEnvironmentId() {
        return okeClusterDeployEnvironmentId;
    }

    /** List of Kubernetes manifest artifact OCIDs. */
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesManifestDeployArtifactIds")
    private final java.util.List<String> kubernetesManifestDeployArtifactIds;

    /**
     * List of Kubernetes manifest artifact OCIDs.
     *
     * @return the value
     */
    public java.util.List<String> getKubernetesManifestDeployArtifactIds() {
        return kubernetesManifestDeployArtifactIds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("canaryStrategy")
    private final OkeCanaryStrategy canaryStrategy;

    public OkeCanaryStrategy getCanaryStrategy() {
        return canaryStrategy;
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
        sb.append("OkeCanaryDeployStageSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", okeClusterDeployEnvironmentId=")
                .append(String.valueOf(this.okeClusterDeployEnvironmentId));
        sb.append(", kubernetesManifestDeployArtifactIds=")
                .append(String.valueOf(this.kubernetesManifestDeployArtifactIds));
        sb.append(", canaryStrategy=").append(String.valueOf(this.canaryStrategy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OkeCanaryDeployStageSummary)) {
            return false;
        }

        OkeCanaryDeployStageSummary other = (OkeCanaryDeployStageSummary) o;
        return java.util.Objects.equals(
                        this.okeClusterDeployEnvironmentId, other.okeClusterDeployEnvironmentId)
                && java.util.Objects.equals(
                        this.kubernetesManifestDeployArtifactIds,
                        other.kubernetesManifestDeployArtifactIds)
                && java.util.Objects.equals(this.canaryStrategy, other.canaryStrategy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.okeClusterDeployEnvironmentId == null
                                ? 43
                                : this.okeClusterDeployEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.kubernetesManifestDeployArtifactIds == null
                                ? 43
                                : this.kubernetesManifestDeployArtifactIds.hashCode());
        result =
                (result * PRIME)
                        + (this.canaryStrategy == null ? 43 : this.canaryStrategy.hashCode());
        return result;
    }
}
