/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Information about the new repository.
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
    builder = CreateRepositoryDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateRepositoryDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "projectId",
        "defaultBranch",
        "repositoryType",
        "mirrorRepositoryConfig",
        "description",
        "freeformTags",
        "definedTags"
    })
    public CreateRepositoryDetails(
            String name,
            String projectId,
            String defaultBranch,
            Repository.RepositoryType repositoryType,
            MirrorRepositoryConfig mirrorRepositoryConfig,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.name = name;
        this.projectId = projectId;
        this.defaultBranch = defaultBranch;
        this.repositoryType = repositoryType;
        this.mirrorRepositoryConfig = mirrorRepositoryConfig;
        this.description = description;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique name of a repository.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique name of a repository.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The OCID of the DevOps project containing the repository.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * The OCID of the DevOps project containing the repository.
         * @param projectId the value to set
         * @return this builder
         **/
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /**
         * The default branch of the repository.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultBranch")
        private String defaultBranch;

        /**
         * The default branch of the repository.
         * @param defaultBranch the value to set
         * @return this builder
         **/
        public Builder defaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
            this.__explicitlySet__.add("defaultBranch");
            return this;
        }
        /**
         * Type of repository. Allowed values:
         * {@code MIRRORED}
         * {@code HOSTED}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryType")
        private Repository.RepositoryType repositoryType;

        /**
         * Type of repository. Allowed values:
         * {@code MIRRORED}
         * {@code HOSTED}
         *
         * @param repositoryType the value to set
         * @return this builder
         **/
        public Builder repositoryType(Repository.RepositoryType repositoryType) {
            this.repositoryType = repositoryType;
            this.__explicitlySet__.add("repositoryType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mirrorRepositoryConfig")
        private MirrorRepositoryConfig mirrorRepositoryConfig;

        public Builder mirrorRepositoryConfig(MirrorRepositoryConfig mirrorRepositoryConfig) {
            this.mirrorRepositoryConfig = mirrorRepositoryConfig;
            this.__explicitlySet__.add("mirrorRepositoryConfig");
            return this;
        }
        /**
         * Details of the repository. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Details of the repository. Avoid entering confidential information.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateRepositoryDetails build() {
            CreateRepositoryDetails model =
                    new CreateRepositoryDetails(
                            this.name,
                            this.projectId,
                            this.defaultBranch,
                            this.repositoryType,
                            this.mirrorRepositoryConfig,
                            this.description,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRepositoryDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("defaultBranch")) {
                this.defaultBranch(model.getDefaultBranch());
            }
            if (model.wasPropertyExplicitlySet("repositoryType")) {
                this.repositoryType(model.getRepositoryType());
            }
            if (model.wasPropertyExplicitlySet("mirrorRepositoryConfig")) {
                this.mirrorRepositoryConfig(model.getMirrorRepositoryConfig());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique name of a repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique name of a repository.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The OCID of the DevOps project containing the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * The OCID of the DevOps project containing the repository.
     * @return the value
     **/
    public String getProjectId() {
        return projectId;
    }

    /**
     * The default branch of the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultBranch")
    private final String defaultBranch;

    /**
     * The default branch of the repository.
     * @return the value
     **/
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
     * Type of repository. Allowed values:
     * {@code MIRRORED}
     * {@code HOSTED}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryType")
    private final Repository.RepositoryType repositoryType;

    /**
     * Type of repository. Allowed values:
     * {@code MIRRORED}
     * {@code HOSTED}
     *
     * @return the value
     **/
    public Repository.RepositoryType getRepositoryType() {
        return repositoryType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mirrorRepositoryConfig")
    private final MirrorRepositoryConfig mirrorRepositoryConfig;

    public MirrorRepositoryConfig getMirrorRepositoryConfig() {
        return mirrorRepositoryConfig;
    }

    /**
     * Details of the repository. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Details of the repository. Avoid entering confidential information.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateRepositoryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", defaultBranch=").append(String.valueOf(this.defaultBranch));
        sb.append(", repositoryType=").append(String.valueOf(this.repositoryType));
        sb.append(", mirrorRepositoryConfig=").append(String.valueOf(this.mirrorRepositoryConfig));
        sb.append(", description=").append(String.valueOf(this.description));
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
        if (!(o instanceof CreateRepositoryDetails)) {
            return false;
        }

        CreateRepositoryDetails other = (CreateRepositoryDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.defaultBranch, other.defaultBranch)
                && java.util.Objects.equals(this.repositoryType, other.repositoryType)
                && java.util.Objects.equals(
                        this.mirrorRepositoryConfig, other.mirrorRepositoryConfig)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultBranch == null ? 43 : this.defaultBranch.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryType == null ? 43 : this.repositoryType.hashCode());
        result =
                (result * PRIME)
                        + (this.mirrorRepositoryConfig == null
                                ? 43
                                : this.mirrorRepositoryConfig.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
