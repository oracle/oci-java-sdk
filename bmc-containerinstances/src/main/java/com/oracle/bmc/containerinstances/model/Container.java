/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * A single container on a container instance.
 * <p>
 * If you delete a container, the record remains visible for a short period
 * of time before being permanently removed.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Container.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Container extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        "workingDirectory",
        "environmentVariables",
        "volumeMounts",
        "healthChecks",
        "isResourcePrincipalDisabled",
        "resourceConfig",
        "containerRestartAttemptCount",
        "securityContext"
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
            String workingDirectory,
            java.util.Map<String, String> environmentVariables,
            java.util.List<VolumeMount> volumeMounts,
            java.util.List<ContainerHealthCheck> healthChecks,
            Boolean isResourcePrincipalDisabled,
            ContainerResourceConfig resourceConfig,
            Integer containerRestartAttemptCount,
            SecurityContext securityContext) {
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
        this.workingDirectory = workingDirectory;
        this.environmentVariables = environmentVariables;
        this.volumeMounts = volumeMounts;
        this.healthChecks = healthChecks;
        this.isResourcePrincipalDisabled = isResourcePrincipalDisabled;
        this.resourceConfig = resourceConfig;
        this.containerRestartAttemptCount = containerRestartAttemptCount;
        this.securityContext = securityContext;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the compartment that contains the container.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the container.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}.
         *
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}.
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The availability domain where the container instance that hosts the container runs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain where the container instance that hosts the container runs.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The fault domain of the container instance that hosts the container runs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The fault domain of the container instance that hosts the container runs.
         * @param faultDomain the value to set
         * @return this builder
         **/
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /**
         * The current state of the container.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the container.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message that describes the current state of the container in more detail. Can be used to provide
         * actionable information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message that describes the current state of the container in more detail. Can be used to provide
         * actionable information.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The exit code of the container process when it stopped running.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exitCode")
        private Integer exitCode;

        /**
         * The exit code of the container process when it stopped running.
         * @param exitCode the value to set
         * @return this builder
         **/
        public Builder exitCode(Integer exitCode) {
            this.exitCode = exitCode;
            this.__explicitlySet__.add("exitCode");
            return this;
        }
        /**
         * The time when the container last deleted (terminated), in the format defined by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeTerminated")
        private java.util.Date timeTerminated;

        /**
         * The time when the container last deleted (terminated), in the format defined by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         * @param timeTerminated the value to set
         * @return this builder
         **/
        public Builder timeTerminated(java.util.Date timeTerminated) {
            this.timeTerminated = timeTerminated;
            this.__explicitlySet__.add("timeTerminated");
            return this;
        }
        /**
         * The time the container was created, in the format defined by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the container was created, in the format defined by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the container was updated, in the format defined by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the container was updated, in the format defined by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container instance that the container is running on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containerInstanceId")
        private String containerInstanceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container instance that the container is running on.
         * @param containerInstanceId the value to set
         * @return this builder
         **/
        public Builder containerInstanceId(String containerInstanceId) {
            this.containerInstanceId = containerInstanceId;
            this.__explicitlySet__.add("containerInstanceId");
            return this;
        }
        /**
         * The container image information. Currently only supports public Docker registry.
         * <p>
         * You can provide either the image name (containerImage), image name with version (containerImagev1), or complete Docker image URL
         * {@code docker.io/library/containerImage:latest}.
         * <p>
         * If you do not provide a registry, the registry defaults to public Docker hub {@code docker.io/library}.
         * The registry used for the container image must be reachable over the VNIC of the container instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
        private String imageUrl;

        /**
         * The container image information. Currently only supports public Docker registry.
         * <p>
         * You can provide either the image name (containerImage), image name with version (containerImagev1), or complete Docker image URL
         * {@code docker.io/library/containerImage:latest}.
         * <p>
         * If you do not provide a registry, the registry defaults to public Docker hub {@code docker.io/library}.
         * The registry used for the container image must be reachable over the VNIC of the container instance.
         *
         * @param imageUrl the value to set
         * @return this builder
         **/
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            this.__explicitlySet__.add("imageUrl");
            return this;
        }
        /**
         * This command overrides ENTRYPOINT process of the container.
         * If you do not specify this command, the existing ENTRYPOINT process defined in the image is the default.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private java.util.List<String> command;

        /**
         * This command overrides ENTRYPOINT process of the container.
         * If you do not specify this command, the existing ENTRYPOINT process defined in the image is the default.
         *
         * @param command the value to set
         * @return this builder
         **/
        public Builder command(java.util.List<String> command) {
            this.command = command;
            this.__explicitlySet__.add("command");
            return this;
        }
        /**
         * A list of string arguments for the ENTRYPOINT process of the container.
         * <p>
         * Many containers use an ENTRYPOINT process pointing to a shell
         * {@code /bin/bash}. For those containers, you can use the argument list to specify the main command in the container process.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<String> arguments;

        /**
         * A list of string arguments for the ENTRYPOINT process of the container.
         * <p>
         * Many containers use an ENTRYPOINT process pointing to a shell
         * {@code /bin/bash}. For those containers, you can use the argument list to specify the main command in the container process.
         *
         * @param arguments the value to set
         * @return this builder
         **/
        public Builder arguments(java.util.List<String> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }
        /**
         * The working directory within the container's filesystem for
         * the container process. If not specified, the default
         * working directory from the image is used.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
        private String workingDirectory;

        /**
         * The working directory within the container's filesystem for
         * the container process. If not specified, the default
         * working directory from the image is used.
         *
         * @param workingDirectory the value to set
         * @return this builder
         **/
        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = workingDirectory;
            this.__explicitlySet__.add("workingDirectory");
            return this;
        }
        /**
         * A map of additional environment variables to set in the environment of the
         * ENTRYPOINT process of the container. These variables are in addition to any variables already defined
         * in the container's image.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
        private java.util.Map<String, String> environmentVariables;

        /**
         * A map of additional environment variables to set in the environment of the
         * ENTRYPOINT process of the container. These variables are in addition to any variables already defined
         * in the container's image.
         *
         * @param environmentVariables the value to set
         * @return this builder
         **/
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            this.__explicitlySet__.add("environmentVariables");
            return this;
        }
        /**
         * List of the volume mounts.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeMounts")
        private java.util.List<VolumeMount> volumeMounts;

        /**
         * List of the volume mounts.
         *
         * @param volumeMounts the value to set
         * @return this builder
         **/
        public Builder volumeMounts(java.util.List<VolumeMount> volumeMounts) {
            this.volumeMounts = volumeMounts;
            this.__explicitlySet__.add("volumeMounts");
            return this;
        }
        /**
         * List of container health checks
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("healthChecks")
        private java.util.List<ContainerHealthCheck> healthChecks;

        /**
         * List of container health checks
         * @param healthChecks the value to set
         * @return this builder
         **/
        public Builder healthChecks(java.util.List<ContainerHealthCheck> healthChecks) {
            this.healthChecks = healthChecks;
            this.__explicitlySet__.add("healthChecks");
            return this;
        }
        /**
         * Determines if the container will have access to the container instance resource principal.
         * <p>
         * This method utilizes resource principal version 2.2. For more information on how to use the exposed resource principal elements, see
         * https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isResourcePrincipalDisabled")
        private Boolean isResourcePrincipalDisabled;

        /**
         * Determines if the container will have access to the container instance resource principal.
         * <p>
         * This method utilizes resource principal version 2.2. For more information on how to use the exposed resource principal elements, see
         * https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal.
         *
         * @param isResourcePrincipalDisabled the value to set
         * @return this builder
         **/
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
         * The number of container restart attempts. Depending on the restart policy, a restart might be attempted after a health check failure or a container exit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containerRestartAttemptCount")
        private Integer containerRestartAttemptCount;

        /**
         * The number of container restart attempts. Depending on the restart policy, a restart might be attempted after a health check failure or a container exit.
         * @param containerRestartAttemptCount the value to set
         * @return this builder
         **/
        public Builder containerRestartAttemptCount(Integer containerRestartAttemptCount) {
            this.containerRestartAttemptCount = containerRestartAttemptCount;
            this.__explicitlySet__.add("containerRestartAttemptCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
        private SecurityContext securityContext;

        public Builder securityContext(SecurityContext securityContext) {
            this.securityContext = securityContext;
            this.__explicitlySet__.add("securityContext");
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
                            this.workingDirectory,
                            this.environmentVariables,
                            this.volumeMounts,
                            this.healthChecks,
                            this.isResourcePrincipalDisabled,
                            this.resourceConfig,
                            this.containerRestartAttemptCount,
                            this.securityContext);
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
            if (model.wasPropertyExplicitlySet("securityContext")) {
                this.securityContext(model.getSecurityContext());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the compartment that contains the container.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the container.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}.
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}.
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * The availability domain where the container instance that hosts the container runs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain where the container instance that hosts the container runs.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The fault domain of the container instance that hosts the container runs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The fault domain of the container instance that hosts the container runs.
     * @return the value
     **/
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The current state of the container.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
     * The current state of the container.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the container.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message that describes the current state of the container in more detail. Can be used to provide
     * actionable information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message that describes the current state of the container in more detail. Can be used to provide
     * actionable information.
     *
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The exit code of the container process when it stopped running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exitCode")
    private final Integer exitCode;

    /**
     * The exit code of the container process when it stopped running.
     * @return the value
     **/
    public Integer getExitCode() {
        return exitCode;
    }

    /**
     * The time when the container last deleted (terminated), in the format defined by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTerminated")
    private final java.util.Date timeTerminated;

    /**
     * The time when the container last deleted (terminated), in the format defined by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeTerminated() {
        return timeTerminated;
    }

    /**
     * The time the container was created, in the format defined by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the container was created, in the format defined by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the container was updated, in the format defined by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the container was updated, in the format defined by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container instance that the container is running on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerInstanceId")
    private final String containerInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container instance that the container is running on.
     * @return the value
     **/
    public String getContainerInstanceId() {
        return containerInstanceId;
    }

    /**
     * The container image information. Currently only supports public Docker registry.
     * <p>
     * You can provide either the image name (containerImage), image name with version (containerImagev1), or complete Docker image URL
     * {@code docker.io/library/containerImage:latest}.
     * <p>
     * If you do not provide a registry, the registry defaults to public Docker hub {@code docker.io/library}.
     * The registry used for the container image must be reachable over the VNIC of the container instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
    private final String imageUrl;

    /**
     * The container image information. Currently only supports public Docker registry.
     * <p>
     * You can provide either the image name (containerImage), image name with version (containerImagev1), or complete Docker image URL
     * {@code docker.io/library/containerImage:latest}.
     * <p>
     * If you do not provide a registry, the registry defaults to public Docker hub {@code docker.io/library}.
     * The registry used for the container image must be reachable over the VNIC of the container instance.
     *
     * @return the value
     **/
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This command overrides ENTRYPOINT process of the container.
     * If you do not specify this command, the existing ENTRYPOINT process defined in the image is the default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    private final java.util.List<String> command;

    /**
     * This command overrides ENTRYPOINT process of the container.
     * If you do not specify this command, the existing ENTRYPOINT process defined in the image is the default.
     *
     * @return the value
     **/
    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * A list of string arguments for the ENTRYPOINT process of the container.
     * <p>
     * Many containers use an ENTRYPOINT process pointing to a shell
     * {@code /bin/bash}. For those containers, you can use the argument list to specify the main command in the container process.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    private final java.util.List<String> arguments;

    /**
     * A list of string arguments for the ENTRYPOINT process of the container.
     * <p>
     * Many containers use an ENTRYPOINT process pointing to a shell
     * {@code /bin/bash}. For those containers, you can use the argument list to specify the main command in the container process.
     *
     * @return the value
     **/
    public java.util.List<String> getArguments() {
        return arguments;
    }

    /**
     * The working directory within the container's filesystem for
     * the container process. If not specified, the default
     * working directory from the image is used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
    private final String workingDirectory;

    /**
     * The working directory within the container's filesystem for
     * the container process. If not specified, the default
     * working directory from the image is used.
     *
     * @return the value
     **/
    public String getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * A map of additional environment variables to set in the environment of the
     * ENTRYPOINT process of the container. These variables are in addition to any variables already defined
     * in the container's image.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.Map<String, String> environmentVariables;

    /**
     * A map of additional environment variables to set in the environment of the
     * ENTRYPOINT process of the container. These variables are in addition to any variables already defined
     * in the container's image.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * List of the volume mounts.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeMounts")
    private final java.util.List<VolumeMount> volumeMounts;

    /**
     * List of the volume mounts.
     *
     * @return the value
     **/
    public java.util.List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * List of container health checks
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("healthChecks")
    private final java.util.List<ContainerHealthCheck> healthChecks;

    /**
     * List of container health checks
     * @return the value
     **/
    public java.util.List<ContainerHealthCheck> getHealthChecks() {
        return healthChecks;
    }

    /**
     * Determines if the container will have access to the container instance resource principal.
     * <p>
     * This method utilizes resource principal version 2.2. For more information on how to use the exposed resource principal elements, see
     * https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isResourcePrincipalDisabled")
    private final Boolean isResourcePrincipalDisabled;

    /**
     * Determines if the container will have access to the container instance resource principal.
     * <p>
     * This method utilizes resource principal version 2.2. For more information on how to use the exposed resource principal elements, see
     * https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal.
     *
     * @return the value
     **/
    public Boolean getIsResourcePrincipalDisabled() {
        return isResourcePrincipalDisabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceConfig")
    private final ContainerResourceConfig resourceConfig;

    public ContainerResourceConfig getResourceConfig() {
        return resourceConfig;
    }

    /**
     * The number of container restart attempts. Depending on the restart policy, a restart might be attempted after a health check failure or a container exit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerRestartAttemptCount")
    private final Integer containerRestartAttemptCount;

    /**
     * The number of container restart attempts. Depending on the restart policy, a restart might be attempted after a health check failure or a container exit.
     * @return the value
     **/
    public Integer getContainerRestartAttemptCount() {
        return containerRestartAttemptCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    private final SecurityContext securityContext;

    public SecurityContext getSecurityContext() {
        return securityContext;
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
        sb.append(", workingDirectory=").append(String.valueOf(this.workingDirectory));
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(", volumeMounts=").append(String.valueOf(this.volumeMounts));
        sb.append(", healthChecks=").append(String.valueOf(this.healthChecks));
        sb.append(", isResourcePrincipalDisabled=")
                .append(String.valueOf(this.isResourcePrincipalDisabled));
        sb.append(", resourceConfig=").append(String.valueOf(this.resourceConfig));
        sb.append(", containerRestartAttemptCount=")
                .append(String.valueOf(this.containerRestartAttemptCount));
        sb.append(", securityContext=").append(String.valueOf(this.securityContext));
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
                && java.util.Objects.equals(this.workingDirectory, other.workingDirectory)
                && java.util.Objects.equals(this.environmentVariables, other.environmentVariables)
                && java.util.Objects.equals(this.volumeMounts, other.volumeMounts)
                && java.util.Objects.equals(this.healthChecks, other.healthChecks)
                && java.util.Objects.equals(
                        this.isResourcePrincipalDisabled, other.isResourcePrincipalDisabled)
                && java.util.Objects.equals(this.resourceConfig, other.resourceConfig)
                && java.util.Objects.equals(
                        this.containerRestartAttemptCount, other.containerRestartAttemptCount)
                && java.util.Objects.equals(this.securityContext, other.securityContext)
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
        result =
                (result * PRIME)
                        + (this.securityContext == null ? 43 : this.securityContext.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
