/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Build Stage.
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
    builder = CreateBuildStageDetails.Builder.class
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
public class CreateBuildStageDetails extends CreateBuildPipelineStageDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineId")
        private String buildPipelineId;

        public Builder buildPipelineId(String buildPipelineId) {
            this.buildPipelineId = buildPipelineId;
            this.__explicitlySet__.add("buildPipelineId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private BuildStage.Image image;

        public Builder image(BuildStage.Image image) {
            this.image = image;
            this.__explicitlySet__.add("image");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildSpecFile")
        private String buildSpecFile;

        public Builder buildSpecFile(String buildSpecFile) {
            this.buildSpecFile = buildSpecFile;
            this.__explicitlySet__.add("buildSpecFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stageExecutionTimeoutInSeconds")
        private Integer stageExecutionTimeoutInSeconds;

        public Builder stageExecutionTimeoutInSeconds(Integer stageExecutionTimeoutInSeconds) {
            this.stageExecutionTimeoutInSeconds = stageExecutionTimeoutInSeconds;
            this.__explicitlySet__.add("stageExecutionTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildSourceCollection")
        private BuildSourceCollection buildSourceCollection;

        public Builder buildSourceCollection(BuildSourceCollection buildSourceCollection) {
            this.buildSourceCollection = buildSourceCollection;
            this.__explicitlySet__.add("buildSourceCollection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("primaryBuildSource")
        private String primaryBuildSource;

        public Builder primaryBuildSource(String primaryBuildSource) {
            this.primaryBuildSource = primaryBuildSource;
            this.__explicitlySet__.add("primaryBuildSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBuildStageDetails build() {
            CreateBuildStageDetails __instance__ =
                    new CreateBuildStageDetails(
                            displayName,
                            description,
                            buildPipelineId,
                            buildPipelineStagePredecessorCollection,
                            freeformTags,
                            definedTags,
                            image,
                            buildSpecFile,
                            stageExecutionTimeoutInSeconds,
                            buildSourceCollection,
                            primaryBuildSource);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBuildStageDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .buildPipelineId(o.getBuildPipelineId())
                            .buildPipelineStagePredecessorCollection(
                                    o.getBuildPipelineStagePredecessorCollection())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .image(o.getImage())
                            .buildSpecFile(o.getBuildSpecFile())
                            .stageExecutionTimeoutInSeconds(o.getStageExecutionTimeoutInSeconds())
                            .buildSourceCollection(o.getBuildSourceCollection())
                            .primaryBuildSource(o.getPrimaryBuildSource());

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
    public CreateBuildStageDetails(
            String displayName,
            String description,
            String buildPipelineId,
            BuildPipelineStagePredecessorCollection buildPipelineStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            BuildStage.Image image,
            String buildSpecFile,
            Integer stageExecutionTimeoutInSeconds,
            BuildSourceCollection buildSourceCollection,
            String primaryBuildSource) {
        super(
                displayName,
                description,
                buildPipelineId,
                buildPipelineStagePredecessorCollection,
                freeformTags,
                definedTags);
        this.image = image;
        this.buildSpecFile = buildSpecFile;
        this.stageExecutionTimeoutInSeconds = stageExecutionTimeoutInSeconds;
        this.buildSourceCollection = buildSourceCollection;
        this.primaryBuildSource = primaryBuildSource;
    }

    /**
     * Image name for the Build Environment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    BuildStage.Image image;

    /**
     * The path to the build specification file for this Environment. The default location if not specified is build_spec.yaml
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buildSpecFile")
    String buildSpecFile;

    /**
     * Timeout for the Build Stage Execution. Value in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stageExecutionTimeoutInSeconds")
    Integer stageExecutionTimeoutInSeconds;

    @com.fasterxml.jackson.annotation.JsonProperty("buildSourceCollection")
    BuildSourceCollection buildSourceCollection;

    /**
     * Name of the BuildSource in which the build_spec.yml file need to be located. If not specified, the 1st entry in the BuildSource collection will be chosen as Primary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryBuildSource")
    String primaryBuildSource;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
