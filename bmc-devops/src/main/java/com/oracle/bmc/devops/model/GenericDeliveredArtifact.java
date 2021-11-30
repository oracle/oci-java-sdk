/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details of the generic artifacts delivered through the Deliver Artifacts stage.
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
    builder = GenericDeliveredArtifact.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "artifactType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class GenericDeliveredArtifact extends DeliveredArtifact {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactId")
        private String deployArtifactId;

        public Builder deployArtifactId(String deployArtifactId) {
            this.deployArtifactId = deployArtifactId;
            this.__explicitlySet__.add("deployArtifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputArtifactName")
        private String outputArtifactName;

        public Builder outputArtifactName(String outputArtifactName) {
            this.outputArtifactName = outputArtifactName;
            this.__explicitlySet__.add("outputArtifactName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("artifactRepositoryId")
        private String artifactRepositoryId;

        public Builder artifactRepositoryId(String artifactRepositoryId) {
            this.artifactRepositoryId = artifactRepositoryId;
            this.__explicitlySet__.add("artifactRepositoryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deliveredArtifactId")
        private String deliveredArtifactId;

        public Builder deliveredArtifactId(String deliveredArtifactId) {
            this.deliveredArtifactId = deliveredArtifactId;
            this.__explicitlySet__.add("deliveredArtifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenericDeliveredArtifact build() {
            GenericDeliveredArtifact __instance__ =
                    new GenericDeliveredArtifact(
                            deployArtifactId,
                            outputArtifactName,
                            artifactRepositoryId,
                            deliveredArtifactId,
                            path,
                            version);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenericDeliveredArtifact o) {
            Builder copiedBuilder =
                    deployArtifactId(o.getDeployArtifactId())
                            .outputArtifactName(o.getOutputArtifactName())
                            .artifactRepositoryId(o.getArtifactRepositoryId())
                            .deliveredArtifactId(o.getDeliveredArtifactId())
                            .path(o.getPath())
                            .version(o.getVersion());

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
    public GenericDeliveredArtifact(
            String deployArtifactId,
            String outputArtifactName,
            String artifactRepositoryId,
            String deliveredArtifactId,
            String path,
            String version) {
        super(deployArtifactId, outputArtifactName);
        this.artifactRepositoryId = artifactRepositoryId;
        this.deliveredArtifactId = deliveredArtifactId;
        this.path = path;
        this.version = version;
    }

    /**
     * The OCID of the artifact registry repository used by the DeliverArtifactStage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("artifactRepositoryId")
    String artifactRepositoryId;

    /**
     * The OCID of the artifact pushed by the Deliver Artifacts stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deliveredArtifactId")
    String deliveredArtifactId;

    /**
     * Path of the repository where artifact was pushed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * Version of the artifact pushed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
