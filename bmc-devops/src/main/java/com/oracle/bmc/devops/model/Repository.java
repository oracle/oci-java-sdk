/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Repositories containing the source code to build and deploy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Repository.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Repository extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "compartmentId",
        "namespace",
        "projectId",
        "projectName",
        "sshUrl",
        "httpUrl",
        "description",
        "defaultBranch",
        "repositoryType",
        "mirrorRepositoryConfig",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecyleDetails",
        "branchCount",
        "commitCount",
        "sizeInBytes",
        "triggerBuildEvents",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Repository(
            String id,
            String name,
            String compartmentId,
            String namespace,
            String projectId,
            String projectName,
            String sshUrl,
            String httpUrl,
            String description,
            String defaultBranch,
            RepositoryType repositoryType,
            MirrorRepositoryConfig mirrorRepositoryConfig,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecyleDetails,
            Integer branchCount,
            Integer commitCount,
            Long sizeInBytes,
            java.util.List<TriggerBuildEvents> triggerBuildEvents,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.name = name;
        this.compartmentId = compartmentId;
        this.namespace = namespace;
        this.projectId = projectId;
        this.projectName = projectName;
        this.sshUrl = sshUrl;
        this.httpUrl = httpUrl;
        this.description = description;
        this.defaultBranch = defaultBranch;
        this.repositoryType = repositoryType;
        this.mirrorRepositoryConfig = mirrorRepositoryConfig;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecyleDetails = lifecyleDetails;
        this.branchCount = branchCount;
        this.commitCount = commitCount;
        this.sizeInBytes = sizeInBytes;
        this.triggerBuildEvents = triggerBuildEvents;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the repository. This value is unique and immutable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the repository. This value is unique and immutable.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Name of the repository. Should be unique within the project. This value is mutable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the repository. Should be unique within the project. This value is mutable.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The OCID of the repository's compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the repository's compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Tenancy unique namespace.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Tenancy unique namespace.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
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
         * Unique project name in a namespace.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("projectName")
        private String projectName;

        /**
         * Unique project name in a namespace.
         * @param projectName the value to set
         * @return this builder
         **/
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            this.__explicitlySet__.add("projectName");
            return this;
        }
        /**
         * SSH URL that you use to git clone, pull and push.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sshUrl")
        private String sshUrl;

        /**
         * SSH URL that you use to git clone, pull and push.
         * @param sshUrl the value to set
         * @return this builder
         **/
        public Builder sshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            this.__explicitlySet__.add("sshUrl");
            return this;
        }
        /**
         * HTTP URL that you use to git clone, pull and push.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("httpUrl")
        private String httpUrl;

        /**
         * HTTP URL that you use to git clone, pull and push.
         * @param httpUrl the value to set
         * @return this builder
         **/
        public Builder httpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            this.__explicitlySet__.add("httpUrl");
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
         * Type of repository:
         * MIRRORED - Repository created by mirroring an existing repository.
         * HOSTED - Repository created and hosted using OCI DevOps code repository.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryType")
        private RepositoryType repositoryType;

        /**
         * Type of repository:
         * MIRRORED - Repository created by mirroring an existing repository.
         * HOSTED - Repository created and hosted using OCI DevOps code repository.
         *
         * @param repositoryType the value to set
         * @return this builder
         **/
        public Builder repositoryType(RepositoryType repositoryType) {
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
         * The time the repository was created. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the repository was created. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the repository was updated. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the repository was updated. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the repository.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the repository.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecyleDetails")
        private String lifecyleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecyleDetails the value to set
         * @return this builder
         **/
        public Builder lifecyleDetails(String lifecyleDetails) {
            this.lifecyleDetails = lifecyleDetails;
            this.__explicitlySet__.add("lifecyleDetails");
            return this;
        }
        /**
         * The count of the branches present in the repository.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("branchCount")
        private Integer branchCount;

        /**
         * The count of the branches present in the repository.
         * @param branchCount the value to set
         * @return this builder
         **/
        public Builder branchCount(Integer branchCount) {
            this.branchCount = branchCount;
            this.__explicitlySet__.add("branchCount");
            return this;
        }
        /**
         * The count of the commits present in the repository.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commitCount")
        private Integer commitCount;

        /**
         * The count of the commits present in the repository.
         * @param commitCount the value to set
         * @return this builder
         **/
        public Builder commitCount(Integer commitCount) {
            this.commitCount = commitCount;
            this.__explicitlySet__.add("commitCount");
            return this;
        }
        /**
         * The size of the repository in bytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * The size of the repository in bytes.
         * @param sizeInBytes the value to set
         * @return this builder
         **/
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }
        /**
         * Trigger build events supported for this repository:
         * PUSH - Build is triggered when a push event occurs.
         * PULL_REQUEST_CREATED - Build is triggered when a pull request is created in the repository.
         * PULL_REQUEST_UPDATED - Build is triggered when a push is made to a branch with an open pull request.
         * COMMIT_UPDATES - Build is triggered when new commits are mirrored into a repository.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("triggerBuildEvents")
        private java.util.List<TriggerBuildEvents> triggerBuildEvents;

        /**
         * Trigger build events supported for this repository:
         * PUSH - Build is triggered when a push event occurs.
         * PULL_REQUEST_CREATED - Build is triggered when a pull request is created in the repository.
         * PULL_REQUEST_UPDATED - Build is triggered when a push is made to a branch with an open pull request.
         * COMMIT_UPDATES - Build is triggered when new commits are mirrored into a repository.
         *
         * @param triggerBuildEvents the value to set
         * @return this builder
         **/
        public Builder triggerBuildEvents(java.util.List<TriggerBuildEvents> triggerBuildEvents) {
            this.triggerBuildEvents = triggerBuildEvents;
            this.__explicitlySet__.add("triggerBuildEvents");
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
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Repository build() {
            Repository model =
                    new Repository(
                            this.id,
                            this.name,
                            this.compartmentId,
                            this.namespace,
                            this.projectId,
                            this.projectName,
                            this.sshUrl,
                            this.httpUrl,
                            this.description,
                            this.defaultBranch,
                            this.repositoryType,
                            this.mirrorRepositoryConfig,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecyleDetails,
                            this.branchCount,
                            this.commitCount,
                            this.sizeInBytes,
                            this.triggerBuildEvents,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Repository model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("projectName")) {
                this.projectName(model.getProjectName());
            }
            if (model.wasPropertyExplicitlySet("sshUrl")) {
                this.sshUrl(model.getSshUrl());
            }
            if (model.wasPropertyExplicitlySet("httpUrl")) {
                this.httpUrl(model.getHttpUrl());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecyleDetails")) {
                this.lifecyleDetails(model.getLifecyleDetails());
            }
            if (model.wasPropertyExplicitlySet("branchCount")) {
                this.branchCount(model.getBranchCount());
            }
            if (model.wasPropertyExplicitlySet("commitCount")) {
                this.commitCount(model.getCommitCount());
            }
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("triggerBuildEvents")) {
                this.triggerBuildEvents(model.getTriggerBuildEvents());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The OCID of the repository. This value is unique and immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the repository. This value is unique and immutable.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Name of the repository. Should be unique within the project. This value is mutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the repository. Should be unique within the project. This value is mutable.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The OCID of the repository's compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the repository's compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Tenancy unique namespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Tenancy unique namespace.
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
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
     * Unique project name in a namespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectName")
    private final String projectName;

    /**
     * Unique project name in a namespace.
     * @return the value
     **/
    public String getProjectName() {
        return projectName;
    }

    /**
     * SSH URL that you use to git clone, pull and push.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshUrl")
    private final String sshUrl;

    /**
     * SSH URL that you use to git clone, pull and push.
     * @return the value
     **/
    public String getSshUrl() {
        return sshUrl;
    }

    /**
     * HTTP URL that you use to git clone, pull and push.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpUrl")
    private final String httpUrl;

    /**
     * HTTP URL that you use to git clone, pull and push.
     * @return the value
     **/
    public String getHttpUrl() {
        return httpUrl;
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
     * Type of repository:
     * MIRRORED - Repository created by mirroring an existing repository.
     * HOSTED - Repository created and hosted using OCI DevOps code repository.
     *
     **/
    public enum RepositoryType {
        Mirrored("MIRRORED"),
        Hosted("HOSTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RepositoryType.class);

        private final String value;
        private static java.util.Map<String, RepositoryType> map;

        static {
            map = new java.util.HashMap<>();
            for (RepositoryType v : RepositoryType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RepositoryType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RepositoryType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RepositoryType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of repository:
     * MIRRORED - Repository created by mirroring an existing repository.
     * HOSTED - Repository created and hosted using OCI DevOps code repository.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryType")
    private final RepositoryType repositoryType;

    /**
     * Type of repository:
     * MIRRORED - Repository created by mirroring an existing repository.
     * HOSTED - Repository created and hosted using OCI DevOps code repository.
     *
     * @return the value
     **/
    public RepositoryType getRepositoryType() {
        return repositoryType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mirrorRepositoryConfig")
    private final MirrorRepositoryConfig mirrorRepositoryConfig;

    public MirrorRepositoryConfig getMirrorRepositoryConfig() {
        return mirrorRepositoryConfig;
    }

    /**
     * The time the repository was created. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the repository was created. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the repository was updated. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the repository was updated. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the repository.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleted("DELETED"),
        Deleting("DELETING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The current state of the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the repository.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecyleDetails")
    private final String lifecyleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecyleDetails() {
        return lifecyleDetails;
    }

    /**
     * The count of the branches present in the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("branchCount")
    private final Integer branchCount;

    /**
     * The count of the branches present in the repository.
     * @return the value
     **/
    public Integer getBranchCount() {
        return branchCount;
    }

    /**
     * The count of the commits present in the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitCount")
    private final Integer commitCount;

    /**
     * The count of the commits present in the repository.
     * @return the value
     **/
    public Integer getCommitCount() {
        return commitCount;
    }

    /**
     * The size of the repository in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * The size of the repository in bytes.
     * @return the value
     **/
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     **/
    public enum TriggerBuildEvents {
        Push("PUSH"),
        PullRequestCreated("PULL_REQUEST_CREATED"),
        PullRequestUpdated("PULL_REQUEST_UPDATED"),
        CommitUpdates("COMMIT_UPDATES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TriggerBuildEvents.class);

        private final String value;
        private static java.util.Map<String, TriggerBuildEvents> map;

        static {
            map = new java.util.HashMap<>();
            for (TriggerBuildEvents v : TriggerBuildEvents.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TriggerBuildEvents(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TriggerBuildEvents create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TriggerBuildEvents', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Trigger build events supported for this repository:
     * PUSH - Build is triggered when a push event occurs.
     * PULL_REQUEST_CREATED - Build is triggered when a pull request is created in the repository.
     * PULL_REQUEST_UPDATED - Build is triggered when a push is made to a branch with an open pull request.
     * COMMIT_UPDATES - Build is triggered when new commits are mirrored into a repository.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("triggerBuildEvents")
    private final java.util.List<TriggerBuildEvents> triggerBuildEvents;

    /**
     * Trigger build events supported for this repository:
     * PUSH - Build is triggered when a push event occurs.
     * PULL_REQUEST_CREATED - Build is triggered when a pull request is created in the repository.
     * PULL_REQUEST_UPDATED - Build is triggered when a push is made to a branch with an open pull request.
     * COMMIT_UPDATES - Build is triggered when new commits are mirrored into a repository.
     *
     * @return the value
     **/
    public java.util.List<TriggerBuildEvents> getTriggerBuildEvents() {
        return triggerBuildEvents;
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

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("Repository(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", projectName=").append(String.valueOf(this.projectName));
        sb.append(", sshUrl=").append(String.valueOf(this.sshUrl));
        sb.append(", httpUrl=").append(String.valueOf(this.httpUrl));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", defaultBranch=").append(String.valueOf(this.defaultBranch));
        sb.append(", repositoryType=").append(String.valueOf(this.repositoryType));
        sb.append(", mirrorRepositoryConfig=").append(String.valueOf(this.mirrorRepositoryConfig));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecyleDetails=").append(String.valueOf(this.lifecyleDetails));
        sb.append(", branchCount=").append(String.valueOf(this.branchCount));
        sb.append(", commitCount=").append(String.valueOf(this.commitCount));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", triggerBuildEvents=").append(String.valueOf(this.triggerBuildEvents));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Repository)) {
            return false;
        }

        Repository other = (Repository) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.projectName, other.projectName)
                && java.util.Objects.equals(this.sshUrl, other.sshUrl)
                && java.util.Objects.equals(this.httpUrl, other.httpUrl)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.defaultBranch, other.defaultBranch)
                && java.util.Objects.equals(this.repositoryType, other.repositoryType)
                && java.util.Objects.equals(
                        this.mirrorRepositoryConfig, other.mirrorRepositoryConfig)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecyleDetails, other.lifecyleDetails)
                && java.util.Objects.equals(this.branchCount, other.branchCount)
                && java.util.Objects.equals(this.commitCount, other.commitCount)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(this.triggerBuildEvents, other.triggerBuildEvents)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.projectName == null ? 43 : this.projectName.hashCode());
        result = (result * PRIME) + (this.sshUrl == null ? 43 : this.sshUrl.hashCode());
        result = (result * PRIME) + (this.httpUrl == null ? 43 : this.httpUrl.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
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
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecyleDetails == null ? 43 : this.lifecyleDetails.hashCode());
        result = (result * PRIME) + (this.branchCount == null ? 43 : this.branchCount.hashCode());
        result = (result * PRIME) + (this.commitCount == null ? 43 : this.commitCount.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.triggerBuildEvents == null
                                ? 43
                                : this.triggerBuildEvents.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
