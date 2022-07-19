/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Container Engine for Kubernetes (OKE) cluster canary deployment traffic shift stage.
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
    builder = OkeCanaryTrafficShiftDeployStage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OkeCanaryTrafficShiftDeployStage extends DeployStage {
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
        /**
         * The OCID of an upstream OKE canary deployment stage in this pipeline.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("okeCanaryDeployStageId")
        private String okeCanaryDeployStageId;

        /**
         * The OCID of an upstream OKE canary deployment stage in this pipeline.
         * @param okeCanaryDeployStageId the value to set
         * @return this builder
         **/
        public Builder okeCanaryDeployStageId(String okeCanaryDeployStageId) {
            this.okeCanaryDeployStageId = okeCanaryDeployStageId;
            this.__explicitlySet__.add("okeCanaryDeployStageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rolloutPolicy")
        private LoadBalancerTrafficShiftRolloutPolicy rolloutPolicy;

        public Builder rolloutPolicy(LoadBalancerTrafficShiftRolloutPolicy rolloutPolicy) {
            this.rolloutPolicy = rolloutPolicy;
            this.__explicitlySet__.add("rolloutPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OkeCanaryTrafficShiftDeployStage build() {
            OkeCanaryTrafficShiftDeployStage __instance__ =
                    new OkeCanaryTrafficShiftDeployStage(
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
                            okeCanaryDeployStageId,
                            rolloutPolicy);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OkeCanaryTrafficShiftDeployStage o) {
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
                            .okeCanaryDeployStageId(o.getOkeCanaryDeployStageId())
                            .rolloutPolicy(o.getRolloutPolicy());

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
    public OkeCanaryTrafficShiftDeployStage(
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
            String okeCanaryDeployStageId,
            LoadBalancerTrafficShiftRolloutPolicy rolloutPolicy) {
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
        this.okeCanaryDeployStageId = okeCanaryDeployStageId;
        this.rolloutPolicy = rolloutPolicy;
    }

    /**
     * The OCID of an upstream OKE canary deployment stage in this pipeline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("okeCanaryDeployStageId")
    private final String okeCanaryDeployStageId;

    /**
     * The OCID of an upstream OKE canary deployment stage in this pipeline.
     * @return the value
     **/
    public String getOkeCanaryDeployStageId() {
        return okeCanaryDeployStageId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rolloutPolicy")
    private final LoadBalancerTrafficShiftRolloutPolicy rolloutPolicy;

    public LoadBalancerTrafficShiftRolloutPolicy getRolloutPolicy() {
        return rolloutPolicy;
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
        sb.append("OkeCanaryTrafficShiftDeployStage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", okeCanaryDeployStageId=").append(String.valueOf(this.okeCanaryDeployStageId));
        sb.append(", rolloutPolicy=").append(String.valueOf(this.rolloutPolicy));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OkeCanaryTrafficShiftDeployStage)) {
            return false;
        }

        OkeCanaryTrafficShiftDeployStage other = (OkeCanaryTrafficShiftDeployStage) o;
        return java.util.Objects.equals(this.okeCanaryDeployStageId, other.okeCanaryDeployStageId)
                && java.util.Objects.equals(this.rolloutPolicy, other.rolloutPolicy)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.okeCanaryDeployStageId == null
                                ? 43
                                : this.okeCanaryDeployStageId.hashCode());
        result =
                (result * PRIME)
                        + (this.rolloutPolicy == null ? 43 : this.rolloutPolicy.hashCode());
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
