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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BuildStageRunProgress.Builder.class
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
public class BuildStageRunProgress extends BuildPipelineStageRunProgress {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("actualBuildRunnerShape")
        private String actualBuildRunnerShape;

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

        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private Image image;

        public Builder image(Image image) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("steps")
        private java.util.List<BuildStageRunStep> steps;

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
    String actualBuildRunnerShape;

    @com.fasterxml.jackson.annotation.JsonProperty("actualBuildRunnerShapeConfig")
    ActualBuildRunnerShapeConfig actualBuildRunnerShapeConfig;
    /**
     * Image name for the Build Environment
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Image {
        Ol7X8664Standard10("OL7_X86_64_STANDARD_10"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    Image image;

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

    /**
     * The details about all the steps in a Build stage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("steps")
    java.util.List<BuildStageRunStep> steps;

    @com.fasterxml.jackson.annotation.JsonProperty("exportedVariables")
    ExportedVariableCollection exportedVariables;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
