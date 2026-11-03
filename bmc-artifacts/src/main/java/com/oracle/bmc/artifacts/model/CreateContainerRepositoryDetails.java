/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Create container repository details. <br>
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
        builder = CreateContainerRepositoryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateContainerRepositoryDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "repositoryType",
        "isTopLevel",
        "upstreamUrl",
        "upstreamUsername",
        "upstreamSecretId",
        "multiRegionPeers",
        "isImmutable",
        "isPublic",
        "readme",
        "freeformTags",
        "definedTags"
    })
    public CreateContainerRepositoryDetails(
            String compartmentId,
            String displayName,
            ContainerRepository.RepositoryType repositoryType,
            Boolean isTopLevel,
            String upstreamUrl,
            String upstreamUsername,
            String upstreamSecretId,
            java.util.List<String> multiRegionPeers,
            Boolean isImmutable,
            Boolean isPublic,
            ContainerRepositoryReadme readme,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.repositoryType = repositoryType;
        this.isTopLevel = isTopLevel;
        this.upstreamUrl = upstreamUrl;
        this.upstreamUsername = upstreamUsername;
        this.upstreamSecretId = upstreamSecretId;
        this.multiRegionPeers = multiRegionPeers;
        this.isImmutable = isImmutable;
        this.isPublic = isPublic;
        this.readme = readme;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment in which to create the resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment in which to create the resource.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The container repository name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The container repository name.
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
         * The type of container repository. This determines the repository behavior and required
         * settings.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryType")
        private ContainerRepository.RepositoryType repositoryType;

        /**
         * The type of container repository. This determines the repository behavior and required
         * settings.
         *
         * @param repositoryType the value to set
         * @return this builder
         */
        public Builder repositoryType(ContainerRepository.RepositoryType repositoryType) {
            this.repositoryType = repositoryType;
            this.__explicitlySet__.add("repositoryType");
            return this;
        }
        /**
         * Whether the repository is top-level. A top-level repository reserves its name in
         * namespace as a prefix and allows images to be hosted under child paths of that prefix.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isTopLevel")
        private Boolean isTopLevel;

        /**
         * Whether the repository is top-level. A top-level repository reserves its name in
         * namespace as a prefix and allows images to be hosted under child paths of that prefix.
         *
         * @param isTopLevel the value to set
         * @return this builder
         */
        public Builder isTopLevel(Boolean isTopLevel) {
            this.isTopLevel = isTopLevel;
            this.__explicitlySet__.add("isTopLevel");
            return this;
        }
        /**
         * The upstream registry URL for a pull-through cache repository. Required when
         * repositoryType is PULL_THROUGH. The value must include the registry endpoint and
         * repository path, and must not include a tag or digest.
         *
         * <p>If isTopLevel is false, the value must be an exact upstream image full path. Example:
         * {@code iad.ocir.io/<upstreamNamespace>/library/ubuntu}
         *
         * <p>If isTopLevel is true, the value must be an upstream repository path prefix, allowing
         * OCIR to pull multiple repositories under that prefix. Example: {@code
         * iad.ocir.io/<upstreamNamespace>/library} or {@code iad.ocir.io/<upstreamNamespace>}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("upstreamUrl")
        private String upstreamUrl;

        /**
         * The upstream registry URL for a pull-through cache repository. Required when
         * repositoryType is PULL_THROUGH. The value must include the registry endpoint and
         * repository path, and must not include a tag or digest.
         *
         * <p>If isTopLevel is false, the value must be an exact upstream image full path. Example:
         * {@code iad.ocir.io/<upstreamNamespace>/library/ubuntu}
         *
         * <p>If isTopLevel is true, the value must be an upstream repository path prefix, allowing
         * OCIR to pull multiple repositories under that prefix. Example: {@code
         * iad.ocir.io/<upstreamNamespace>/library} or {@code iad.ocir.io/<upstreamNamespace>}
         *
         * @param upstreamUrl the value to set
         * @return this builder
         */
        public Builder upstreamUrl(String upstreamUrl) {
            this.upstreamUrl = upstreamUrl;
            this.__explicitlySet__.add("upstreamUrl");
            return this;
        }
        /**
         * The upstream registry username for a pull-through cache repository. Required when
         * repositoryType is PULL_THROUGH.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("upstreamUsername")
        private String upstreamUsername;

        /**
         * The upstream registry username for a pull-through cache repository. Required when
         * repositoryType is PULL_THROUGH.
         *
         * @param upstreamUsername the value to set
         * @return this builder
         */
        public Builder upstreamUsername(String upstreamUsername) {
            this.upstreamUsername = upstreamUsername;
            this.__explicitlySet__.add("upstreamUsername");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI Vault secret that contains the upstream registry password as base64 encoded string
         * for a pull-through cache repository. Required when repositoryType is PULL_THROUGH.
         *
         * <p>Example: {@code ocid1.vaultsecret.oc1..exampleuniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("upstreamSecretId")
        private String upstreamSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI Vault secret that contains the upstream registry password as base64 encoded string
         * for a pull-through cache repository. Required when repositoryType is PULL_THROUGH.
         *
         * <p>Example: {@code ocid1.vaultsecret.oc1..exampleuniqueID}
         *
         * @param upstreamSecretId the value to set
         * @return this builder
         */
        public Builder upstreamSecretId(String upstreamSecretId) {
            this.upstreamSecretId = upstreamSecretId;
            this.__explicitlySet__.add("upstreamSecretId");
            return this;
        }
        /**
         * List of peer regions that define the multi-region group. Peer regions must be specified
         * using canonical region names (for example, {@code us-phoenix-1}). The peer set must match
         * a supported multi-region endpoint group and MUST include the local OCIR region where the
         * repository is created. Required when repositoryType is MULTI_REGION.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("multiRegionPeers")
        private java.util.List<String> multiRegionPeers;

        /**
         * List of peer regions that define the multi-region group. Peer regions must be specified
         * using canonical region names (for example, {@code us-phoenix-1}). The peer set must match
         * a supported multi-region endpoint group and MUST include the local OCIR region where the
         * repository is created. Required when repositoryType is MULTI_REGION.
         *
         * @param multiRegionPeers the value to set
         * @return this builder
         */
        public Builder multiRegionPeers(java.util.List<String> multiRegionPeers) {
            this.multiRegionPeers = multiRegionPeers;
            this.__explicitlySet__.add("multiRegionPeers");
            return this;
        }
        /**
         * Whether the repository is immutable. Images cannot be overwritten in an immutable
         * repository. Currently, setting this flag is not supported yet and is set to false by
         * default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isImmutable")
        private Boolean isImmutable;

        /**
         * Whether the repository is immutable. Images cannot be overwritten in an immutable
         * repository. Currently, setting this flag is not supported yet and is set to false by
         * default.
         *
         * @param isImmutable the value to set
         * @return this builder
         */
        public Builder isImmutable(Boolean isImmutable) {
            this.isImmutable = isImmutable;
            this.__explicitlySet__.add("isImmutable");
            return this;
        }
        /** Whether the repository is public. A public repository allows unauthenticated access. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
        private Boolean isPublic;

        /**
         * Whether the repository is public. A public repository allows unauthenticated access.
         *
         * @param isPublic the value to set
         * @return this builder
         */
        public Builder isPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            this.__explicitlySet__.add("isPublic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("readme")
        private ContainerRepositoryReadme readme;

        public Builder readme(ContainerRepositoryReadme readme) {
            this.readme = readme;
            this.__explicitlySet__.add("readme");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateContainerRepositoryDetails build() {
            CreateContainerRepositoryDetails model =
                    new CreateContainerRepositoryDetails(
                            this.compartmentId,
                            this.displayName,
                            this.repositoryType,
                            this.isTopLevel,
                            this.upstreamUrl,
                            this.upstreamUsername,
                            this.upstreamSecretId,
                            this.multiRegionPeers,
                            this.isImmutable,
                            this.isPublic,
                            this.readme,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateContainerRepositoryDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("repositoryType")) {
                this.repositoryType(model.getRepositoryType());
            }
            if (model.wasPropertyExplicitlySet("isTopLevel")) {
                this.isTopLevel(model.getIsTopLevel());
            }
            if (model.wasPropertyExplicitlySet("upstreamUrl")) {
                this.upstreamUrl(model.getUpstreamUrl());
            }
            if (model.wasPropertyExplicitlySet("upstreamUsername")) {
                this.upstreamUsername(model.getUpstreamUsername());
            }
            if (model.wasPropertyExplicitlySet("upstreamSecretId")) {
                this.upstreamSecretId(model.getUpstreamSecretId());
            }
            if (model.wasPropertyExplicitlySet("multiRegionPeers")) {
                this.multiRegionPeers(model.getMultiRegionPeers());
            }
            if (model.wasPropertyExplicitlySet("isImmutable")) {
                this.isImmutable(model.getIsImmutable());
            }
            if (model.wasPropertyExplicitlySet("isPublic")) {
                this.isPublic(model.getIsPublic());
            }
            if (model.wasPropertyExplicitlySet("readme")) {
                this.readme(model.getReadme());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which to create the resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which to create the resource.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The container repository name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The container repository name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The type of container repository. This determines the repository behavior and required
     * settings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryType")
    private final ContainerRepository.RepositoryType repositoryType;

    /**
     * The type of container repository. This determines the repository behavior and required
     * settings.
     *
     * @return the value
     */
    public ContainerRepository.RepositoryType getRepositoryType() {
        return repositoryType;
    }

    /**
     * Whether the repository is top-level. A top-level repository reserves its name in namespace as
     * a prefix and allows images to be hosted under child paths of that prefix.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isTopLevel")
    private final Boolean isTopLevel;

    /**
     * Whether the repository is top-level. A top-level repository reserves its name in namespace as
     * a prefix and allows images to be hosted under child paths of that prefix.
     *
     * @return the value
     */
    public Boolean getIsTopLevel() {
        return isTopLevel;
    }

    /**
     * The upstream registry URL for a pull-through cache repository. Required when repositoryType
     * is PULL_THROUGH. The value must include the registry endpoint and repository path, and must
     * not include a tag or digest.
     *
     * <p>If isTopLevel is false, the value must be an exact upstream image full path. Example:
     * {@code iad.ocir.io/<upstreamNamespace>/library/ubuntu}
     *
     * <p>If isTopLevel is true, the value must be an upstream repository path prefix, allowing OCIR
     * to pull multiple repositories under that prefix. Example: {@code
     * iad.ocir.io/<upstreamNamespace>/library} or {@code iad.ocir.io/<upstreamNamespace>}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("upstreamUrl")
    private final String upstreamUrl;

    /**
     * The upstream registry URL for a pull-through cache repository. Required when repositoryType
     * is PULL_THROUGH. The value must include the registry endpoint and repository path, and must
     * not include a tag or digest.
     *
     * <p>If isTopLevel is false, the value must be an exact upstream image full path. Example:
     * {@code iad.ocir.io/<upstreamNamespace>/library/ubuntu}
     *
     * <p>If isTopLevel is true, the value must be an upstream repository path prefix, allowing OCIR
     * to pull multiple repositories under that prefix. Example: {@code
     * iad.ocir.io/<upstreamNamespace>/library} or {@code iad.ocir.io/<upstreamNamespace>}
     *
     * @return the value
     */
    public String getUpstreamUrl() {
        return upstreamUrl;
    }

    /**
     * The upstream registry username for a pull-through cache repository. Required when
     * repositoryType is PULL_THROUGH.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("upstreamUsername")
    private final String upstreamUsername;

    /**
     * The upstream registry username for a pull-through cache repository. Required when
     * repositoryType is PULL_THROUGH.
     *
     * @return the value
     */
    public String getUpstreamUsername() {
        return upstreamUsername;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * Vault secret that contains the upstream registry password as base64 encoded string for a
     * pull-through cache repository. Required when repositoryType is PULL_THROUGH.
     *
     * <p>Example: {@code ocid1.vaultsecret.oc1..exampleuniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("upstreamSecretId")
    private final String upstreamSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * Vault secret that contains the upstream registry password as base64 encoded string for a
     * pull-through cache repository. Required when repositoryType is PULL_THROUGH.
     *
     * <p>Example: {@code ocid1.vaultsecret.oc1..exampleuniqueID}
     *
     * @return the value
     */
    public String getUpstreamSecretId() {
        return upstreamSecretId;
    }

    /**
     * List of peer regions that define the multi-region group. Peer regions must be specified using
     * canonical region names (for example, {@code us-phoenix-1}). The peer set must match a
     * supported multi-region endpoint group and MUST include the local OCIR region where the
     * repository is created. Required when repositoryType is MULTI_REGION.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("multiRegionPeers")
    private final java.util.List<String> multiRegionPeers;

    /**
     * List of peer regions that define the multi-region group. Peer regions must be specified using
     * canonical region names (for example, {@code us-phoenix-1}). The peer set must match a
     * supported multi-region endpoint group and MUST include the local OCIR region where the
     * repository is created. Required when repositoryType is MULTI_REGION.
     *
     * @return the value
     */
    public java.util.List<String> getMultiRegionPeers() {
        return multiRegionPeers;
    }

    /**
     * Whether the repository is immutable. Images cannot be overwritten in an immutable repository.
     * Currently, setting this flag is not supported yet and is set to false by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isImmutable")
    private final Boolean isImmutable;

    /**
     * Whether the repository is immutable. Images cannot be overwritten in an immutable repository.
     * Currently, setting this flag is not supported yet and is set to false by default.
     *
     * @return the value
     */
    public Boolean getIsImmutable() {
        return isImmutable;
    }

    /** Whether the repository is public. A public repository allows unauthenticated access. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
    private final Boolean isPublic;

    /**
     * Whether the repository is public. A public repository allows unauthenticated access.
     *
     * @return the value
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("readme")
    private final ContainerRepositoryReadme readme;

    public ContainerRepositoryReadme getReadme() {
        return readme;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateContainerRepositoryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", repositoryType=").append(String.valueOf(this.repositoryType));
        sb.append(", isTopLevel=").append(String.valueOf(this.isTopLevel));
        sb.append(", upstreamUrl=").append(String.valueOf(this.upstreamUrl));
        sb.append(", upstreamUsername=").append(String.valueOf(this.upstreamUsername));
        sb.append(", upstreamSecretId=").append(String.valueOf(this.upstreamSecretId));
        sb.append(", multiRegionPeers=").append(String.valueOf(this.multiRegionPeers));
        sb.append(", isImmutable=").append(String.valueOf(this.isImmutable));
        sb.append(", isPublic=").append(String.valueOf(this.isPublic));
        sb.append(", readme=").append(String.valueOf(this.readme));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateContainerRepositoryDetails)) {
            return false;
        }

        CreateContainerRepositoryDetails other = (CreateContainerRepositoryDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.repositoryType, other.repositoryType)
                && java.util.Objects.equals(this.isTopLevel, other.isTopLevel)
                && java.util.Objects.equals(this.upstreamUrl, other.upstreamUrl)
                && java.util.Objects.equals(this.upstreamUsername, other.upstreamUsername)
                && java.util.Objects.equals(this.upstreamSecretId, other.upstreamSecretId)
                && java.util.Objects.equals(this.multiRegionPeers, other.multiRegionPeers)
                && java.util.Objects.equals(this.isImmutable, other.isImmutable)
                && java.util.Objects.equals(this.isPublic, other.isPublic)
                && java.util.Objects.equals(this.readme, other.readme)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryType == null ? 43 : this.repositoryType.hashCode());
        result = (result * PRIME) + (this.isTopLevel == null ? 43 : this.isTopLevel.hashCode());
        result = (result * PRIME) + (this.upstreamUrl == null ? 43 : this.upstreamUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.upstreamUsername == null ? 43 : this.upstreamUsername.hashCode());
        result =
                (result * PRIME)
                        + (this.upstreamSecretId == null ? 43 : this.upstreamSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.multiRegionPeers == null ? 43 : this.multiRegionPeers.hashCode());
        result = (result * PRIME) + (this.isImmutable == null ? 43 : this.isImmutable.hashCode());
        result = (result * PRIME) + (this.isPublic == null ? 43 : this.isPublic.hashCode());
        result = (result * PRIME) + (this.readme == null ? 43 : this.readme.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
