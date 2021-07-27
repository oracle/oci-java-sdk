/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Container image summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ContainerImageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ContainerImageSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("digest")
        private String digest;

        public Builder digest(String digest) {
            this.digest = digest;
            this.__explicitlySet__.add("digest");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ContainerImage.LifecycleState lifecycleState;

        public Builder lifecycleState(ContainerImage.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
        private String repositoryId;

        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            this.__explicitlySet__.add("repositoryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("repositoryName")
        private String repositoryName;

        public Builder repositoryName(String repositoryName) {
            this.repositoryName = repositoryName;
            this.__explicitlySet__.add("repositoryName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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

        public ContainerImageSummary build() {
            ContainerImageSummary __instance__ =
                    new ContainerImageSummary(
                            compartmentId,
                            digest,
                            displayName,
                            id,
                            lifecycleState,
                            repositoryId,
                            repositoryName,
                            timeCreated,
                            version);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerImageSummary o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .digest(o.getDigest())
                            .displayName(o.getDisplayName())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .repositoryId(o.getRepositoryId())
                            .repositoryName(o.getRepositoryName())
                            .timeCreated(o.getTimeCreated())
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

    /**
     * The compartment OCID to which the container image belongs. Inferred from the container repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The container image digest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("digest")
    String digest;

    /**
     * The repository name and the most recent version associated with the image.
     * If there are no versions associated with the image, then last known version and digest are used instead.
     * If the last known version is unavailable, then 'unknown' is used instead of the version.
     * <p>
     * Example: {@code ubuntu:latest} or {@code ubuntu:latest@sha256:45b23dee08af5e43a7fea6c4cf9c25ccf269ee113168c19722f87876677c5cb2}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the container image.
     * <p>
     * Example: {@code ocid1.containerimage.oc1..exampleuniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The current state of the container image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    ContainerImage.LifecycleState lifecycleState;

    /**
     * The OCID of the container repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
    String repositoryId;

    /**
     * The container repository name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryName")
    String repositoryName;

    /**
     * An RFC 3339 timestamp indicating when the image was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The most recent version associated with this image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
