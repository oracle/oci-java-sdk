/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the canary approval stage. <br>
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
        builder = CreateComputeInstanceGroupCanaryApprovalDeployStageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deployStageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateComputeInstanceGroupCanaryApprovalDeployStageDetails
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
        /** A compute instance group canary traffic shift stage OCID for load balancer. */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "computeInstanceGroupCanaryTrafficShiftDeployStageId")
        private String computeInstanceGroupCanaryTrafficShiftDeployStageId;

        /**
         * A compute instance group canary traffic shift stage OCID for load balancer.
         *
         * @param computeInstanceGroupCanaryTrafficShiftDeployStageId the value to set
         * @return this builder
         */
        public Builder computeInstanceGroupCanaryTrafficShiftDeployStageId(
                String computeInstanceGroupCanaryTrafficShiftDeployStageId) {
            this.computeInstanceGroupCanaryTrafficShiftDeployStageId =
                    computeInstanceGroupCanaryTrafficShiftDeployStageId;
            this.__explicitlySet__.add("computeInstanceGroupCanaryTrafficShiftDeployStageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approvalPolicy")
        private ApprovalPolicy approvalPolicy;

        public Builder approvalPolicy(ApprovalPolicy approvalPolicy) {
            this.approvalPolicy = approvalPolicy;
            this.__explicitlySet__.add("approvalPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateComputeInstanceGroupCanaryApprovalDeployStageDetails build() {
            CreateComputeInstanceGroupCanaryApprovalDeployStageDetails model =
                    new CreateComputeInstanceGroupCanaryApprovalDeployStageDetails(
                            this.description,
                            this.displayName,
                            this.deployPipelineId,
                            this.deployStagePredecessorCollection,
                            this.freeformTags,
                            this.definedTags,
                            this.computeInstanceGroupCanaryTrafficShiftDeployStageId,
                            this.approvalPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateComputeInstanceGroupCanaryApprovalDeployStageDetails model) {
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
                    "computeInstanceGroupCanaryTrafficShiftDeployStageId")) {
                this.computeInstanceGroupCanaryTrafficShiftDeployStageId(
                        model.getComputeInstanceGroupCanaryTrafficShiftDeployStageId());
            }
            if (model.wasPropertyExplicitlySet("approvalPolicy")) {
                this.approvalPolicy(model.getApprovalPolicy());
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
    public CreateComputeInstanceGroupCanaryApprovalDeployStageDetails(
            String description,
            String displayName,
            String deployPipelineId,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String computeInstanceGroupCanaryTrafficShiftDeployStageId,
            ApprovalPolicy approvalPolicy) {
        super(
                description,
                displayName,
                deployPipelineId,
                deployStagePredecessorCollection,
                freeformTags,
                definedTags);
        this.computeInstanceGroupCanaryTrafficShiftDeployStageId =
                computeInstanceGroupCanaryTrafficShiftDeployStageId;
        this.approvalPolicy = approvalPolicy;
    }

    /** A compute instance group canary traffic shift stage OCID for load balancer. */
    @com.fasterxml.jackson.annotation.JsonProperty(
            "computeInstanceGroupCanaryTrafficShiftDeployStageId")
    private final String computeInstanceGroupCanaryTrafficShiftDeployStageId;

    /**
     * A compute instance group canary traffic shift stage OCID for load balancer.
     *
     * @return the value
     */
    public String getComputeInstanceGroupCanaryTrafficShiftDeployStageId() {
        return computeInstanceGroupCanaryTrafficShiftDeployStageId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("approvalPolicy")
    private final ApprovalPolicy approvalPolicy;

    public ApprovalPolicy getApprovalPolicy() {
        return approvalPolicy;
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
        sb.append("CreateComputeInstanceGroupCanaryApprovalDeployStageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", computeInstanceGroupCanaryTrafficShiftDeployStageId=")
                .append(String.valueOf(this.computeInstanceGroupCanaryTrafficShiftDeployStageId));
        sb.append(", approvalPolicy=").append(String.valueOf(this.approvalPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateComputeInstanceGroupCanaryApprovalDeployStageDetails)) {
            return false;
        }

        CreateComputeInstanceGroupCanaryApprovalDeployStageDetails other =
                (CreateComputeInstanceGroupCanaryApprovalDeployStageDetails) o;
        return java.util.Objects.equals(
                        this.computeInstanceGroupCanaryTrafficShiftDeployStageId,
                        other.computeInstanceGroupCanaryTrafficShiftDeployStageId)
                && java.util.Objects.equals(this.approvalPolicy, other.approvalPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.computeInstanceGroupCanaryTrafficShiftDeployStageId == null
                                ? 43
                                : this.computeInstanceGroupCanaryTrafficShiftDeployStageId
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.approvalPolicy == null ? 43 : this.approvalPolicy.hashCode());
        return result;
    }
}
