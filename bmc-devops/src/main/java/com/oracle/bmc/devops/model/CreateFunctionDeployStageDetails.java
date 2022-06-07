/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Function stage.
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
    builder = CreateFunctionDeployStageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateFunctionDeployStageDetails extends CreateDeployStageDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("functionDeployEnvironmentId")
        private String functionDeployEnvironmentId;

        public Builder functionDeployEnvironmentId(String functionDeployEnvironmentId) {
            this.functionDeployEnvironmentId = functionDeployEnvironmentId;
            this.__explicitlySet__.add("functionDeployEnvironmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dockerImageDeployArtifactId")
        private String dockerImageDeployArtifactId;

        public Builder dockerImageDeployArtifactId(String dockerImageDeployArtifactId) {
            this.dockerImageDeployArtifactId = dockerImageDeployArtifactId;
            this.__explicitlySet__.add("dockerImageDeployArtifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("config")
        private java.util.Map<String, String> config;

        public Builder config(java.util.Map<String, String> config) {
            this.config = config;
            this.__explicitlySet__.add("config");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInMBs")
        private Long maxMemoryInMBs;

        public Builder maxMemoryInMBs(Long maxMemoryInMBs) {
            this.maxMemoryInMBs = maxMemoryInMBs;
            this.__explicitlySet__.add("maxMemoryInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("functionTimeoutInSeconds")
        private Integer functionTimeoutInSeconds;

        public Builder functionTimeoutInSeconds(Integer functionTimeoutInSeconds) {
            this.functionTimeoutInSeconds = functionTimeoutInSeconds;
            this.__explicitlySet__.add("functionTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateFunctionDeployStageDetails build() {
            CreateFunctionDeployStageDetails __instance__ =
                    new CreateFunctionDeployStageDetails(
                            description,
                            displayName,
                            deployPipelineId,
                            deployStagePredecessorCollection,
                            freeformTags,
                            definedTags,
                            functionDeployEnvironmentId,
                            dockerImageDeployArtifactId,
                            config,
                            maxMemoryInMBs,
                            functionTimeoutInSeconds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateFunctionDeployStageDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .deployPipelineId(o.getDeployPipelineId())
                            .deployStagePredecessorCollection(
                                    o.getDeployStagePredecessorCollection())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .functionDeployEnvironmentId(o.getFunctionDeployEnvironmentId())
                            .dockerImageDeployArtifactId(o.getDockerImageDeployArtifactId())
                            .config(o.getConfig())
                            .maxMemoryInMBs(o.getMaxMemoryInMBs())
                            .functionTimeoutInSeconds(o.getFunctionTimeoutInSeconds());

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
    public CreateFunctionDeployStageDetails(
            String description,
            String displayName,
            String deployPipelineId,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String functionDeployEnvironmentId,
            String dockerImageDeployArtifactId,
            java.util.Map<String, String> config,
            Long maxMemoryInMBs,
            Integer functionTimeoutInSeconds) {
        super(
                description,
                displayName,
                deployPipelineId,
                deployStagePredecessorCollection,
                freeformTags,
                definedTags);
        this.functionDeployEnvironmentId = functionDeployEnvironmentId;
        this.dockerImageDeployArtifactId = dockerImageDeployArtifactId;
        this.config = config;
        this.maxMemoryInMBs = maxMemoryInMBs;
        this.functionTimeoutInSeconds = functionTimeoutInSeconds;
    }

    /**
     * Function environment OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionDeployEnvironmentId")
    private final String functionDeployEnvironmentId;

    public String getFunctionDeployEnvironmentId() {
        return functionDeployEnvironmentId;
    }

    /**
     * A Docker image artifact OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dockerImageDeployArtifactId")
    private final String dockerImageDeployArtifactId;

    public String getDockerImageDeployArtifactId() {
        return dockerImageDeployArtifactId;
    }

    /**
     * User provided key and value pair configuration, which is assigned through constants or parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final java.util.Map<String, String> config;

    public java.util.Map<String, String> getConfig() {
        return config;
    }

    /**
     * Maximum usable memory for the Function (in MB).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInMBs")
    private final Long maxMemoryInMBs;

    public Long getMaxMemoryInMBs() {
        return maxMemoryInMBs;
    }

    /**
     * Timeout for execution of the Function. Value in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionTimeoutInSeconds")
    private final Integer functionTimeoutInSeconds;

    public Integer getFunctionTimeoutInSeconds() {
        return functionTimeoutInSeconds;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateFunctionDeployStageDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", functionDeployEnvironmentId=")
                .append(String.valueOf(this.functionDeployEnvironmentId));
        sb.append(", dockerImageDeployArtifactId=")
                .append(String.valueOf(this.dockerImageDeployArtifactId));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(", maxMemoryInMBs=").append(String.valueOf(this.maxMemoryInMBs));
        sb.append(", functionTimeoutInSeconds=")
                .append(String.valueOf(this.functionTimeoutInSeconds));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateFunctionDeployStageDetails)) {
            return false;
        }

        CreateFunctionDeployStageDetails other = (CreateFunctionDeployStageDetails) o;
        return java.util.Objects.equals(
                        this.functionDeployEnvironmentId, other.functionDeployEnvironmentId)
                && java.util.Objects.equals(
                        this.dockerImageDeployArtifactId, other.dockerImageDeployArtifactId)
                && java.util.Objects.equals(this.config, other.config)
                && java.util.Objects.equals(this.maxMemoryInMBs, other.maxMemoryInMBs)
                && java.util.Objects.equals(
                        this.functionTimeoutInSeconds, other.functionTimeoutInSeconds)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.functionDeployEnvironmentId == null
                                ? 43
                                : this.functionDeployEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.dockerImageDeployArtifactId == null
                                ? 43
                                : this.dockerImageDeployArtifactId.hashCode());
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        result =
                (result * PRIME)
                        + (this.maxMemoryInMBs == null ? 43 : this.maxMemoryInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.functionTimeoutInSeconds == null
                                ? 43
                                : this.functionTimeoutInSeconds.hashCode());
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
