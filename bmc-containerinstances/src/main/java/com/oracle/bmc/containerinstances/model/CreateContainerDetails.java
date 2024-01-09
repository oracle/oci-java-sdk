/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * Information to create a new container within a container instance.
 *
 * <p>The container created by this call contains both the tags specified in this object and any
 * tags specified in the parent container instance.
 *
 * <p>The container is created in the same compartment, availability domain, and fault domain as its
 * container instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateContainerDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateContainerDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "imageUrl",
        "command",
        "arguments",
        "workingDirectory",
        "environmentVariables",
        "volumeMounts",
        "isResourcePrincipalDisabled",
        "resourceConfig",
        "healthChecks",
        "securityContext",
        "freeformTags",
        "definedTags"
    })
    public CreateContainerDetails(
            String displayName,
            String imageUrl,
            java.util.List<String> command,
            java.util.List<String> arguments,
            String workingDirectory,
            java.util.Map<String, String> environmentVariables,
            java.util.List<CreateVolumeMountDetails> volumeMounts,
            Boolean isResourcePrincipalDisabled,
            CreateContainerResourceConfigDetails resourceConfig,
            java.util.List<CreateContainerHealthCheckDetails> healthChecks,
            CreateSecurityContextDetails securityContext,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.imageUrl = imageUrl;
        this.command = command;
        this.arguments = arguments;
        this.workingDirectory = workingDirectory;
        this.environmentVariables = environmentVariables;
        this.volumeMounts = volumeMounts;
        this.isResourcePrincipalDisabled = isResourcePrincipalDisabled;
        this.resourceConfig = resourceConfig;
        this.healthChecks = healthChecks;
        this.securityContext = securityContext;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information. If you don't provide a name, a name is generated automatically.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information. If you don't provide a name, a name is generated automatically.
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
         * A URL identifying the image that the container runs in, such as
         * docker.io/library/busybox:latest. If you do not provide a tag, the tag will default to
         * latest.
         *
         * <p>If no registry is provided, will default the registry to public docker hub {@code
         * docker.io/library}.
         *
         * <p>The registry used for container image must be reachable over the Container Instance's
         * VNIC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
        private String imageUrl;

        /**
         * A URL identifying the image that the container runs in, such as
         * docker.io/library/busybox:latest. If you do not provide a tag, the tag will default to
         * latest.
         *
         * <p>If no registry is provided, will default the registry to public docker hub {@code
         * docker.io/library}.
         *
         * <p>The registry used for container image must be reachable over the Container Instance's
         * VNIC.
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
         * An optional command that overrides the ENTRYPOINT process. If you do not provide a value,
         * the existing ENTRYPOINT process defined in the image is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private java.util.List<String> command;

        /**
         * An optional command that overrides the ENTRYPOINT process. If you do not provide a value,
         * the existing ENTRYPOINT process defined in the image is used.
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
         * A list of string arguments for a container's ENTRYPOINT process.
         *
         * <p>Many containers use an ENTRYPOINT process pointing to a shell (/bin/bash). For those
         * containers, this argument list specifies the main command in the container process.
         *
         * <p>The total size of all arguments combined must be 64 KB or smaller.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<String> arguments;

        /**
         * A list of string arguments for a container's ENTRYPOINT process.
         *
         * <p>Many containers use an ENTRYPOINT process pointing to a shell (/bin/bash). For those
         * containers, this argument list specifies the main command in the container process.
         *
         * <p>The total size of all arguments combined must be 64 KB or smaller.
         *
         * @param arguments the value to set
         * @return this builder
         */
        public Builder arguments(java.util.List<String> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }
        /**
         * The working directory within the container's filesystem for the container process. If not
         * specified, the default working directory from the image is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
        private String workingDirectory;

        /**
         * The working directory within the container's filesystem for the container process. If not
         * specified, the default working directory from the image is used.
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
         * ENTRYPOINT process. These variables are in addition to any variables already defined in
         * the container's image.
         *
         * <p>The total size of all environment variables combined, name and values, must be 64 KB
         * or smaller.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
        private java.util.Map<String, String> environmentVariables;

        /**
         * A map of additional environment variables to set in the environment of the container's
         * ENTRYPOINT process. These variables are in addition to any variables already defined in
         * the container's image.
         *
         * <p>The total size of all environment variables combined, name and values, must be 64 KB
         * or smaller.
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
        private java.util.List<CreateVolumeMountDetails> volumeMounts;

        /**
         * List of the volume mounts.
         *
         * @param volumeMounts the value to set
         * @return this builder
         */
        public Builder volumeMounts(java.util.List<CreateVolumeMountDetails> volumeMounts) {
            this.volumeMounts = volumeMounts;
            this.__explicitlySet__.add("volumeMounts");
            return this;
        }
        /**
         * Determines if the container will have access to the container instance resource
         * principal.
         *
         * <p>This method utilizes resource principal version 2.2. For information on how to use the
         * exposed resource principal elements, see
         * https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isResourcePrincipalDisabled")
        private Boolean isResourcePrincipalDisabled;

        /**
         * Determines if the container will have access to the container instance resource
         * principal.
         *
         * <p>This method utilizes resource principal version 2.2. For information on how to use the
         * exposed resource principal elements, see
         * https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal.
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
        private CreateContainerResourceConfigDetails resourceConfig;

        public Builder resourceConfig(CreateContainerResourceConfigDetails resourceConfig) {
            this.resourceConfig = resourceConfig;
            this.__explicitlySet__.add("resourceConfig");
            return this;
        }
        /**
         * list of container health checks to check container status and take appropriate action if
         * container status is failed. There are three types of health checks that we currently
         * support HTTP, TCP, and Command.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("healthChecks")
        private java.util.List<CreateContainerHealthCheckDetails> healthChecks;

        /**
         * list of container health checks to check container status and take appropriate action if
         * container status is failed. There are three types of health checks that we currently
         * support HTTP, TCP, and Command.
         *
         * @param healthChecks the value to set
         * @return this builder
         */
        public Builder healthChecks(
                java.util.List<CreateContainerHealthCheckDetails> healthChecks) {
            this.healthChecks = healthChecks;
            this.__explicitlySet__.add("healthChecks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
        private CreateSecurityContextDetails securityContext;

        public Builder securityContext(CreateSecurityContextDetails securityContext) {
            this.securityContext = securityContext;
            this.__explicitlySet__.add("securityContext");
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}.
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

        public CreateContainerDetails build() {
            CreateContainerDetails model =
                    new CreateContainerDetails(
                            this.displayName,
                            this.imageUrl,
                            this.command,
                            this.arguments,
                            this.workingDirectory,
                            this.environmentVariables,
                            this.volumeMounts,
                            this.isResourcePrincipalDisabled,
                            this.resourceConfig,
                            this.healthChecks,
                            this.securityContext,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateContainerDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
            if (model.wasPropertyExplicitlySet("isResourcePrincipalDisabled")) {
                this.isResourcePrincipalDisabled(model.getIsResourcePrincipalDisabled());
            }
            if (model.wasPropertyExplicitlySet("resourceConfig")) {
                this.resourceConfig(model.getResourceConfig());
            }
            if (model.wasPropertyExplicitlySet("healthChecks")) {
                this.healthChecks(model.getHealthChecks());
            }
            if (model.wasPropertyExplicitlySet("securityContext")) {
                this.securityContext(model.getSecurityContext());
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
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information. If you don't provide a name, a name is generated automatically.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information. If you don't provide a name, a name is generated automatically.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A URL identifying the image that the container runs in, such as
     * docker.io/library/busybox:latest. If you do not provide a tag, the tag will default to
     * latest.
     *
     * <p>If no registry is provided, will default the registry to public docker hub {@code
     * docker.io/library}.
     *
     * <p>The registry used for container image must be reachable over the Container Instance's
     * VNIC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
    private final String imageUrl;

    /**
     * A URL identifying the image that the container runs in, such as
     * docker.io/library/busybox:latest. If you do not provide a tag, the tag will default to
     * latest.
     *
     * <p>If no registry is provided, will default the registry to public docker hub {@code
     * docker.io/library}.
     *
     * <p>The registry used for container image must be reachable over the Container Instance's
     * VNIC.
     *
     * @return the value
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * An optional command that overrides the ENTRYPOINT process. If you do not provide a value, the
     * existing ENTRYPOINT process defined in the image is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    private final java.util.List<String> command;

    /**
     * An optional command that overrides the ENTRYPOINT process. If you do not provide a value, the
     * existing ENTRYPOINT process defined in the image is used.
     *
     * @return the value
     */
    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * A list of string arguments for a container's ENTRYPOINT process.
     *
     * <p>Many containers use an ENTRYPOINT process pointing to a shell (/bin/bash). For those
     * containers, this argument list specifies the main command in the container process.
     *
     * <p>The total size of all arguments combined must be 64 KB or smaller.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    private final java.util.List<String> arguments;

    /**
     * A list of string arguments for a container's ENTRYPOINT process.
     *
     * <p>Many containers use an ENTRYPOINT process pointing to a shell (/bin/bash). For those
     * containers, this argument list specifies the main command in the container process.
     *
     * <p>The total size of all arguments combined must be 64 KB or smaller.
     *
     * @return the value
     */
    public java.util.List<String> getArguments() {
        return arguments;
    }

    /**
     * The working directory within the container's filesystem for the container process. If not
     * specified, the default working directory from the image is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
    private final String workingDirectory;

    /**
     * The working directory within the container's filesystem for the container process. If not
     * specified, the default working directory from the image is used.
     *
     * @return the value
     */
    public String getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * A map of additional environment variables to set in the environment of the container's
     * ENTRYPOINT process. These variables are in addition to any variables already defined in the
     * container's image.
     *
     * <p>The total size of all environment variables combined, name and values, must be 64 KB or
     * smaller.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.Map<String, String> environmentVariables;

    /**
     * A map of additional environment variables to set in the environment of the container's
     * ENTRYPOINT process. These variables are in addition to any variables already defined in the
     * container's image.
     *
     * <p>The total size of all environment variables combined, name and values, must be 64 KB or
     * smaller.
     *
     * @return the value
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /** List of the volume mounts. */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeMounts")
    private final java.util.List<CreateVolumeMountDetails> volumeMounts;

    /**
     * List of the volume mounts.
     *
     * @return the value
     */
    public java.util.List<CreateVolumeMountDetails> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * Determines if the container will have access to the container instance resource principal.
     *
     * <p>This method utilizes resource principal version 2.2. For information on how to use the
     * exposed resource principal elements, see
     * https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isResourcePrincipalDisabled")
    private final Boolean isResourcePrincipalDisabled;

    /**
     * Determines if the container will have access to the container instance resource principal.
     *
     * <p>This method utilizes resource principal version 2.2. For information on how to use the
     * exposed resource principal elements, see
     * https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_authentication_methods.htm#sdk_authentication_methods_resource_principal.
     *
     * @return the value
     */
    public Boolean getIsResourcePrincipalDisabled() {
        return isResourcePrincipalDisabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceConfig")
    private final CreateContainerResourceConfigDetails resourceConfig;

    public CreateContainerResourceConfigDetails getResourceConfig() {
        return resourceConfig;
    }

    /**
     * list of container health checks to check container status and take appropriate action if
     * container status is failed. There are three types of health checks that we currently support
     * HTTP, TCP, and Command.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("healthChecks")
    private final java.util.List<CreateContainerHealthCheckDetails> healthChecks;

    /**
     * list of container health checks to check container status and take appropriate action if
     * container status is failed. There are three types of health checks that we currently support
     * HTTP, TCP, and Command.
     *
     * @return the value
     */
    public java.util.List<CreateContainerHealthCheckDetails> getHealthChecks() {
        return healthChecks;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    private final CreateSecurityContextDetails securityContext;

    public CreateSecurityContextDetails getSecurityContext() {
        return securityContext;
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
     * {@code {"foo-namespace": {"bar-key": "value"}}}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}.
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
        sb.append("CreateContainerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", imageUrl=").append(String.valueOf(this.imageUrl));
        sb.append(", command=").append(String.valueOf(this.command));
        sb.append(", arguments=").append(String.valueOf(this.arguments));
        sb.append(", workingDirectory=").append(String.valueOf(this.workingDirectory));
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(", volumeMounts=").append(String.valueOf(this.volumeMounts));
        sb.append(", isResourcePrincipalDisabled=")
                .append(String.valueOf(this.isResourcePrincipalDisabled));
        sb.append(", resourceConfig=").append(String.valueOf(this.resourceConfig));
        sb.append(", healthChecks=").append(String.valueOf(this.healthChecks));
        sb.append(", securityContext=").append(String.valueOf(this.securityContext));
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
        if (!(o instanceof CreateContainerDetails)) {
            return false;
        }

        CreateContainerDetails other = (CreateContainerDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.imageUrl, other.imageUrl)
                && java.util.Objects.equals(this.command, other.command)
                && java.util.Objects.equals(this.arguments, other.arguments)
                && java.util.Objects.equals(this.workingDirectory, other.workingDirectory)
                && java.util.Objects.equals(this.environmentVariables, other.environmentVariables)
                && java.util.Objects.equals(this.volumeMounts, other.volumeMounts)
                && java.util.Objects.equals(
                        this.isResourcePrincipalDisabled, other.isResourcePrincipalDisabled)
                && java.util.Objects.equals(this.resourceConfig, other.resourceConfig)
                && java.util.Objects.equals(this.healthChecks, other.healthChecks)
                && java.util.Objects.equals(this.securityContext, other.securityContext)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
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
        result =
                (result * PRIME)
                        + (this.isResourcePrincipalDisabled == null
                                ? 43
                                : this.isResourcePrincipalDisabled.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceConfig == null ? 43 : this.resourceConfig.hashCode());
        result = (result * PRIME) + (this.healthChecks == null ? 43 : this.healthChecks.hashCode());
        result =
                (result * PRIME)
                        + (this.securityContext == null ? 43 : this.securityContext.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
