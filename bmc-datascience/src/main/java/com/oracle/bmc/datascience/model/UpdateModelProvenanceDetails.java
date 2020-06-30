/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Model provenance gives data scientists information about the origin of their model. This information allows data scientists to reproduce the development environment in which the model was trained.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateModelProvenanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateModelProvenanceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
        private String repositoryUrl;

        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            this.__explicitlySet__.add("repositoryUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gitBranch")
        private String gitBranch;

        public Builder gitBranch(String gitBranch) {
            this.gitBranch = gitBranch;
            this.__explicitlySet__.add("gitBranch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gitCommit")
        private String gitCommit;

        public Builder gitCommit(String gitCommit) {
            this.gitCommit = gitCommit;
            this.__explicitlySet__.add("gitCommit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scriptDir")
        private String scriptDir;

        public Builder scriptDir(String scriptDir) {
            this.scriptDir = scriptDir;
            this.__explicitlySet__.add("scriptDir");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trainingScript")
        private String trainingScript;

        public Builder trainingScript(String trainingScript) {
            this.trainingScript = trainingScript;
            this.__explicitlySet__.add("trainingScript");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateModelProvenanceDetails build() {
            UpdateModelProvenanceDetails __instance__ =
                    new UpdateModelProvenanceDetails(
                            repositoryUrl, gitBranch, gitCommit, scriptDir, trainingScript);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModelProvenanceDetails o) {
            Builder copiedBuilder =
                    repositoryUrl(o.getRepositoryUrl())
                            .gitBranch(o.getGitBranch())
                            .gitCommit(o.getGitCommit())
                            .scriptDir(o.getScriptDir())
                            .trainingScript(o.getTrainingScript());

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

    /**
     * For model reproducibility purposes. URL of the git repository associated with model training.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    String repositoryUrl;

    /**
     * For model reproducibility purposes. Branch of the git repository associated with model training.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gitBranch")
    String gitBranch;

    /**
     * For model reproducibility purposes. Commit ID of the git repository associated with model training.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gitCommit")
    String gitCommit;

    /**
     * For model reproducibility purposes. Path to model artifacts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scriptDir")
    String scriptDir;

    /**
     * For model reproducibility purposes. Path to the python script or notebook in which the model was trained.\"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trainingScript")
    String trainingScript;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
