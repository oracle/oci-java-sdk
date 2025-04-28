/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the build stage. <br>
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
        builder = CreateBuildStageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "buildPipelineStageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateBuildStageDetails extends CreateBuildPipelineStageDetails {
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
        /** Image name for the build environment */
        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private BuildStage.Image image;

        /**
         * Image name for the build environment
         *
         * @param image the value to set
         * @return this builder
         */
        public Builder image(BuildStage.Image image) {
            this.image = image;
            this.__explicitlySet__.add("image");
            return this;
        }
        /**
         * The path to the build specification file for this environment. The default location of
         * the file if not specified is build_spec.yaml.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("buildSpecFile")
        private String buildSpecFile;

        /**
         * The path to the build specification file for this environment. The default location of
         * the file if not specified is build_spec.yaml.
         *
         * @param buildSpecFile the value to set
         * @return this builder
         */
        public Builder buildSpecFile(String buildSpecFile) {
            this.buildSpecFile = buildSpecFile;
            this.__explicitlySet__.add("buildSpecFile");
            return this;
        }
        /** Timeout for the build stage execution. Specify value in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("stageExecutionTimeoutInSeconds")
        private Integer stageExecutionTimeoutInSeconds;

        /**
         * Timeout for the build stage execution. Specify value in seconds.
         *
         * @param stageExecutionTimeoutInSeconds the value to set
         * @return this builder
         */
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
        /**
         * Name of the build source where the build_spec.yml file is located. If not specified, the
         * first entry in the build source collection is chosen as primary build source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("primaryBuildSource")
        private String primaryBuildSource;

        /**
         * Name of the build source where the build_spec.yml file is located. If not specified, the
         * first entry in the build source collection is chosen as primary build source.
         *
         * @param primaryBuildSource the value to set
         * @return this builder
         */
        public Builder primaryBuildSource(String primaryBuildSource) {
            this.primaryBuildSource = primaryBuildSource;
            this.__explicitlySet__.add("primaryBuildSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildRunnerShapeConfig")
        private BuildRunnerShapeConfig buildRunnerShapeConfig;

        public Builder buildRunnerShapeConfig(BuildRunnerShapeConfig buildRunnerShapeConfig) {
            this.buildRunnerShapeConfig = buildRunnerShapeConfig;
            this.__explicitlySet__.add("buildRunnerShapeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateAccessConfig")
        private NetworkChannel privateAccessConfig;

        public Builder privateAccessConfig(NetworkChannel privateAccessConfig) {
            this.privateAccessConfig = privateAccessConfig;
            this.__explicitlySet__.add("privateAccessConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBuildStageDetails build() {
            CreateBuildStageDetails model =
                    new CreateBuildStageDetails(
                            this.displayName,
                            this.description,
                            this.buildPipelineId,
                            this.buildPipelineStagePredecessorCollection,
                            this.freeformTags,
                            this.definedTags,
                            this.image,
                            this.buildSpecFile,
                            this.stageExecutionTimeoutInSeconds,
                            this.buildSourceCollection,
                            this.primaryBuildSource,
                            this.buildRunnerShapeConfig,
                            this.privateAccessConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBuildStageDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("buildPipelineId")) {
                this.buildPipelineId(model.getBuildPipelineId());
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
            if (model.wasPropertyExplicitlySet("image")) {
                this.image(model.getImage());
            }
            if (model.wasPropertyExplicitlySet("buildSpecFile")) {
                this.buildSpecFile(model.getBuildSpecFile());
            }
            if (model.wasPropertyExplicitlySet("stageExecutionTimeoutInSeconds")) {
                this.stageExecutionTimeoutInSeconds(model.getStageExecutionTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("buildSourceCollection")) {
                this.buildSourceCollection(model.getBuildSourceCollection());
            }
            if (model.wasPropertyExplicitlySet("primaryBuildSource")) {
                this.primaryBuildSource(model.getPrimaryBuildSource());
            }
            if (model.wasPropertyExplicitlySet("buildRunnerShapeConfig")) {
                this.buildRunnerShapeConfig(model.getBuildRunnerShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("privateAccessConfig")) {
                this.privateAccessConfig(model.getPrivateAccessConfig());
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
            String primaryBuildSource,
            BuildRunnerShapeConfig buildRunnerShapeConfig,
            NetworkChannel privateAccessConfig) {
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
        this.buildRunnerShapeConfig = buildRunnerShapeConfig;
        this.privateAccessConfig = privateAccessConfig;
    }

    /** Image name for the build environment */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    private final BuildStage.Image image;

    /**
     * Image name for the build environment
     *
     * @return the value
     */
    public BuildStage.Image getImage() {
        return image;
    }

    /**
     * The path to the build specification file for this environment. The default location of the
     * file if not specified is build_spec.yaml.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildSpecFile")
    private final String buildSpecFile;

    /**
     * The path to the build specification file for this environment. The default location of the
     * file if not specified is build_spec.yaml.
     *
     * @return the value
     */
    public String getBuildSpecFile() {
        return buildSpecFile;
    }

    /** Timeout for the build stage execution. Specify value in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("stageExecutionTimeoutInSeconds")
    private final Integer stageExecutionTimeoutInSeconds;

    /**
     * Timeout for the build stage execution. Specify value in seconds.
     *
     * @return the value
     */
    public Integer getStageExecutionTimeoutInSeconds() {
        return stageExecutionTimeoutInSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("buildSourceCollection")
    private final BuildSourceCollection buildSourceCollection;

    public BuildSourceCollection getBuildSourceCollection() {
        return buildSourceCollection;
    }

    /**
     * Name of the build source where the build_spec.yml file is located. If not specified, the
     * first entry in the build source collection is chosen as primary build source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primaryBuildSource")
    private final String primaryBuildSource;

    /**
     * Name of the build source where the build_spec.yml file is located. If not specified, the
     * first entry in the build source collection is chosen as primary build source.
     *
     * @return the value
     */
    public String getPrimaryBuildSource() {
        return primaryBuildSource;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("buildRunnerShapeConfig")
    private final BuildRunnerShapeConfig buildRunnerShapeConfig;

    public BuildRunnerShapeConfig getBuildRunnerShapeConfig() {
        return buildRunnerShapeConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("privateAccessConfig")
    private final NetworkChannel privateAccessConfig;

    public NetworkChannel getPrivateAccessConfig() {
        return privateAccessConfig;
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
        sb.append("CreateBuildStageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", image=").append(String.valueOf(this.image));
        sb.append(", buildSpecFile=").append(String.valueOf(this.buildSpecFile));
        sb.append(", stageExecutionTimeoutInSeconds=")
                .append(String.valueOf(this.stageExecutionTimeoutInSeconds));
        sb.append(", buildSourceCollection=").append(String.valueOf(this.buildSourceCollection));
        sb.append(", primaryBuildSource=").append(String.valueOf(this.primaryBuildSource));
        sb.append(", buildRunnerShapeConfig=").append(String.valueOf(this.buildRunnerShapeConfig));
        sb.append(", privateAccessConfig=").append(String.valueOf(this.privateAccessConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBuildStageDetails)) {
            return false;
        }

        CreateBuildStageDetails other = (CreateBuildStageDetails) o;
        return java.util.Objects.equals(this.image, other.image)
                && java.util.Objects.equals(this.buildSpecFile, other.buildSpecFile)
                && java.util.Objects.equals(
                        this.stageExecutionTimeoutInSeconds, other.stageExecutionTimeoutInSeconds)
                && java.util.Objects.equals(this.buildSourceCollection, other.buildSourceCollection)
                && java.util.Objects.equals(this.primaryBuildSource, other.primaryBuildSource)
                && java.util.Objects.equals(
                        this.buildRunnerShapeConfig, other.buildRunnerShapeConfig)
                && java.util.Objects.equals(this.privateAccessConfig, other.privateAccessConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.image == null ? 43 : this.image.hashCode());
        result =
                (result * PRIME)
                        + (this.buildSpecFile == null ? 43 : this.buildSpecFile.hashCode());
        result =
                (result * PRIME)
                        + (this.stageExecutionTimeoutInSeconds == null
                                ? 43
                                : this.stageExecutionTimeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.buildSourceCollection == null
                                ? 43
                                : this.buildSourceCollection.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryBuildSource == null
                                ? 43
                                : this.primaryBuildSource.hashCode());
        result =
                (result * PRIME)
                        + (this.buildRunnerShapeConfig == null
                                ? 43
                                : this.buildRunnerShapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.privateAccessConfig == null
                                ? 43
                                : this.privateAccessConfig.hashCode());
        return result;
    }
}
