/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies trigger Deployment Pipleline stage which runs another pipeline of the application.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateTriggerDeploymentStageDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "buildPipelineStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateTriggerDeploymentStageDetails extends UpdateBuildPipelineStageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineId")
        private String deployPipelineId;

        public Builder deployPipelineId(String deployPipelineId) {
            this.deployPipelineId = deployPipelineId;
            this.__explicitlySet__.add("deployPipelineId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPassAllParametersEnabled")
        private Boolean isPassAllParametersEnabled;

        public Builder isPassAllParametersEnabled(Boolean isPassAllParametersEnabled) {
            this.isPassAllParametersEnabled = isPassAllParametersEnabled;
            this.__explicitlySet__.add("isPassAllParametersEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTriggerDeploymentStageDetails build() {
            UpdateTriggerDeploymentStageDetails __instance__ =
                    new UpdateTriggerDeploymentStageDetails(
                            displayName,
                            description,
                            buildPipelineStagePredecessorCollection,
                            freeformTags,
                            definedTags,
                            deployPipelineId,
                            isPassAllParametersEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTriggerDeploymentStageDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .buildPipelineStagePredecessorCollection(
                                    o.getBuildPipelineStagePredecessorCollection())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .deployPipelineId(o.getDeployPipelineId())
                            .isPassAllParametersEnabled(o.getIsPassAllParametersEnabled());

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

    /**
     * A target Pipeline ocid that will be run in this stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployPipelineId")
    String deployPipelineId;

    /**
     * A boolean flag specifies whether the parameters should be passed during the deployment trigger.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPassAllParametersEnabled")
    Boolean isPassAllParametersEnabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
