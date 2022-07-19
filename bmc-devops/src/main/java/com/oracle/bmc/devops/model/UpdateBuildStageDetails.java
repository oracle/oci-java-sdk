/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the build stage.
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
    builder = UpdateBuildStageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "buildPipelineStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateBuildStageDetails extends UpdateBuildPipelineStageDetails {
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
        /**
         * Image name for the build environment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private BuildStage.Image image;

        /**
         * Image name for the build environment.
         * @param image the value to set
         * @return this builder
         **/
        public Builder image(BuildStage.Image image) {
            this.image = image;
            this.__explicitlySet__.add("image");
            return this;
        }
        /**
         * The path to the build specification file for this environment. The default location of the file if not specified is build_spec.yaml.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("buildSpecFile")
        private String buildSpecFile;

        /**
         * The path to the build specification file for this environment. The default location of the file if not specified is build_spec.yaml.
         * @param buildSpecFile the value to set
         * @return this builder
         **/
        public Builder buildSpecFile(String buildSpecFile) {
            this.buildSpecFile = buildSpecFile;
            this.__explicitlySet__.add("buildSpecFile");
            return this;
        }
        /**
         * Timeout for the build stage execution. Specify value in seconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stageExecutionTimeoutInSeconds")
        private Integer stageExecutionTimeoutInSeconds;

        /**
         * Timeout for the build stage execution. Specify value in seconds.
         * @param stageExecutionTimeoutInSeconds the value to set
         * @return this builder
         **/
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
         * Name of the build source where the build_spec.yml file is located. If not specified, the first entry in the build source collection is chosen as primary build source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("primaryBuildSource")
        private String primaryBuildSource;

        /**
         * Name of the build source where the build_spec.yml file is located. If not specified, the first entry in the build source collection is chosen as primary build source.
         * @param primaryBuildSource the value to set
         * @return this builder
         **/
        public Builder primaryBuildSource(String primaryBuildSource) {
            this.primaryBuildSource = primaryBuildSource;
            this.__explicitlySet__.add("primaryBuildSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBuildStageDetails build() {
            UpdateBuildStageDetails __instance__ =
                    new UpdateBuildStageDetails(
                            displayName,
                            description,
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
        public Builder copy(UpdateBuildStageDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public UpdateBuildStageDetails(
            String displayName,
            String description,
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
     * Image name for the build environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    private final BuildStage.Image image;

    /**
     * Image name for the build environment.
     * @return the value
     **/
    public BuildStage.Image getImage() {
        return image;
    }

    /**
     * The path to the build specification file for this environment. The default location of the file if not specified is build_spec.yaml.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buildSpecFile")
    private final String buildSpecFile;

    /**
     * The path to the build specification file for this environment. The default location of the file if not specified is build_spec.yaml.
     * @return the value
     **/
    public String getBuildSpecFile() {
        return buildSpecFile;
    }

    /**
     * Timeout for the build stage execution. Specify value in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stageExecutionTimeoutInSeconds")
    private final Integer stageExecutionTimeoutInSeconds;

    /**
     * Timeout for the build stage execution. Specify value in seconds.
     * @return the value
     **/
    public Integer getStageExecutionTimeoutInSeconds() {
        return stageExecutionTimeoutInSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("buildSourceCollection")
    private final BuildSourceCollection buildSourceCollection;

    public BuildSourceCollection getBuildSourceCollection() {
        return buildSourceCollection;
    }

    /**
     * Name of the build source where the build_spec.yml file is located. If not specified, the first entry in the build source collection is chosen as primary build source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryBuildSource")
    private final String primaryBuildSource;

    /**
     * Name of the build source where the build_spec.yml file is located. If not specified, the first entry in the build source collection is chosen as primary build source.
     * @return the value
     **/
    public String getPrimaryBuildSource() {
        return primaryBuildSource;
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
        sb.append("UpdateBuildStageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", image=").append(String.valueOf(this.image));
        sb.append(", buildSpecFile=").append(String.valueOf(this.buildSpecFile));
        sb.append(", stageExecutionTimeoutInSeconds=")
                .append(String.valueOf(this.stageExecutionTimeoutInSeconds));
        sb.append(", buildSourceCollection=").append(String.valueOf(this.buildSourceCollection));
        sb.append(", primaryBuildSource=").append(String.valueOf(this.primaryBuildSource));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBuildStageDetails)) {
            return false;
        }

        UpdateBuildStageDetails other = (UpdateBuildStageDetails) o;
        return java.util.Objects.equals(this.image, other.image)
                && java.util.Objects.equals(this.buildSpecFile, other.buildSpecFile)
                && java.util.Objects.equals(
                        this.stageExecutionTimeoutInSeconds, other.stageExecutionTimeoutInSeconds)
                && java.util.Objects.equals(this.buildSourceCollection, other.buildSourceCollection)
                && java.util.Objects.equals(this.primaryBuildSource, other.primaryBuildSource)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
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
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
