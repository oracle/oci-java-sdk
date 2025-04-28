/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details of a new deployment to be created that will run a single stage of the pipeline. <br>
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
        builder = CreateSingleDeployStageDeploymentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deploymentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSingleDeployStageDeploymentDetails extends CreateDeploymentDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("deploymentArguments")
        private DeploymentArgumentCollection deploymentArguments;

        public Builder deploymentArguments(DeploymentArgumentCollection deploymentArguments) {
            this.deploymentArguments = deploymentArguments;
            this.__explicitlySet__.add("deploymentArguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployStageOverrideArguments")
        private DeployStageOverrideArgumentCollection deployStageOverrideArguments;

        public Builder deployStageOverrideArguments(
                DeployStageOverrideArgumentCollection deployStageOverrideArguments) {
            this.deployStageOverrideArguments = deployStageOverrideArguments;
            this.__explicitlySet__.add("deployStageOverrideArguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactOverrideArguments")
        private DeployArtifactOverrideArgumentCollection deployArtifactOverrideArguments;

        public Builder deployArtifactOverrideArguments(
                DeployArtifactOverrideArgumentCollection deployArtifactOverrideArguments) {
            this.deployArtifactOverrideArguments = deployArtifactOverrideArguments;
            this.__explicitlySet__.add("deployArtifactOverrideArguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSingleDeployStageDeploymentDetails build() {
            CreateSingleDeployStageDeploymentDetails model =
                    new CreateSingleDeployStageDeploymentDetails(
                            this.deployPipelineId,
                            this.displayName,
                            this.freeformTags,
                            this.definedTags,
                            this.deployStageId,
                            this.deploymentArguments,
                            this.deployStageOverrideArguments,
                            this.deployArtifactOverrideArguments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSingleDeployStageDeploymentDetails model) {
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
            if (model.wasPropertyExplicitlySet("deployStageId")) {
                this.deployStageId(model.getDeployStageId());
            }
            if (model.wasPropertyExplicitlySet("deploymentArguments")) {
                this.deploymentArguments(model.getDeploymentArguments());
            }
            if (model.wasPropertyExplicitlySet("deployStageOverrideArguments")) {
                this.deployStageOverrideArguments(model.getDeployStageOverrideArguments());
            }
            if (model.wasPropertyExplicitlySet("deployArtifactOverrideArguments")) {
                this.deployArtifactOverrideArguments(model.getDeployArtifactOverrideArguments());
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
    public CreateSingleDeployStageDeploymentDetails(
            String deployPipelineId,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String deployStageId,
            DeploymentArgumentCollection deploymentArguments,
            DeployStageOverrideArgumentCollection deployStageOverrideArguments,
            DeployArtifactOverrideArgumentCollection deployArtifactOverrideArguments) {
        super(deployPipelineId, displayName, freeformTags, definedTags);
        this.deployStageId = deployStageId;
        this.deploymentArguments = deploymentArguments;
        this.deployStageOverrideArguments = deployStageOverrideArguments;
        this.deployArtifactOverrideArguments = deployArtifactOverrideArguments;
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

    @com.fasterxml.jackson.annotation.JsonProperty("deploymentArguments")
    private final DeploymentArgumentCollection deploymentArguments;

    public DeploymentArgumentCollection getDeploymentArguments() {
        return deploymentArguments;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deployStageOverrideArguments")
    private final DeployStageOverrideArgumentCollection deployStageOverrideArguments;

    public DeployStageOverrideArgumentCollection getDeployStageOverrideArguments() {
        return deployStageOverrideArguments;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactOverrideArguments")
    private final DeployArtifactOverrideArgumentCollection deployArtifactOverrideArguments;

    public DeployArtifactOverrideArgumentCollection getDeployArtifactOverrideArguments() {
        return deployArtifactOverrideArguments;
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
        sb.append("CreateSingleDeployStageDeploymentDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", deployStageId=").append(String.valueOf(this.deployStageId));
        sb.append(", deploymentArguments=").append(String.valueOf(this.deploymentArguments));
        sb.append(", deployStageOverrideArguments=")
                .append(String.valueOf(this.deployStageOverrideArguments));
        sb.append(", deployArtifactOverrideArguments=")
                .append(String.valueOf(this.deployArtifactOverrideArguments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSingleDeployStageDeploymentDetails)) {
            return false;
        }

        CreateSingleDeployStageDeploymentDetails other =
                (CreateSingleDeployStageDeploymentDetails) o;
        return java.util.Objects.equals(this.deployStageId, other.deployStageId)
                && java.util.Objects.equals(this.deploymentArguments, other.deploymentArguments)
                && java.util.Objects.equals(
                        this.deployStageOverrideArguments, other.deployStageOverrideArguments)
                && java.util.Objects.equals(
                        this.deployArtifactOverrideArguments, other.deployArtifactOverrideArguments)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.deployStageId == null ? 43 : this.deployStageId.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentArguments == null
                                ? 43
                                : this.deploymentArguments.hashCode());
        result =
                (result * PRIME)
                        + (this.deployStageOverrideArguments == null
                                ? 43
                                : this.deployStageOverrideArguments.hashCode());
        result =
                (result * PRIME)
                        + (this.deployArtifactOverrideArguments == null
                                ? 43
                                : this.deployArtifactOverrideArguments.hashCode());
        return result;
    }
}
