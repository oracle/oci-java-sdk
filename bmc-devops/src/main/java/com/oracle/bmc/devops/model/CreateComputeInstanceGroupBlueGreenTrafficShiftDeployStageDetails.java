/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the instance group blue-green deployment load balancer traffic shift stage.
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
    builder = CreateComputeInstanceGroupBlueGreenTrafficShiftDeployStageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateComputeInstanceGroupBlueGreenTrafficShiftDeployStageDetails
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
        /**
         * The OCID of the upstream compute instance group blue-green deployment stage in this pipeline.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "computeInstanceGroupBlueGreenDeploymentDeployStageId")
        private String computeInstanceGroupBlueGreenDeploymentDeployStageId;

        /**
         * The OCID of the upstream compute instance group blue-green deployment stage in this pipeline.
         * @param computeInstanceGroupBlueGreenDeploymentDeployStageId the value to set
         * @return this builder
         **/
        public Builder computeInstanceGroupBlueGreenDeploymentDeployStageId(
                String computeInstanceGroupBlueGreenDeploymentDeployStageId) {
            this.computeInstanceGroupBlueGreenDeploymentDeployStageId =
                    computeInstanceGroupBlueGreenDeploymentDeployStageId;
            this.__explicitlySet__.add("computeInstanceGroupBlueGreenDeploymentDeployStageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateComputeInstanceGroupBlueGreenTrafficShiftDeployStageDetails build() {
            CreateComputeInstanceGroupBlueGreenTrafficShiftDeployStageDetails model =
                    new CreateComputeInstanceGroupBlueGreenTrafficShiftDeployStageDetails(
                            this.description,
                            this.displayName,
                            this.deployPipelineId,
                            this.deployStagePredecessorCollection,
                            this.freeformTags,
                            this.definedTags,
                            this.computeInstanceGroupBlueGreenDeploymentDeployStageId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(
                CreateComputeInstanceGroupBlueGreenTrafficShiftDeployStageDetails model) {
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
            if (model.wasPropertyExplicitlySet(
                    "computeInstanceGroupBlueGreenDeploymentDeployStageId")) {
                this.computeInstanceGroupBlueGreenDeploymentDeployStageId(
                        model.getComputeInstanceGroupBlueGreenDeploymentDeployStageId());
            }
            return this;
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
    public CreateComputeInstanceGroupBlueGreenTrafficShiftDeployStageDetails(
            String description,
            String displayName,
            String deployPipelineId,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String computeInstanceGroupBlueGreenDeploymentDeployStageId) {
        super(
                description,
                displayName,
                deployPipelineId,
                deployStagePredecessorCollection,
                freeformTags,
                definedTags);
        this.computeInstanceGroupBlueGreenDeploymentDeployStageId =
                computeInstanceGroupBlueGreenDeploymentDeployStageId;
    }

    /**
     * The OCID of the upstream compute instance group blue-green deployment stage in this pipeline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "computeInstanceGroupBlueGreenDeploymentDeployStageId")
    private final String computeInstanceGroupBlueGreenDeploymentDeployStageId;

    /**
     * The OCID of the upstream compute instance group blue-green deployment stage in this pipeline.
     * @return the value
     **/
    public String getComputeInstanceGroupBlueGreenDeploymentDeployStageId() {
        return computeInstanceGroupBlueGreenDeploymentDeployStageId;
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
        sb.append("CreateComputeInstanceGroupBlueGreenTrafficShiftDeployStageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", computeInstanceGroupBlueGreenDeploymentDeployStageId=")
                .append(String.valueOf(this.computeInstanceGroupBlueGreenDeploymentDeployStageId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateComputeInstanceGroupBlueGreenTrafficShiftDeployStageDetails)) {
            return false;
        }

        CreateComputeInstanceGroupBlueGreenTrafficShiftDeployStageDetails other =
                (CreateComputeInstanceGroupBlueGreenTrafficShiftDeployStageDetails) o;
        return java.util.Objects.equals(
                        this.computeInstanceGroupBlueGreenDeploymentDeployStageId,
                        other.computeInstanceGroupBlueGreenDeploymentDeployStageId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.computeInstanceGroupBlueGreenDeploymentDeployStageId == null
                                ? 43
                                : this.computeInstanceGroupBlueGreenDeploymentDeployStageId
                                        .hashCode());
        return result;
    }
}
