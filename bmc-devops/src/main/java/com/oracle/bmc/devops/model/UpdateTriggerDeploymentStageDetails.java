/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Trigger Deployment stage, which runs another pipeline of the application. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateTriggerDeploymentStageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "buildPipelineStageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateTriggerDeploymentStageDetails extends UpdateBuildPipelineStageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStagePredecessorCollection")
        private BuildPipelineStagePredecessorCollection buildPipelineStagePredecessorCollection;

        public Builder buildPipelineStagePredecessorCollection(
                BuildPipelineStagePredecessorCollection buildPipelineStagePredecessorCollection) {
            this.buildPipelineStagePredecessorCollection = buildPipelineStagePredecessorCollection;
            this.__explicitlySet__.add("buildPipelineStagePredecessorCollection");
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
        /** A target deployment pipeline OCID that will run in this stage. */
        @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineId")
        private String deployPipelineId;

        /**
         * A target deployment pipeline OCID that will run in this stage.
         *
         * @param deployPipelineId the value to set
         * @return this builder
         */
        public Builder deployPipelineId(String deployPipelineId) {
            this.deployPipelineId = deployPipelineId;
            this.__explicitlySet__.add("deployPipelineId");
            return this;
        }
        /**
         * A boolean flag that specifies whether all the parameters must be passed when the
         * deployment is triggered.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPassAllParametersEnabled")
        private Boolean isPassAllParametersEnabled;

        /**
         * A boolean flag that specifies whether all the parameters must be passed when the
         * deployment is triggered.
         *
         * @param isPassAllParametersEnabled the value to set
         * @return this builder
         */
        public Builder isPassAllParametersEnabled(Boolean isPassAllParametersEnabled) {
            this.isPassAllParametersEnabled = isPassAllParametersEnabled;
            this.__explicitlySet__.add("isPassAllParametersEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTriggerDeploymentStageDetails build() {
            UpdateTriggerDeploymentStageDetails model =
                    new UpdateTriggerDeploymentStageDetails(
                            this.displayName,
                            this.description,
                            this.buildPipelineStagePredecessorCollection,
                            this.freeformTags,
                            this.definedTags,
                            this.deployPipelineId,
                            this.isPassAllParametersEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTriggerDeploymentStageDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("buildPipelineStagePredecessorCollection")) {
                this.buildPipelineStagePredecessorCollection(
                        model.getBuildPipelineStagePredecessorCollection());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("deployPipelineId")) {
                this.deployPipelineId(model.getDeployPipelineId());
            }
            if (model.wasPropertyExplicitlySet("isPassAllParametersEnabled")) {
                this.isPassAllParametersEnabled(model.getIsPassAllParametersEnabled());
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
    public UpdateTriggerDeploymentStageDetails(
            String displayName,
            String description,
            BuildPipelineStagePredecessorCollection buildPipelineStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String deployPipelineId,
            Boolean isPassAllParametersEnabled) {
        super(
                displayName,
                description,
                buildPipelineStagePredecessorCollection,
                freeformTags,
                definedTags);
        this.deployPipelineId = deployPipelineId;
        this.isPassAllParametersEnabled = isPassAllParametersEnabled;
    }

    /** A target deployment pipeline OCID that will run in this stage. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineId")
    private final String deployPipelineId;

    /**
     * A target deployment pipeline OCID that will run in this stage.
     *
     * @return the value
     */
    public String getDeployPipelineId() {
        return deployPipelineId;
    }

    /**
     * A boolean flag that specifies whether all the parameters must be passed when the deployment
     * is triggered.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPassAllParametersEnabled")
    private final Boolean isPassAllParametersEnabled;

    /**
     * A boolean flag that specifies whether all the parameters must be passed when the deployment
     * is triggered.
     *
     * @return the value
     */
    public Boolean getIsPassAllParametersEnabled() {
        return isPassAllParametersEnabled;
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
        sb.append("UpdateTriggerDeploymentStageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", deployPipelineId=").append(String.valueOf(this.deployPipelineId));
        sb.append(", isPassAllParametersEnabled=")
                .append(String.valueOf(this.isPassAllParametersEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTriggerDeploymentStageDetails)) {
            return false;
        }

        UpdateTriggerDeploymentStageDetails other = (UpdateTriggerDeploymentStageDetails) o;
        return java.util.Objects.equals(this.deployPipelineId, other.deployPipelineId)
                && java.util.Objects.equals(
                        this.isPassAllParametersEnabled, other.isPassAllParametersEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.deployPipelineId == null ? 43 : this.deployPipelineId.hashCode());
        result =
                (result * PRIME)
                        + (this.isPassAllParametersEnabled == null
                                ? 43
                                : this.isPassAllParametersEnabled.hashCode());
        return result;
    }
}
