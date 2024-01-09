/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Summary information for an artifact. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GenericArtifactSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenericArtifactSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "repositoryId",
        "artifactPath",
        "version",
        "sha256",
        "sizeInBytes",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "timeCreated"
    })
    public GenericArtifactSummary(
            String id,
            String displayName,
            String compartmentId,
            String repositoryId,
            String artifactPath,
            String version,
            String sha256,
            Long sizeInBytes,
            GenericArtifact.LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Date timeCreated) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.repositoryId = repositoryId;
        this.artifactPath = artifactPath;
        this.version = version;
        this.sha256 = sha256;
        this.sizeInBytes = sizeInBytes;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the artifact.
         *
         * <p>Example: {@code ocid1.genericartifact.oc1..exampleuniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the artifact.
         *
         * <p>Example: {@code ocid1.genericartifact.oc1..exampleuniqueID}
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The artifact name with the format of {@code <artifact-path>:<artifact-version>}. The
         * artifact name is truncated to a maximum length of 255.
         *
         * <p>Example: {@code project01/my-web-app/artifact-abc:1.0.0}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The artifact name with the format of {@code <artifact-path>:<artifact-version>}. The
         * artifact name is truncated to a maximum length of 255.
         *
         * <p>Example: {@code project01/my-web-app/artifact-abc:1.0.0}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the artifact's compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the artifact's compartment.
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
         * repository.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
        private String repositoryId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * repository.
         *
         * @param repositoryId the value to set
         * @return this builder
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            this.__explicitlySet__.add("repositoryId");
            return this;
        }
        /**
         * A user-defined path to describe the location of an artifact. Slashes do not create a
         * directory structure, but you can use slashes to organize the repository. An artifact path
         * does not include an artifact version.
         *
         * <p>Example: {@code project01/my-web-app/artifact-abc}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("artifactPath")
        private String artifactPath;

        /**
         * A user-defined path to describe the location of an artifact. Slashes do not create a
         * directory structure, but you can use slashes to organize the repository. An artifact path
         * does not include an artifact version.
         *
         * <p>Example: {@code project01/my-web-app/artifact-abc}
         *
         * @param artifactPath the value to set
         * @return this builder
         */
        public Builder artifactPath(String artifactPath) {
            this.artifactPath = artifactPath;
            this.__explicitlySet__.add("artifactPath");
            return this;
        }
        /**
         * A user-defined string to describe the artifact version.
         *
         * <p>Example: {@code 1.1.0} or {@code 1.2-beta-2}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * A user-defined string to describe the artifact version.
         *
         * <p>Example: {@code 1.1.0} or {@code 1.2-beta-2}
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The SHA256 digest for the artifact. When you upload an artifact to the repository, a
         * SHA256 digest is calculated and added to the artifact properties.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sha256")
        private String sha256;

        /**
         * The SHA256 digest for the artifact. When you upload an artifact to the repository, a
         * SHA256 digest is calculated and added to the artifact properties.
         *
         * @param sha256 the value to set
         * @return this builder
         */
        public Builder sha256(String sha256) {
            this.sha256 = sha256;
            this.__explicitlySet__.add("sha256");
            return this;
        }
        /** The size of the artifact in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * The size of the artifact in bytes.
         *
         * @param sizeInBytes the value to set
         * @return this builder
         */
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }
        /** The current state of the generic artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private GenericArtifact.LifecycleState lifecycleState;

        /**
         * The current state of the generic artifact.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(GenericArtifact.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** An RFC 3339 timestamp indicating when the artifact was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * An RFC 3339 timestamp indicating when the artifact was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenericArtifactSummary build() {
            GenericArtifactSummary model =
                    new GenericArtifactSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.repositoryId,
                            this.artifactPath,
                            this.version,
                            this.sha256,
                            this.sizeInBytes,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenericArtifactSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("repositoryId")) {
                this.repositoryId(model.getRepositoryId());
            }
            if (model.wasPropertyExplicitlySet("artifactPath")) {
                this.artifactPath(model.getArtifactPath());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("sha256")) {
                this.sha256(model.getSha256());
            }
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the artifact.
     *
     * <p>Example: {@code ocid1.genericartifact.oc1..exampleuniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the artifact.
     *
     * <p>Example: {@code ocid1.genericartifact.oc1..exampleuniqueID}
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The artifact name with the format of {@code <artifact-path>:<artifact-version>}. The artifact
     * name is truncated to a maximum length of 255.
     *
     * <p>Example: {@code project01/my-web-app/artifact-abc:1.0.0}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The artifact name with the format of {@code <artifact-path>:<artifact-version>}. The artifact
     * name is truncated to a maximum length of 255.
     *
     * <p>Example: {@code project01/my-web-app/artifact-abc:1.0.0}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the artifact's compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the artifact's compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * repository.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
    private final String repositoryId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * repository.
     *
     * @return the value
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * A user-defined path to describe the location of an artifact. Slashes do not create a
     * directory structure, but you can use slashes to organize the repository. An artifact path
     * does not include an artifact version.
     *
     * <p>Example: {@code project01/my-web-app/artifact-abc}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("artifactPath")
    private final String artifactPath;

    /**
     * A user-defined path to describe the location of an artifact. Slashes do not create a
     * directory structure, but you can use slashes to organize the repository. An artifact path
     * does not include an artifact version.
     *
     * <p>Example: {@code project01/my-web-app/artifact-abc}
     *
     * @return the value
     */
    public String getArtifactPath() {
        return artifactPath;
    }

    /**
     * A user-defined string to describe the artifact version.
     *
     * <p>Example: {@code 1.1.0} or {@code 1.2-beta-2}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * A user-defined string to describe the artifact version.
     *
     * <p>Example: {@code 1.1.0} or {@code 1.2-beta-2}
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /**
     * The SHA256 digest for the artifact. When you upload an artifact to the repository, a SHA256
     * digest is calculated and added to the artifact properties.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sha256")
    private final String sha256;

    /**
     * The SHA256 digest for the artifact. When you upload an artifact to the repository, a SHA256
     * digest is calculated and added to the artifact properties.
     *
     * @return the value
     */
    public String getSha256() {
        return sha256;
    }

    /** The size of the artifact in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * The size of the artifact in bytes.
     *
     * @return the value
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /** The current state of the generic artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final GenericArtifact.LifecycleState lifecycleState;

    /**
     * The current state of the generic artifact.
     *
     * @return the value
     */
    public GenericArtifact.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** An RFC 3339 timestamp indicating when the artifact was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * An RFC 3339 timestamp indicating when the artifact was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("GenericArtifactSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(", artifactPath=").append(String.valueOf(this.artifactPath));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", sha256=").append(String.valueOf(this.sha256));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenericArtifactSummary)) {
            return false;
        }

        GenericArtifactSummary other = (GenericArtifactSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.artifactPath, other.artifactPath)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.sha256, other.sha256)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result = (result * PRIME) + (this.artifactPath == null ? 43 : this.artifactPath.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.sha256 == null ? 43 : this.sha256.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
