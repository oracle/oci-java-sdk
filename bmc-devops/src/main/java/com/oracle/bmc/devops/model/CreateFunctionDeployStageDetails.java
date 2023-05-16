/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Function stage. <br>
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
        builder = CreateFunctionDeployStageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deployStageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
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
        /** Function environment OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("functionDeployEnvironmentId")
        private String functionDeployEnvironmentId;

        /**
         * Function environment OCID.
         *
         * @param functionDeployEnvironmentId the value to set
         * @return this builder
         */
        public Builder functionDeployEnvironmentId(String functionDeployEnvironmentId) {
            this.functionDeployEnvironmentId = functionDeployEnvironmentId;
            this.__explicitlySet__.add("functionDeployEnvironmentId");
            return this;
        }
        /** A Docker image artifact OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("dockerImageDeployArtifactId")
        private String dockerImageDeployArtifactId;

        /**
         * A Docker image artifact OCID.
         *
         * @param dockerImageDeployArtifactId the value to set
         * @return this builder
         */
        public Builder dockerImageDeployArtifactId(String dockerImageDeployArtifactId) {
            this.dockerImageDeployArtifactId = dockerImageDeployArtifactId;
            this.__explicitlySet__.add("dockerImageDeployArtifactId");
            return this;
        }
        /**
         * User provided key and value pair configuration, which is assigned through constants or
         * parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("config")
        private java.util.Map<String, String> config;

        /**
         * User provided key and value pair configuration, which is assigned through constants or
         * parameter.
         *
         * @param config the value to set
         * @return this builder
         */
        public Builder config(java.util.Map<String, String> config) {
            this.config = config;
            this.__explicitlySet__.add("config");
            return this;
        }
        /** Maximum usable memory for the Function (in MB). */
        @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInMBs")
        private Long maxMemoryInMBs;

        /**
         * Maximum usable memory for the Function (in MB).
         *
         * @param maxMemoryInMBs the value to set
         * @return this builder
         */
        public Builder maxMemoryInMBs(Long maxMemoryInMBs) {
            this.maxMemoryInMBs = maxMemoryInMBs;
            this.__explicitlySet__.add("maxMemoryInMBs");
            return this;
        }
        /** Timeout for execution of the Function. Value in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("functionTimeoutInSeconds")
        private Integer functionTimeoutInSeconds;

        /**
         * Timeout for execution of the Function. Value in seconds.
         *
         * @param functionTimeoutInSeconds the value to set
         * @return this builder
         */
        public Builder functionTimeoutInSeconds(Integer functionTimeoutInSeconds) {
            this.functionTimeoutInSeconds = functionTimeoutInSeconds;
            this.__explicitlySet__.add("functionTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateFunctionDeployStageDetails build() {
            CreateFunctionDeployStageDetails model =
                    new CreateFunctionDeployStageDetails(
                            this.description,
                            this.displayName,
                            this.deployPipelineId,
                            this.deployStagePredecessorCollection,
                            this.freeformTags,
                            this.definedTags,
                            this.functionDeployEnvironmentId,
                            this.dockerImageDeployArtifactId,
                            this.config,
                            this.maxMemoryInMBs,
                            this.functionTimeoutInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateFunctionDeployStageDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("deployPipelineId")) {
                this.deployPipelineId(model.getDeployPipelineId());
            }
            if (model.wasPropertyExplicitlySet("deployStagePredecessorCollection")) {
                this.deployStagePredecessorCollection(model.getDeployStagePredecessorCollection());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("functionDeployEnvironmentId")) {
                this.functionDeployEnvironmentId(model.getFunctionDeployEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("dockerImageDeployArtifactId")) {
                this.dockerImageDeployArtifactId(model.getDockerImageDeployArtifactId());
            }
            if (model.wasPropertyExplicitlySet("config")) {
                this.config(model.getConfig());
            }
            if (model.wasPropertyExplicitlySet("maxMemoryInMBs")) {
                this.maxMemoryInMBs(model.getMaxMemoryInMBs());
            }
            if (model.wasPropertyExplicitlySet("functionTimeoutInSeconds")) {
                this.functionTimeoutInSeconds(model.getFunctionTimeoutInSeconds());
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

    /** Function environment OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("functionDeployEnvironmentId")
    private final String functionDeployEnvironmentId;

    /**
     * Function environment OCID.
     *
     * @return the value
     */
    public String getFunctionDeployEnvironmentId() {
        return functionDeployEnvironmentId;
    }

    /** A Docker image artifact OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("dockerImageDeployArtifactId")
    private final String dockerImageDeployArtifactId;

    /**
     * A Docker image artifact OCID.
     *
     * @return the value
     */
    public String getDockerImageDeployArtifactId() {
        return dockerImageDeployArtifactId;
    }

    /**
     * User provided key and value pair configuration, which is assigned through constants or
     * parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final java.util.Map<String, String> config;

    /**
     * User provided key and value pair configuration, which is assigned through constants or
     * parameter.
     *
     * @return the value
     */
    public java.util.Map<String, String> getConfig() {
        return config;
    }

    /** Maximum usable memory for the Function (in MB). */
    @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInMBs")
    private final Long maxMemoryInMBs;

    /**
     * Maximum usable memory for the Function (in MB).
     *
     * @return the value
     */
    public Long getMaxMemoryInMBs() {
        return maxMemoryInMBs;
    }

    /** Timeout for execution of the Function. Value in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("functionTimeoutInSeconds")
    private final Integer functionTimeoutInSeconds;

    /**
     * Timeout for execution of the Function. Value in seconds.
     *
     * @return the value
     */
    public Integer getFunctionTimeoutInSeconds() {
        return functionTimeoutInSeconds;
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
        sb.append("CreateFunctionDeployStageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", functionDeployEnvironmentId=")
                .append(String.valueOf(this.functionDeployEnvironmentId));
        sb.append(", dockerImageDeployArtifactId=")
                .append(String.valueOf(this.dockerImageDeployArtifactId));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(", maxMemoryInMBs=").append(String.valueOf(this.maxMemoryInMBs));
        sb.append(", functionTimeoutInSeconds=")
                .append(String.valueOf(this.functionTimeoutInSeconds));
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
                && super.equals(other);
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
        return result;
    }
}
