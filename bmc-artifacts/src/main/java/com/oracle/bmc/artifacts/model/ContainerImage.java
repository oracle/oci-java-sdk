/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Container image metadata.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ContainerImage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ContainerImage {
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

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
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

        @com.fasterxml.jackson.annotation.JsonProperty("layers")
        private java.util.List<ContainerImageLayer> layers;

        public Builder layers(java.util.List<ContainerImageLayer> layers) {
            this.layers = layers;
            this.__explicitlySet__.add("layers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("layersSizeInBytes")
        private Long layersSizeInBytes;

        public Builder layersSizeInBytes(Long layersSizeInBytes) {
            this.layersSizeInBytes = layersSizeInBytes;
            this.__explicitlySet__.add("layersSizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("manifestSizeInBytes")
        private Integer manifestSizeInBytes;

        public Builder manifestSizeInBytes(Integer manifestSizeInBytes) {
            this.manifestSizeInBytes = manifestSizeInBytes;
            this.__explicitlySet__.add("manifestSizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pullCount")
        private Long pullCount;

        public Builder pullCount(Long pullCount) {
            this.pullCount = pullCount;
            this.__explicitlySet__.add("pullCount");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastPulled")
        private java.util.Date timeLastPulled;

        public Builder timeLastPulled(java.util.Date timeLastPulled) {
            this.timeLastPulled = timeLastPulled;
            this.__explicitlySet__.add("timeLastPulled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versions")
        private java.util.List<ContainerVersion> versions;

        public Builder versions(java.util.List<ContainerVersion> versions) {
            this.versions = versions;
            this.__explicitlySet__.add("versions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerImage build() {
            ContainerImage __instance__ =
                    new ContainerImage(
                            compartmentId,
                            createdBy,
                            digest,
                            displayName,
                            id,
                            layers,
                            layersSizeInBytes,
                            lifecycleState,
                            manifestSizeInBytes,
                            pullCount,
                            repositoryId,
                            repositoryName,
                            timeCreated,
                            timeLastPulled,
                            version,
                            versions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerImage o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .createdBy(o.getCreatedBy())
                            .digest(o.getDigest())
                            .displayName(o.getDisplayName())
                            .id(o.getId())
                            .layers(o.getLayers())
                            .layersSizeInBytes(o.getLayersSizeInBytes())
                            .lifecycleState(o.getLifecycleState())
                            .manifestSizeInBytes(o.getManifestSizeInBytes())
                            .pullCount(o.getPullCount())
                            .repositoryId(o.getRepositoryId())
                            .repositoryName(o.getRepositoryName())
                            .timeCreated(o.getTimeCreated())
                            .timeLastPulled(o.getTimeLastPulled())
                            .version(o.getVersion())
                            .versions(o.getVersions());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the user or principal that created the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    String createdBy;

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
     * Layers of which the image is composed, ordered by the layer digest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("layers")
    java.util.List<ContainerImageLayer> layers;

    /**
     * The total size of the container image layers in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("layersSizeInBytes")
    Long layersSizeInBytes;
    /**
     * The current state of the container image.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Available("AVAILABLE"),
        Deleted("DELETED"),
        Deleting("DELETING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the container image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The size of the container image manifest in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("manifestSizeInBytes")
    Integer manifestSizeInBytes;

    /**
     * Total number of pulls.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pullCount")
    Long pullCount;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the container repository.
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
     * An RFC 3339 timestamp indicating when the image was last pulled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastPulled")
    java.util.Date timeLastPulled;

    /**
     * The most recent version associated with this image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    /**
     * The versions associated with this image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versions")
    java.util.List<ContainerVersion> versions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
