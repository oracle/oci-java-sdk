/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details of a new deployment to be created that will rerun a single stage from a previously
 * executed deployment. <br>
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
        builder = CreateSingleDeployStageRedeploymentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deploymentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSingleDeployStageRedeploymentDetails extends CreateDeploymentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineId")
        private String deployPipelineId;

        public Builder deployPipelineId(String deployPipelineId) {
            this.deployPipelineId = deployPipelineId;
            this.__explicitlySet__.add("deployPipelineId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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
        /** Specifies the OCID of the previous deployment to be redeployed. */
        @com.fasterxml.jackson.annotation.JsonProperty("previousDeploymentId")
        private String previousDeploymentId;

        /**
         * Specifies the OCID of the previous deployment to be redeployed.
         *
         * @param previousDeploymentId the value to set
         * @return this builder
         */
        public Builder previousDeploymentId(String previousDeploymentId) {
            this.previousDeploymentId = previousDeploymentId;
            this.__explicitlySet__.add("previousDeploymentId");
            return this;
        }
        /** Specifies the OCID of the stage to be redeployed. */
        @com.fasterxml.jackson.annotation.JsonProperty("deployStageId")
        private String deployStageId;

        /**
         * Specifies the OCID of the stage to be redeployed.
         *
         * @param deployStageId the value to set
         * @return this builder
         */
        public Builder deployStageId(String deployStageId) {
            this.deployStageId = deployStageId;
            this.__explicitlySet__.add("deployStageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSingleDeployStageRedeploymentDetails build() {
            CreateSingleDeployStageRedeploymentDetails model =
                    new CreateSingleDeployStageRedeploymentDetails(
                            this.deployPipelineId,
                            this.displayName,
                            this.freeformTags,
                            this.definedTags,
                            this.previousDeploymentId,
                            this.deployStageId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSingleDeployStageRedeploymentDetails model) {
            if (model.wasPropertyExplicitlySet("deployPipelineId")) {
                this.deployPipelineId(model.getDeployPipelineId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("previousDeploymentId")) {
                this.previousDeploymentId(model.getPreviousDeploymentId());
            }
            if (model.wasPropertyExplicitlySet("deployStageId")) {
                this.deployStageId(model.getDeployStageId());
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
    public CreateSingleDeployStageRedeploymentDetails(
            String deployPipelineId,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String previousDeploymentId,
            String deployStageId) {
        super(deployPipelineId, displayName, freeformTags, definedTags);
        this.previousDeploymentId = previousDeploymentId;
        this.deployStageId = deployStageId;
    }

    /** Specifies the OCID of the previous deployment to be redeployed. */
    @com.fasterxml.jackson.annotation.JsonProperty("previousDeploymentId")
    private final String previousDeploymentId;

    /**
     * Specifies the OCID of the previous deployment to be redeployed.
     *
     * @return the value
     */
    public String getPreviousDeploymentId() {
        return previousDeploymentId;
    }

    /** Specifies the OCID of the stage to be redeployed. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployStageId")
    private final String deployStageId;

    /**
     * Specifies the OCID of the stage to be redeployed.
     *
     * @return the value
     */
    public String getDeployStageId() {
        return deployStageId;
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
        sb.append("CreateSingleDeployStageRedeploymentDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", previousDeploymentId=").append(String.valueOf(this.previousDeploymentId));
        sb.append(", deployStageId=").append(String.valueOf(this.deployStageId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSingleDeployStageRedeploymentDetails)) {
            return false;
        }

        CreateSingleDeployStageRedeploymentDetails other =
                (CreateSingleDeployStageRedeploymentDetails) o;
        return java.util.Objects.equals(this.previousDeploymentId, other.previousDeploymentId)
                && java.util.Objects.equals(this.deployStageId, other.deployStageId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.previousDeploymentId == null
                                ? 43
                                : this.previousDeploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.deployStageId == null ? 43 : this.deployStageId.hashCode());
        return result;
    }
}
