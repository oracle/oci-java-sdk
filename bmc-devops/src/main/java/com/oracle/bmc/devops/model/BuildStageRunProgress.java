/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the run details for Build stage.
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
    builder = BuildStageRunProgress.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "buildPipelineStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BuildStageRunProgress extends BuildPipelineStageRunProgress {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("stageDisplayName")
        private String stageDisplayName;

        public Builder stageDisplayName(String stageDisplayName) {
            this.stageDisplayName = stageDisplayName;
            this.__explicitlySet__.add("stageDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStageId")
        private String buildPipelineStageId;

        public Builder buildPipelineStageId(String buildPipelineStageId) {
            this.buildPipelineStageId = buildPipelineStageId;
            this.__explicitlySet__.add("buildPipelineStageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineStagePredecessors")
        private BuildPipelineStagePredecessorCollection buildPipelineStagePredecessors;

        public Builder buildPipelineStagePredecessors(
                BuildPipelineStagePredecessorCollection buildPipelineStagePredecessors) {
            this.buildPipelineStagePredecessors = buildPipelineStagePredecessors;
            this.__explicitlySet__.add("buildPipelineStagePredecessors");
            return this;
        }
        /**
         * Name of Build Runner shape where this Build Stage is running.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actualBuildRunnerShape")
        private String actualBuildRunnerShape;

        /**
         * Name of Build Runner shape where this Build Stage is running.
         * @param actualBuildRunnerShape the value to set
         * @return this builder
         **/
        public Builder actualBuildRunnerShape(String actualBuildRunnerShape) {
            this.actualBuildRunnerShape = actualBuildRunnerShape;
            this.__explicitlySet__.add("actualBuildRunnerShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actualBuildRunnerShapeConfig")
        private ActualBuildRunnerShapeConfig actualBuildRunnerShapeConfig;

        public Builder actualBuildRunnerShapeConfig(
                ActualBuildRunnerShapeConfig actualBuildRunnerShapeConfig) {
            this.actualBuildRunnerShapeConfig = actualBuildRunnerShapeConfig;
            this.__explicitlySet__.add("actualBuildRunnerShapeConfig");
            return this;
        }
        /**
         * Image name for the Build Environment
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private Image image;

        /**
         * Image name for the Build Environment
         * @param image the value to set
         * @return this builder
         **/
        public Builder image(Image image) {
            this.image = image;
            this.__explicitlySet__.add("image");
            return this;
        }
        /**
         * The path to the build specification file for this Environment. The default location if not specified is build_spec.yaml
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("buildSpecFile")
        private String buildSpecFile;

        /**
         * The path to the build specification file for this Environment. The default location if not specified is build_spec.yaml
         * @param buildSpecFile the value to set
         * @return this builder
         **/
        public Builder buildSpecFile(String buildSpecFile) {
            this.buildSpecFile = buildSpecFile;
            this.__explicitlySet__.add("buildSpecFile");
            return this;
        }
        /**
         * Timeout for the Build Stage Execution. Value in seconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stageExecutionTimeoutInSeconds")
        private Integer stageExecutionTimeoutInSeconds;

        /**
         * Timeout for the Build Stage Execution. Value in seconds.
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
         * Name of the BuildSource in which the build_spec.yml file need to be located. If not specified, the 1st entry in the BuildSource collection will be chosen as Primary.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("primaryBuildSource")
        private String primaryBuildSource;

        /**
         * Name of the BuildSource in which the build_spec.yml file need to be located. If not specified, the 1st entry in the BuildSource collection will be chosen as Primary.
         * @param primaryBuildSource the value to set
         * @return this builder
         **/
        public Builder primaryBuildSource(String primaryBuildSource) {
            this.primaryBuildSource = primaryBuildSource;
            this.__explicitlySet__.add("primaryBuildSource");
            return this;
        }
        /**
         * The details about all the steps in a Build stage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("steps")
        private java.util.List<BuildStageRunStep> steps;

        /**
         * The details about all the steps in a Build stage
         * @param steps the value to set
         * @return this builder
         **/
        public Builder steps(java.util.List<BuildStageRunStep> steps) {
            this.steps = steps;
            this.__explicitlySet__.add("steps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exportedVariables")
        private ExportedVariableCollection exportedVariables;

        public Builder exportedVariables(ExportedVariableCollection exportedVariables) {
            this.exportedVariables = exportedVariables;
            this.__explicitlySet__.add("exportedVariables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BuildStageRunProgress build() {
            BuildStageRunProgress __instance__ =
                    new BuildStageRunProgress(
                            stageDisplayName,
                            buildPipelineStageId,
                            timeStarted,
                            timeFinished,
                            status,
                            buildPipelineStagePredecessors,
                            actualBuildRunnerShape,
                            actualBuildRunnerShapeConfig,
                            image,
                            buildSpecFile,
                            stageExecutionTimeoutInSeconds,
                            buildSourceCollection,
                            primaryBuildSource,
                            steps,
                            exportedVariables);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BuildStageRunProgress o) {
            Builder copiedBuilder =
                    stageDisplayName(o.getStageDisplayName())
                            .buildPipelineStageId(o.getBuildPipelineStageId())
                            .timeStarted(o.getTimeStarted())
                            .timeFinished(o.getTimeFinished())
                            .status(o.getStatus())
                            .buildPipelineStagePredecessors(o.getBuildPipelineStagePredecessors())
                            .actualBuildRunnerShape(o.getActualBuildRunnerShape())
                            .actualBuildRunnerShapeConfig(o.getActualBuildRunnerShapeConfig())
                            .image(o.getImage())
                            .buildSpecFile(o.getBuildSpecFile())
                            .stageExecutionTimeoutInSeconds(o.getStageExecutionTimeoutInSeconds())
                            .buildSourceCollection(o.getBuildSourceCollection())
                            .primaryBuildSource(o.getPrimaryBuildSource())
                            .steps(o.getSteps())
                            .exportedVariables(o.getExportedVariables());

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
    public BuildStageRunProgress(
            String stageDisplayName,
            String buildPipelineStageId,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Status status,
            BuildPipelineStagePredecessorCollection buildPipelineStagePredecessors,
            String actualBuildRunnerShape,
            ActualBuildRunnerShapeConfig actualBuildRunnerShapeConfig,
            Image image,
            String buildSpecFile,
            Integer stageExecutionTimeoutInSeconds,
            BuildSourceCollection buildSourceCollection,
            String primaryBuildSource,
            java.util.List<BuildStageRunStep> steps,
            ExportedVariableCollection exportedVariables) {
        super(
                stageDisplayName,
                buildPipelineStageId,
                timeStarted,
                timeFinished,
                status,
                buildPipelineStagePredecessors);
        this.actualBuildRunnerShape = actualBuildRunnerShape;
        this.actualBuildRunnerShapeConfig = actualBuildRunnerShapeConfig;
        this.image = image;
        this.buildSpecFile = buildSpecFile;
        this.stageExecutionTimeoutInSeconds = stageExecutionTimeoutInSeconds;
        this.buildSourceCollection = buildSourceCollection;
        this.primaryBuildSource = primaryBuildSource;
        this.steps = steps;
        this.exportedVariables = exportedVariables;
    }

    /**
     * Name of Build Runner shape where this Build Stage is running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actualBuildRunnerShape")
    private final String actualBuildRunnerShape;

    /**
     * Name of Build Runner shape where this Build Stage is running.
     * @return the value
     **/
    public String getActualBuildRunnerShape() {
        return actualBuildRunnerShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("actualBuildRunnerShapeConfig")
    private final ActualBuildRunnerShapeConfig actualBuildRunnerShapeConfig;

    public ActualBuildRunnerShapeConfig getActualBuildRunnerShapeConfig() {
        return actualBuildRunnerShapeConfig;
    }

    /**
     * Image name for the Build Environment
     **/
    public enum Image {
        Ol7X8664Standard10("OL7_X86_64_STANDARD_10"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Image.class);

        private final String value;
        private static java.util.Map<String, Image> map;

        static {
            map = new java.util.HashMap<>();
            for (Image v : Image.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Image(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Image create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Image', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Image name for the Build Environment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    private final Image image;

    /**
     * Image name for the Build Environment
     * @return the value
     **/
    public Image getImage() {
        return image;
    }

    /**
     * The path to the build specification file for this Environment. The default location if not specified is build_spec.yaml
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buildSpecFile")
    private final String buildSpecFile;

    /**
     * The path to the build specification file for this Environment. The default location if not specified is build_spec.yaml
     * @return the value
     **/
    public String getBuildSpecFile() {
        return buildSpecFile;
    }

    /**
     * Timeout for the Build Stage Execution. Value in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stageExecutionTimeoutInSeconds")
    private final Integer stageExecutionTimeoutInSeconds;

    /**
     * Timeout for the Build Stage Execution. Value in seconds.
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
     * Name of the BuildSource in which the build_spec.yml file need to be located. If not specified, the 1st entry in the BuildSource collection will be chosen as Primary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryBuildSource")
    private final String primaryBuildSource;

    /**
     * Name of the BuildSource in which the build_spec.yml file need to be located. If not specified, the 1st entry in the BuildSource collection will be chosen as Primary.
     * @return the value
     **/
    public String getPrimaryBuildSource() {
        return primaryBuildSource;
    }

    /**
     * The details about all the steps in a Build stage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("steps")
    private final java.util.List<BuildStageRunStep> steps;

    /**
     * The details about all the steps in a Build stage
     * @return the value
     **/
    public java.util.List<BuildStageRunStep> getSteps() {
        return steps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exportedVariables")
    private final ExportedVariableCollection exportedVariables;

    public ExportedVariableCollection getExportedVariables() {
        return exportedVariables;
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
        sb.append("BuildStageRunProgress(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", actualBuildRunnerShape=").append(String.valueOf(this.actualBuildRunnerShape));
        sb.append(", actualBuildRunnerShapeConfig=")
                .append(String.valueOf(this.actualBuildRunnerShapeConfig));
        sb.append(", image=").append(String.valueOf(this.image));
        sb.append(", buildSpecFile=").append(String.valueOf(this.buildSpecFile));
        sb.append(", stageExecutionTimeoutInSeconds=")
                .append(String.valueOf(this.stageExecutionTimeoutInSeconds));
        sb.append(", buildSourceCollection=").append(String.valueOf(this.buildSourceCollection));
        sb.append(", primaryBuildSource=").append(String.valueOf(this.primaryBuildSource));
        sb.append(", steps=").append(String.valueOf(this.steps));
        sb.append(", exportedVariables=").append(String.valueOf(this.exportedVariables));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BuildStageRunProgress)) {
            return false;
        }

        BuildStageRunProgress other = (BuildStageRunProgress) o;
        return java.util.Objects.equals(this.actualBuildRunnerShape, other.actualBuildRunnerShape)
                && java.util.Objects.equals(
                        this.actualBuildRunnerShapeConfig, other.actualBuildRunnerShapeConfig)
                && java.util.Objects.equals(this.image, other.image)
                && java.util.Objects.equals(this.buildSpecFile, other.buildSpecFile)
                && java.util.Objects.equals(
                        this.stageExecutionTimeoutInSeconds, other.stageExecutionTimeoutInSeconds)
                && java.util.Objects.equals(this.buildSourceCollection, other.buildSourceCollection)
                && java.util.Objects.equals(this.primaryBuildSource, other.primaryBuildSource)
                && java.util.Objects.equals(this.steps, other.steps)
                && java.util.Objects.equals(this.exportedVariables, other.exportedVariables)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.actualBuildRunnerShape == null
                                ? 43
                                : this.actualBuildRunnerShape.hashCode());
        result =
                (result * PRIME)
                        + (this.actualBuildRunnerShapeConfig == null
                                ? 43
                                : this.actualBuildRunnerShapeConfig.hashCode());
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
        result = (result * PRIME) + (this.steps == null ? 43 : this.steps.hashCode());
        result =
                (result * PRIME)
                        + (this.exportedVariables == null ? 43 : this.exportedVariables.hashCode());
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
