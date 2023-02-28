/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Container image metadata. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ContainerImage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ContainerImage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "createdBy",
        "digest",
        "displayName",
        "id",
        "layers",
        "layersSizeInBytes",
        "lifecycleState",
        "manifestSizeInBytes",
        "pullCount",
        "repositoryId",
        "repositoryName",
        "timeCreated",
        "timeLastPulled",
        "version",
        "versions"
    })
    public ContainerImage(
            String compartmentId,
            String createdBy,
            String digest,
            String displayName,
            String id,
            java.util.List<ContainerImageLayer> layers,
            Long layersSizeInBytes,
            LifecycleState lifecycleState,
            Integer manifestSizeInBytes,
            Long pullCount,
            String repositoryId,
            String repositoryName,
            java.util.Date timeCreated,
            java.util.Date timeLastPulled,
            String version,
            java.util.List<ContainerVersion> versions) {
        super();
        this.compartmentId = compartmentId;
        this.createdBy = createdBy;
        this.digest = digest;
        this.displayName = displayName;
        this.id = id;
        this.layers = layers;
        this.layersSizeInBytes = layersSizeInBytes;
        this.lifecycleState = lifecycleState;
        this.manifestSizeInBytes = manifestSizeInBytes;
        this.pullCount = pullCount;
        this.repositoryId = repositoryId;
        this.repositoryName = repositoryName;
        this.timeCreated = timeCreated;
        this.timeLastPulled = timeLastPulled;
        this.version = version;
        this.versions = versions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The compartment OCID to which the container image belongs. Inferred from the container
         * repository.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID to which the container image belongs. Inferred from the container
         * repository.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * user or principal that created the resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * user or principal that created the resource.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /** The container image digest. */
        @com.fasterxml.jackson.annotation.JsonProperty("digest")
        private String digest;

        /**
         * The container image digest.
         *
         * @param digest the value to set
         * @return this builder
         */
        public Builder digest(String digest) {
            this.digest = digest;
            this.__explicitlySet__.add("digest");
            return this;
        }
        /**
         * The repository name and the most recent version associated with the image. If there are
         * no versions associated with the image, then last known version and digest are used
         * instead. If the last known version is unavailable, then 'unknown' is used instead of the
         * version.
         *
         * <p>Example: {@code ubuntu:latest} or {@code
         * ubuntu:latest@sha256:45b23dee08af5e43a7fea6c4cf9c25ccf269ee113168c19722f87876677c5cb2}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The repository name and the most recent version associated with the image. If there are
         * no versions associated with the image, then last known version and digest are used
         * instead. If the last known version is unavailable, then 'unknown' is used instead of the
         * version.
         *
         * <p>Example: {@code ubuntu:latest} or {@code
         * ubuntu:latest@sha256:45b23dee08af5e43a7fea6c4cf9c25ccf269ee113168c19722f87876677c5cb2}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * container image.
         *
         * <p>Example: {@code ocid1.containerimage.oc1..exampleuniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * container image.
         *
         * <p>Example: {@code ocid1.containerimage.oc1..exampleuniqueID}
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Layers of which the image is composed, ordered by the layer digest. */
        @com.fasterxml.jackson.annotation.JsonProperty("layers")
        private java.util.List<ContainerImageLayer> layers;

        /**
         * Layers of which the image is composed, ordered by the layer digest.
         *
         * @param layers the value to set
         * @return this builder
         */
        public Builder layers(java.util.List<ContainerImageLayer> layers) {
            this.layers = layers;
            this.__explicitlySet__.add("layers");
            return this;
        }
        /** The total size of the container image layers in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("layersSizeInBytes")
        private Long layersSizeInBytes;

        /**
         * The total size of the container image layers in bytes.
         *
         * @param layersSizeInBytes the value to set
         * @return this builder
         */
        public Builder layersSizeInBytes(Long layersSizeInBytes) {
            this.layersSizeInBytes = layersSizeInBytes;
            this.__explicitlySet__.add("layersSizeInBytes");
            return this;
        }
        /** The current state of the container image. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the container image.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The size of the container image manifest in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("manifestSizeInBytes")
        private Integer manifestSizeInBytes;

        /**
         * The size of the container image manifest in bytes.
         *
         * @param manifestSizeInBytes the value to set
         * @return this builder
         */
        public Builder manifestSizeInBytes(Integer manifestSizeInBytes) {
            this.manifestSizeInBytes = manifestSizeInBytes;
            this.__explicitlySet__.add("manifestSizeInBytes");
            return this;
        }
        /** Total number of pulls. */
        @com.fasterxml.jackson.annotation.JsonProperty("pullCount")
        private Long pullCount;

        /**
         * Total number of pulls.
         *
         * @param pullCount the value to set
         * @return this builder
         */
        public Builder pullCount(Long pullCount) {
            this.pullCount = pullCount;
            this.__explicitlySet__.add("pullCount");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * container repository.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
        private String repositoryId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * container repository.
         *
         * @param repositoryId the value to set
         * @return this builder
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            this.__explicitlySet__.add("repositoryId");
            return this;
        }
        /** The container repository name. */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryName")
        private String repositoryName;

        /**
         * The container repository name.
         *
         * @param repositoryName the value to set
         * @return this builder
         */
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = repositoryName;
            this.__explicitlySet__.add("repositoryName");
            return this;
        }
        /** An RFC 3339 timestamp indicating when the image was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * An RFC 3339 timestamp indicating when the image was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** An RFC 3339 timestamp indicating when the image was last pulled. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastPulled")
        private java.util.Date timeLastPulled;

        /**
         * An RFC 3339 timestamp indicating when the image was last pulled.
         *
         * @param timeLastPulled the value to set
         * @return this builder
         */
        public Builder timeLastPulled(java.util.Date timeLastPulled) {
            this.timeLastPulled = timeLastPulled;
            this.__explicitlySet__.add("timeLastPulled");
            return this;
        }
        /** The most recent version associated with this image. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The most recent version associated with this image.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** The versions associated with this image. */
        @com.fasterxml.jackson.annotation.JsonProperty("versions")
        private java.util.List<ContainerVersion> versions;

        /**
         * The versions associated with this image.
         *
         * @param versions the value to set
         * @return this builder
         */
        public Builder versions(java.util.List<ContainerVersion> versions) {
            this.versions = versions;
            this.__explicitlySet__.add("versions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerImage build() {
            ContainerImage model =
                    new ContainerImage(
                            this.compartmentId,
                            this.createdBy,
                            this.digest,
                            this.displayName,
                            this.id,
                            this.layers,
                            this.layersSizeInBytes,
                            this.lifecycleState,
                            this.manifestSizeInBytes,
                            this.pullCount,
                            this.repositoryId,
                            this.repositoryName,
                            this.timeCreated,
                            this.timeLastPulled,
                            this.version,
                            this.versions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerImage model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("digest")) {
                this.digest(model.getDigest());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("layers")) {
                this.layers(model.getLayers());
            }
            if (model.wasPropertyExplicitlySet("layersSizeInBytes")) {
                this.layersSizeInBytes(model.getLayersSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("manifestSizeInBytes")) {
                this.manifestSizeInBytes(model.getManifestSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("pullCount")) {
                this.pullCount(model.getPullCount());
            }
            if (model.wasPropertyExplicitlySet("repositoryId")) {
                this.repositoryId(model.getRepositoryId());
            }
            if (model.wasPropertyExplicitlySet("repositoryName")) {
                this.repositoryName(model.getRepositoryName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeLastPulled")) {
                this.timeLastPulled(model.getTimeLastPulled());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("versions")) {
                this.versions(model.getVersions());
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

    /**
     * The compartment OCID to which the container image belongs. Inferred from the container
     * repository.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID to which the container image belongs. Inferred from the container
     * repository.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * user or principal that created the resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * user or principal that created the resource.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /** The container image digest. */
    @com.fasterxml.jackson.annotation.JsonProperty("digest")
    private final String digest;

    /**
     * The container image digest.
     *
     * @return the value
     */
    public String getDigest() {
        return digest;
    }

    /**
     * The repository name and the most recent version associated with the image. If there are no
     * versions associated with the image, then last known version and digest are used instead. If
     * the last known version is unavailable, then 'unknown' is used instead of the version.
     *
     * <p>Example: {@code ubuntu:latest} or {@code
     * ubuntu:latest@sha256:45b23dee08af5e43a7fea6c4cf9c25ccf269ee113168c19722f87876677c5cb2}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The repository name and the most recent version associated with the image. If there are no
     * versions associated with the image, then last known version and digest are used instead. If
     * the last known version is unavailable, then 'unknown' is used instead of the version.
     *
     * <p>Example: {@code ubuntu:latest} or {@code
     * ubuntu:latest@sha256:45b23dee08af5e43a7fea6c4cf9c25ccf269ee113168c19722f87876677c5cb2}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * container image.
     *
     * <p>Example: {@code ocid1.containerimage.oc1..exampleuniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * container image.
     *
     * <p>Example: {@code ocid1.containerimage.oc1..exampleuniqueID}
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Layers of which the image is composed, ordered by the layer digest. */
    @com.fasterxml.jackson.annotation.JsonProperty("layers")
    private final java.util.List<ContainerImageLayer> layers;

    /**
     * Layers of which the image is composed, ordered by the layer digest.
     *
     * @return the value
     */
    public java.util.List<ContainerImageLayer> getLayers() {
        return layers;
    }

    /** The total size of the container image layers in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("layersSizeInBytes")
    private final Long layersSizeInBytes;

    /**
     * The total size of the container image layers in bytes.
     *
     * @return the value
     */
    public Long getLayersSizeInBytes() {
        return layersSizeInBytes;
    }

    /** The current state of the container image. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Available("AVAILABLE"),
        Deleted("DELETED"),
        Deleting("DELETING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

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
    /** The current state of the container image. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the container image.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The size of the container image manifest in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("manifestSizeInBytes")
    private final Integer manifestSizeInBytes;

    /**
     * The size of the container image manifest in bytes.
     *
     * @return the value
     */
    public Integer getManifestSizeInBytes() {
        return manifestSizeInBytes;
    }

    /** Total number of pulls. */
    @com.fasterxml.jackson.annotation.JsonProperty("pullCount")
    private final Long pullCount;

    /**
     * Total number of pulls.
     *
     * @return the value
     */
    public Long getPullCount() {
        return pullCount;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * container repository.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
    private final String repositoryId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * container repository.
     *
     * @return the value
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    /** The container repository name. */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryName")
    private final String repositoryName;

    /**
     * The container repository name.
     *
     * @return the value
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /** An RFC 3339 timestamp indicating when the image was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * An RFC 3339 timestamp indicating when the image was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** An RFC 3339 timestamp indicating when the image was last pulled. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastPulled")
    private final java.util.Date timeLastPulled;

    /**
     * An RFC 3339 timestamp indicating when the image was last pulled.
     *
     * @return the value
     */
    public java.util.Date getTimeLastPulled() {
        return timeLastPulled;
    }

    /** The most recent version associated with this image. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The most recent version associated with this image.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The versions associated with this image. */
    @com.fasterxml.jackson.annotation.JsonProperty("versions")
    private final java.util.List<ContainerVersion> versions;

    /**
     * The versions associated with this image.
     *
     * @return the value
     */
    public java.util.List<ContainerVersion> getVersions() {
        return versions;
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
        sb.append("ContainerImage(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", digest=").append(String.valueOf(this.digest));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", layers=").append(String.valueOf(this.layers));
        sb.append(", layersSizeInBytes=").append(String.valueOf(this.layersSizeInBytes));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", manifestSizeInBytes=").append(String.valueOf(this.manifestSizeInBytes));
        sb.append(", pullCount=").append(String.valueOf(this.pullCount));
        sb.append(", repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(", repositoryName=").append(String.valueOf(this.repositoryName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastPulled=").append(String.valueOf(this.timeLastPulled));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", versions=").append(String.valueOf(this.versions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerImage)) {
            return false;
        }

        ContainerImage other = (ContainerImage) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.digest, other.digest)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.layers, other.layers)
                && java.util.Objects.equals(this.layersSizeInBytes, other.layersSizeInBytes)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.manifestSizeInBytes, other.manifestSizeInBytes)
                && java.util.Objects.equals(this.pullCount, other.pullCount)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.repositoryName, other.repositoryName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastPulled, other.timeLastPulled)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.versions, other.versions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.digest == null ? 43 : this.digest.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.layers == null ? 43 : this.layers.hashCode());
        result =
                (result * PRIME)
                        + (this.layersSizeInBytes == null ? 43 : this.layersSizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.manifestSizeInBytes == null
                                ? 43
                                : this.manifestSizeInBytes.hashCode());
        result = (result * PRIME) + (this.pullCount == null ? 43 : this.pullCount.hashCode());
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryName == null ? 43 : this.repositoryName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastPulled == null ? 43 : this.timeLastPulled.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.versions == null ? 43 : this.versions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
