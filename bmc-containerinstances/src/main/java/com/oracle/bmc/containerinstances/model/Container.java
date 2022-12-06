/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * A single container on a Container Instance.
 *
 * <p>If this Container is DELETED, the record will remain visible for a short period of time before
 * being permanently removed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Container.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Container extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "freeformTags",
        "definedTags",
        "systemTags",
        "availabilityDomain",
        "faultDomain",
        "lifecycleState",
        "lifecycleDetails",
        "exitCode",
        "timeTerminated",
        "timeCreated",
        "timeUpdated",
        "containerInstanceId",
        "imageUrl",
        "command",
        "arguments",
        "additionalCapabilities",
        "workingDirectory",
        "environmentVariables",
        "volumeMounts",
        "healthChecks",
        "isResourcePrincipalDisabled",
        "resourceConfig",
        "containerRestartAttemptCount"
    })
    public Container(
            String id,
            String displayName,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String availabilityDomain,
            String faultDomain,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            Integer exitCode,
            java.util.Date timeTerminated,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String containerInstanceId,
            String imageUrl,
            java.util.List<String> command,
            java.util.List<String> arguments,
            java.util.List<ContainerCapability> additionalCapabilities,
            String workingDirectory,
            java.util.Map<String, String> environmentVariables,
            java.util.List<VolumeMount> volumeMounts,
            java.util.List<ContainerHealthCheck> healthChecks,
            Boolean isResourcePrincipalDisabled,
            ContainerResourceConfig resourceConfig,
            Integer containerRestartAttemptCount) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.availabilityDomain = availabilityDomain;
        this.faultDomain = faultDomain;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.exitCode = exitCode;
        this.timeTerminated = timeTerminated;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.containerInstanceId = containerInstanceId;
        this.imageUrl = imageUrl;
        this.command = command;
        this.arguments = arguments;
        this.additionalCapabilities = additionalCapabilities;
        this.workingDirectory = workingDirectory;
        this.environmentVariables = environmentVariables;
        this.volumeMounts = volumeMounts;
        this.healthChecks = healthChecks;
        this.isResourcePrincipalDisabled = isResourcePrincipalDisabled;
        this.resourceConfig = resourceConfig;
        this.containerRestartAttemptCount = containerRestartAttemptCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Display name for the Container. Can be renamed. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for the Container. Can be renamed.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
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
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** Availability Domain where the Container's Instance is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * Availability Domain where the Container's Instance is running.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** Fault Domain where the Container's Instance is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * Fault Domain where the Container's Instance is running.
         *
         * @param faultDomain the value to set
         * @return this builder
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /** The current state of the Container. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Container.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The exit code of the container process if it has stopped executing. */
        @com.fasterxml.jackson.annotation.JsonProperty("exitCode")
        private Integer exitCode;

        /**
         * The exit code of the container process if it has stopped executing.
         *
         * @param exitCode the value to set
         * @return this builder
         */
        public Builder exitCode(Integer exitCode) {
            this.exitCode = exitCode;
            this.__explicitlySet__.add("exitCode");
            return this;
        }
        /** Time at which the container last terminated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeTerminated")
        private java.util.Date timeTerminated;

        /**
         * Time at which the container last terminated. An RFC3339 formatted datetime string
         *
         * @param timeTerminated the value to set
         * @return this builder
         */
        public Builder timeTerminated(java.util.Date timeTerminated) {
            this.timeTerminated = timeTerminated;
            this.__explicitlySet__.add("timeTerminated");
            return this;
        }
        /** The time the the Container was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the Container was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the Container was updated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Container was updated. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The identifier of the Container Instance on which this container is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("containerInstanceId")
        private String containerInstanceId;

        /**
         * The identifier of the Container Instance on which this container is running.
         *
         * @param containerInstanceId the value to set
         * @return this builder
         */
        public Builder containerInstanceId(String containerInstanceId) {
            this.containerInstanceId = containerInstanceId;
            this.__explicitlySet__.add("containerInstanceId");
            return this;
        }
        /**
         * The container image information. Currently only support public docker registry. Can be
         * either image name, e.g {@code containerImage}, image name with version, e.g {@code
         * containerImage:v1} or complete docker image Url e.g {@code
         * docker.io/library/containerImage:latest}. If no registry is provided, will default the
         * registry to public docker hub {@code docker.io/library}. The registry used for container
         * image must be reachable over the Container Instance's VNIC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
        private String imageUrl;

        /**
         * The container image information. Currently only support public docker registry. Can be
         * either image name, e.g {@code containerImage}, image name with version, e.g {@code
         * containerImage:v1} or complete docker image Url e.g {@code
         * docker.io/library/containerImage:latest}. If no registry is provided, will default the
         * registry to public docker hub {@code docker.io/library}. The registry used for container
         * image must be reachable over the Container Instance's VNIC.
         *
         * @param imageUrl the value to set
         * @return this builder
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            this.__explicitlySet__.add("imageUrl");
            return this;
        }
        /**
         * This command will override the container's entrypoint process. If not specified, the
         * existing entrypoint process defined in the image will be used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private java.util.List<String> command;

        /**
         * This command will override the container's entrypoint process. If not specified, the
         * existing entrypoint process defined in the image will be used.
         *
         * @param command the value to set
         * @return this builder
         */
        public Builder command(java.util.List<String> command) {
            this.command = command;
            this.__explicitlySet__.add("command");
            return this;
        }
        /**
         * A list of string arguments for a Container's entrypoint process.
         *
         * <p>Many containers use an entrypoint process pointing to a shell, for example /bin/bash.
         * For such containers, this argument list can also be used to specify the main command in
         * the container process.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<String> arguments;

        /**
         * A list of string arguments for a Container's entrypoint process.
         *
         * <p>Many containers use an entrypoint process pointing to a shell, for example /bin/bash.
         * For such containers, this argument list can also be used to specify the main command in
         * the container process.
         *
         * @param arguments the value to set
         * @return this builder
         */
        public Builder arguments(java.util.List<String> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }
        /** A list of additional configurable container capabilities */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalCapabilities")
        private java.util.List<ContainerCapability> additionalCapabilities;

        /**
         * A list of additional configurable container capabilities
         *
         * @param additionalCapabilities the value to set
         * @return this builder
         */
        public Builder additionalCapabilities(
                java.util.List<ContainerCapability> additionalCapabilities) {
            this.additionalCapabilities = additionalCapabilities;
            this.__explicitlySet__.add("additionalCapabilities");
            return this;
        }
        /**
         * The working directory within the Container's filesystem for the Container process. If
         * this is not present, the default working directory from the image will be used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
        private String workingDirectory;

        /**
         * The working directory within the Container's filesystem for the Container process. If
         * this is not present, the default working directory from the image will be used.
         *
         * @param workingDirectory the value to set
         * @return this builder
         */
        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = workingDirectory;
            this.__explicitlySet__.add("workingDirectory");
            return this;
        }
        /**
         * A map of additional environment variables to set in the environment of the container's
         * entrypoint process. These variables are in addition to any variables already defined in
         * the container's image.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
        private java.util.Map<String, String> environmentVariables;

        /**
         * A map of additional environment variables to set in the environment of the container's
         * entrypoint process. These variables are in addition to any variables already defined in
         * the container's image.
         *
         * @param environmentVariables the value to set
         * @return this builder
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            this.__explicitlySet__.add("environmentVariables");
            return this;
        }
        /** List of the volume mounts. */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeMounts")
        private java.util.List<VolumeMount> volumeMounts;

        /**
         * List of the volume mounts.
         *
         * @param volumeMounts the value to set
         * @return this builder
         */
        public Builder volumeMounts(java.util.List<VolumeMount> volumeMounts) {
            this.volumeMounts = volumeMounts;
            this.__explicitlySet__.add("volumeMounts");
            return this;
        }
        /** List of container health checks */
        @com.fasterxml.jackson.annotation.JsonProperty("healthChecks")
        private java.util.List<ContainerHealthCheck> healthChecks;

        /**
         * List of container health checks
         *
         * @param healthChecks the value to set
         * @return this builder
         */
        public Builder healthChecks(java.util.List<ContainerHealthCheck> healthChecks) {
            this.healthChecks = healthChecks;
            this.__explicitlySet__.add("healthChecks");
            return this;
        }
        /**
         * Determines if the Container will have access to the Container Instance Resource
         * Principal. This method utilizes resource principal version 2.2. Please refer to
         * https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal
         * for detailed explanation of how to leverage the exposed resource principal elements.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isResourcePrincipalDisabled")
        private Boolean isResourcePrincipalDisabled;

        /**
         * Determines if the Container will have access to the Container Instance Resource
         * Principal. This method utilizes resource principal version 2.2. Please refer to
         * https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal
         * for detailed explanation of how to leverage the exposed resource principal elements.
         *
         * @param isResourcePrincipalDisabled the value to set
         * @return this builder
         */
        public Builder isResourcePrincipalDisabled(Boolean isResourcePrincipalDisabled) {
            this.isResourcePrincipalDisabled = isResourcePrincipalDisabled;
            this.__explicitlySet__.add("isResourcePrincipalDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceConfig")
        private ContainerResourceConfig resourceConfig;

        public Builder resourceConfig(ContainerResourceConfig resourceConfig) {
            this.resourceConfig = resourceConfig;
            this.__explicitlySet__.add("resourceConfig");
            return this;
        }
        /**
         * The number of container restart attempts. A restart may be attempted after a health check
         * failure or a container exit, based on the restart policy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("containerRestartAttemptCount")
        private Integer containerRestartAttemptCount;

        /**
         * The number of container restart attempts. A restart may be attempted after a health check
         * failure or a container exit, based on the restart policy.
         *
         * @param containerRestartAttemptCount the value to set
         * @return this builder
         */
        public Builder containerRestartAttemptCount(Integer containerRestartAttemptCount) {
            this.containerRestartAttemptCount = containerRestartAttemptCount;
            this.__explicitlySet__.add("containerRestartAttemptCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Container build() {
            Container model =
                    new Container(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.availabilityDomain,
                            this.faultDomain,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.exitCode,
                            this.timeTerminated,
                            this.timeCreated,
                            this.timeUpdated,
                            this.containerInstanceId,
                            this.imageUrl,
                            this.command,
                            this.arguments,
                            this.additionalCapabilities,
                            this.workingDirectory,
                            this.environmentVariables,
                            this.volumeMounts,
                            this.healthChecks,
                            this.isResourcePrincipalDisabled,
                            this.resourceConfig,
                            this.containerRestartAttemptCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Container model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("exitCode")) {
                this.exitCode(model.getExitCode());
            }
            if (model.wasPropertyExplicitlySet("timeTerminated")) {
                this.timeTerminated(model.getTimeTerminated());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("containerInstanceId")) {
                this.containerInstanceId(model.getContainerInstanceId());
            }
            if (model.wasPropertyExplicitlySet("imageUrl")) {
                this.imageUrl(model.getImageUrl());
            }
            if (model.wasPropertyExplicitlySet("command")) {
                this.command(model.getCommand());
            }
            if (model.wasPropertyExplicitlySet("arguments")) {
                this.arguments(model.getArguments());
            }
            if (model.wasPropertyExplicitlySet("additionalCapabilities")) {
                this.additionalCapabilities(model.getAdditionalCapabilities());
            }
            if (model.wasPropertyExplicitlySet("workingDirectory")) {
                this.workingDirectory(model.getWorkingDirectory());
            }
            if (model.wasPropertyExplicitlySet("environmentVariables")) {
                this.environmentVariables(model.getEnvironmentVariables());
            }
            if (model.wasPropertyExplicitlySet("volumeMounts")) {
                this.volumeMounts(model.getVolumeMounts());
            }
            if (model.wasPropertyExplicitlySet("healthChecks")) {
                this.healthChecks(model.getHealthChecks());
            }
            if (model.wasPropertyExplicitlySet("isResourcePrincipalDisabled")) {
                this.isResourcePrincipalDisabled(model.getIsResourcePrincipalDisabled());
            }
            if (model.wasPropertyExplicitlySet("resourceConfig")) {
                this.resourceConfig(model.getResourceConfig());
            }
            if (model.wasPropertyExplicitlySet("containerRestartAttemptCount")) {
                this.containerRestartAttemptCount(model.getContainerRestartAttemptCount());
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

    /** Unique identifier that is immutable on creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Display name for the Container. Can be renamed. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for the Container. Can be renamed.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** Availability Domain where the Container's Instance is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * Availability Domain where the Container's Instance is running.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** Fault Domain where the Container's Instance is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * Fault Domain where the Container's Instance is running.
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /** The current state of the Container. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
    /** The current state of the Container. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Container.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The exit code of the container process if it has stopped executing. */
    @com.fasterxml.jackson.annotation.JsonProperty("exitCode")
    private final Integer exitCode;

    /**
     * The exit code of the container process if it has stopped executing.
     *
     * @return the value
     */
    public Integer getExitCode() {
        return exitCode;
    }

    /** Time at which the container last terminated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeTerminated")
    private final java.util.Date timeTerminated;

    /**
     * Time at which the container last terminated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeTerminated() {
        return timeTerminated;
    }

    /** The time the the Container was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the Container was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the Container was updated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Container was updated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The identifier of the Container Instance on which this container is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("containerInstanceId")
    private final String containerInstanceId;

    /**
     * The identifier of the Container Instance on which this container is running.
     *
     * @return the value
     */
    public String getContainerInstanceId() {
        return containerInstanceId;
    }

    /**
     * The container image information. Currently only support public docker registry. Can be either
     * image name, e.g {@code containerImage}, image name with version, e.g {@code
     * containerImage:v1} or complete docker image Url e.g {@code
     * docker.io/library/containerImage:latest}. If no registry is provided, will default the
     * registry to public docker hub {@code docker.io/library}. The registry used for container
     * image must be reachable over the Container Instance's VNIC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
    private final String imageUrl;

    /**
     * The container image information. Currently only support public docker registry. Can be either
     * image name, e.g {@code containerImage}, image name with version, e.g {@code
     * containerImage:v1} or complete docker image Url e.g {@code
     * docker.io/library/containerImage:latest}. If no registry is provided, will default the
     * registry to public docker hub {@code docker.io/library}. The registry used for container
     * image must be reachable over the Container Instance's VNIC.
     *
     * @return the value
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This command will override the container's entrypoint process. If not specified, the existing
     * entrypoint process defined in the image will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    private final java.util.List<String> command;

    /**
     * This command will override the container's entrypoint process. If not specified, the existing
     * entrypoint process defined in the image will be used.
     *
     * @return the value
     */
    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * A list of string arguments for a Container's entrypoint process.
     *
     * <p>Many containers use an entrypoint process pointing to a shell, for example /bin/bash. For
     * such containers, this argument list can also be used to specify the main command in the
     * container process.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    private final java.util.List<String> arguments;

    /**
     * A list of string arguments for a Container's entrypoint process.
     *
     * <p>Many containers use an entrypoint process pointing to a shell, for example /bin/bash. For
     * such containers, this argument list can also be used to specify the main command in the
     * container process.
     *
     * @return the value
     */
    public java.util.List<String> getArguments() {
        return arguments;
    }

    /** A list of additional configurable container capabilities */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalCapabilities")
    private final java.util.List<ContainerCapability> additionalCapabilities;

    /**
     * A list of additional configurable container capabilities
     *
     * @return the value
     */
    public java.util.List<ContainerCapability> getAdditionalCapabilities() {
        return additionalCapabilities;
    }

    /**
     * The working directory within the Container's filesystem for the Container process. If this is
     * not present, the default working directory from the image will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
    private final String workingDirectory;

    /**
     * The working directory within the Container's filesystem for the Container process. If this is
     * not present, the default working directory from the image will be used.
     *
     * @return the value
     */
    public String getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * A map of additional environment variables to set in the environment of the container's
     * entrypoint process. These variables are in addition to any variables already defined in the
     * container's image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.Map<String, String> environmentVariables;

    /**
     * A map of additional environment variables to set in the environment of the container's
     * entrypoint process. These variables are in addition to any variables already defined in the
     * container's image.
     *
     * @return the value
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /** List of the volume mounts. */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeMounts")
    private final java.util.List<VolumeMount> volumeMounts;

    /**
     * List of the volume mounts.
     *
     * @return the value
     */
    public java.util.List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /** List of container health checks */
    @com.fasterxml.jackson.annotation.JsonProperty("healthChecks")
    private final java.util.List<ContainerHealthCheck> healthChecks;

    /**
     * List of container health checks
     *
     * @return the value
     */
    public java.util.List<ContainerHealthCheck> getHealthChecks() {
        return healthChecks;
    }

    /**
     * Determines if the Container will have access to the Container Instance Resource Principal.
     * This method utilizes resource principal version 2.2. Please refer to
     * https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal
     * for detailed explanation of how to leverage the exposed resource principal elements.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isResourcePrincipalDisabled")
    private final Boolean isResourcePrincipalDisabled;

    /**
     * Determines if the Container will have access to the Container Instance Resource Principal.
     * This method utilizes resource principal version 2.2. Please refer to
     * https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal
     * for detailed explanation of how to leverage the exposed resource principal elements.
     *
     * @return the value
     */
    public Boolean getIsResourcePrincipalDisabled() {
        return isResourcePrincipalDisabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceConfig")
    private final ContainerResourceConfig resourceConfig;

    public ContainerResourceConfig getResourceConfig() {
        return resourceConfig;
    }

    /**
     * The number of container restart attempts. A restart may be attempted after a health check
     * failure or a container exit, based on the restart policy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containerRestartAttemptCount")
    private final Integer containerRestartAttemptCount;

    /**
     * The number of container restart attempts. A restart may be attempted after a health check
     * failure or a container exit, based on the restart policy.
     *
     * @return the value
     */
    public Integer getContainerRestartAttemptCount() {
        return containerRestartAttemptCount;
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
        sb.append("Container(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", exitCode=").append(String.valueOf(this.exitCode));
        sb.append(", timeTerminated=").append(String.valueOf(this.timeTerminated));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", containerInstanceId=").append(String.valueOf(this.containerInstanceId));
        sb.append(", imageUrl=").append(String.valueOf(this.imageUrl));
        sb.append(", command=").append(String.valueOf(this.command));
        sb.append(", arguments=").append(String.valueOf(this.arguments));
        sb.append(", additionalCapabilities=").append(String.valueOf(this.additionalCapabilities));
        sb.append(", workingDirectory=").append(String.valueOf(this.workingDirectory));
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(", volumeMounts=").append(String.valueOf(this.volumeMounts));
        sb.append(", healthChecks=").append(String.valueOf(this.healthChecks));
        sb.append(", isResourcePrincipalDisabled=")
                .append(String.valueOf(this.isResourcePrincipalDisabled));
        sb.append(", resourceConfig=").append(String.valueOf(this.resourceConfig));
        sb.append(", containerRestartAttemptCount=")
                .append(String.valueOf(this.containerRestartAttemptCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Container)) {
            return false;
        }

        Container other = (Container) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.exitCode, other.exitCode)
                && java.util.Objects.equals(this.timeTerminated, other.timeTerminated)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.containerInstanceId, other.containerInstanceId)
                && java.util.Objects.equals(this.imageUrl, other.imageUrl)
                && java.util.Objects.equals(this.command, other.command)
                && java.util.Objects.equals(this.arguments, other.arguments)
                && java.util.Objects.equals(
                        this.additionalCapabilities, other.additionalCapabilities)
                && java.util.Objects.equals(this.workingDirectory, other.workingDirectory)
                && java.util.Objects.equals(this.environmentVariables, other.environmentVariables)
                && java.util.Objects.equals(this.volumeMounts, other.volumeMounts)
                && java.util.Objects.equals(this.healthChecks, other.healthChecks)
                && java.util.Objects.equals(
                        this.isResourcePrincipalDisabled, other.isResourcePrincipalDisabled)
                && java.util.Objects.equals(this.resourceConfig, other.resourceConfig)
                && java.util.Objects.equals(
                        this.containerRestartAttemptCount, other.containerRestartAttemptCount)
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.exitCode == null ? 43 : this.exitCode.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTerminated == null ? 43 : this.timeTerminated.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.containerInstanceId == null
                                ? 43
                                : this.containerInstanceId.hashCode());
        result = (result * PRIME) + (this.imageUrl == null ? 43 : this.imageUrl.hashCode());
        result = (result * PRIME) + (this.command == null ? 43 : this.command.hashCode());
        result = (result * PRIME) + (this.arguments == null ? 43 : this.arguments.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalCapabilities == null
                                ? 43
                                : this.additionalCapabilities.hashCode());
        result =
                (result * PRIME)
                        + (this.workingDirectory == null ? 43 : this.workingDirectory.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentVariables == null
                                ? 43
                                : this.environmentVariables.hashCode());
        result = (result * PRIME) + (this.volumeMounts == null ? 43 : this.volumeMounts.hashCode());
        result = (result * PRIME) + (this.healthChecks == null ? 43 : this.healthChecks.hashCode());
        result =
                (result * PRIME)
                        + (this.isResourcePrincipalDisabled == null
                                ? 43
                                : this.isResourcePrincipalDisabled.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceConfig == null ? 43 : this.resourceConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.containerRestartAttemptCount == null
                                ? 43
                                : this.containerRestartAttemptCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
