/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * Security context for Linux container. <br>
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
        builder = CreateLinuxSecurityContextDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "securityContextType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateLinuxSecurityContextDetails extends CreateSecurityContextDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The user ID (UID) to run the entrypoint process of the container. Defaults to user
         * specified UID in container image metadata if not provided. This must be provided if
         * runAsGroup is provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
        private Integer runAsUser;

        /**
         * The user ID (UID) to run the entrypoint process of the container. Defaults to user
         * specified UID in container image metadata if not provided. This must be provided if
         * runAsGroup is provided.
         *
         * @param runAsUser the value to set
         * @return this builder
         */
        public Builder runAsUser(Integer runAsUser) {
            this.runAsUser = runAsUser;
            this.__explicitlySet__.add("runAsUser");
            return this;
        }
        /**
         * The group ID (GID) to run the entrypoint process of the container. Uses runtime default
         * if not provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("runAsGroup")
        private Integer runAsGroup;

        /**
         * The group ID (GID) to run the entrypoint process of the container. Uses runtime default
         * if not provided.
         *
         * @param runAsGroup the value to set
         * @return this builder
         */
        public Builder runAsGroup(Integer runAsGroup) {
            this.runAsGroup = runAsGroup;
            this.__explicitlySet__.add("runAsGroup");
            return this;
        }
        /**
         * Indicates if the container must run as a non-root user. If true, the service validates
         * the container image at runtime to ensure that it is not going to run with UID 0 (root)
         * and fails the container instance creation if the validation fails.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isNonRootUserCheckEnabled")
        private Boolean isNonRootUserCheckEnabled;

        /**
         * Indicates if the container must run as a non-root user. If true, the service validates
         * the container image at runtime to ensure that it is not going to run with UID 0 (root)
         * and fails the container instance creation if the validation fails.
         *
         * @param isNonRootUserCheckEnabled the value to set
         * @return this builder
         */
        public Builder isNonRootUserCheckEnabled(Boolean isNonRootUserCheckEnabled) {
            this.isNonRootUserCheckEnabled = isNonRootUserCheckEnabled;
            this.__explicitlySet__.add("isNonRootUserCheckEnabled");
            return this;
        }
        /**
         * Determines if the container will have a read-only root file system. Default value is
         * false.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRootFileSystemReadonly")
        private Boolean isRootFileSystemReadonly;

        /**
         * Determines if the container will have a read-only root file system. Default value is
         * false.
         *
         * @param isRootFileSystemReadonly the value to set
         * @return this builder
         */
        public Builder isRootFileSystemReadonly(Boolean isRootFileSystemReadonly) {
            this.isRootFileSystemReadonly = isRootFileSystemReadonly;
            this.__explicitlySet__.add("isRootFileSystemReadonly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
        private ContainerCapabilities capabilities;

        public Builder capabilities(ContainerCapabilities capabilities) {
            this.capabilities = capabilities;
            this.__explicitlySet__.add("capabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateLinuxSecurityContextDetails build() {
            CreateLinuxSecurityContextDetails model =
                    new CreateLinuxSecurityContextDetails(
                            this.runAsUser,
                            this.runAsGroup,
                            this.isNonRootUserCheckEnabled,
                            this.isRootFileSystemReadonly,
                            this.capabilities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLinuxSecurityContextDetails model) {
            if (model.wasPropertyExplicitlySet("runAsUser")) {
                this.runAsUser(model.getRunAsUser());
            }
            if (model.wasPropertyExplicitlySet("runAsGroup")) {
                this.runAsGroup(model.getRunAsGroup());
            }
            if (model.wasPropertyExplicitlySet("isNonRootUserCheckEnabled")) {
                this.isNonRootUserCheckEnabled(model.getIsNonRootUserCheckEnabled());
            }
            if (model.wasPropertyExplicitlySet("isRootFileSystemReadonly")) {
                this.isRootFileSystemReadonly(model.getIsRootFileSystemReadonly());
            }
            if (model.wasPropertyExplicitlySet("capabilities")) {
                this.capabilities(model.getCapabilities());
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

    @Deprecated
    public CreateLinuxSecurityContextDetails(
            Integer runAsUser,
            Integer runAsGroup,
            Boolean isNonRootUserCheckEnabled,
            Boolean isRootFileSystemReadonly,
            ContainerCapabilities capabilities) {
        super();
        this.runAsUser = runAsUser;
        this.runAsGroup = runAsGroup;
        this.isNonRootUserCheckEnabled = isNonRootUserCheckEnabled;
        this.isRootFileSystemReadonly = isRootFileSystemReadonly;
        this.capabilities = capabilities;
    }

    /**
     * The user ID (UID) to run the entrypoint process of the container. Defaults to user specified
     * UID in container image metadata if not provided. This must be provided if runAsGroup is
     * provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
    private final Integer runAsUser;

    /**
     * The user ID (UID) to run the entrypoint process of the container. Defaults to user specified
     * UID in container image metadata if not provided. This must be provided if runAsGroup is
     * provided.
     *
     * @return the value
     */
    public Integer getRunAsUser() {
        return runAsUser;
    }

    /**
     * The group ID (GID) to run the entrypoint process of the container. Uses runtime default if
     * not provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runAsGroup")
    private final Integer runAsGroup;

    /**
     * The group ID (GID) to run the entrypoint process of the container. Uses runtime default if
     * not provided.
     *
     * @return the value
     */
    public Integer getRunAsGroup() {
        return runAsGroup;
    }

    /**
     * Indicates if the container must run as a non-root user. If true, the service validates the
     * container image at runtime to ensure that it is not going to run with UID 0 (root) and fails
     * the container instance creation if the validation fails.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isNonRootUserCheckEnabled")
    private final Boolean isNonRootUserCheckEnabled;

    /**
     * Indicates if the container must run as a non-root user. If true, the service validates the
     * container image at runtime to ensure that it is not going to run with UID 0 (root) and fails
     * the container instance creation if the validation fails.
     *
     * @return the value
     */
    public Boolean getIsNonRootUserCheckEnabled() {
        return isNonRootUserCheckEnabled;
    }

    /**
     * Determines if the container will have a read-only root file system. Default value is false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRootFileSystemReadonly")
    private final Boolean isRootFileSystemReadonly;

    /**
     * Determines if the container will have a read-only root file system. Default value is false.
     *
     * @return the value
     */
    public Boolean getIsRootFileSystemReadonly() {
        return isRootFileSystemReadonly;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    private final ContainerCapabilities capabilities;

    public ContainerCapabilities getCapabilities() {
        return capabilities;
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
        sb.append("CreateLinuxSecurityContextDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", runAsUser=").append(String.valueOf(this.runAsUser));
        sb.append(", runAsGroup=").append(String.valueOf(this.runAsGroup));
        sb.append(", isNonRootUserCheckEnabled=")
                .append(String.valueOf(this.isNonRootUserCheckEnabled));
        sb.append(", isRootFileSystemReadonly=")
                .append(String.valueOf(this.isRootFileSystemReadonly));
        sb.append(", capabilities=").append(String.valueOf(this.capabilities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLinuxSecurityContextDetails)) {
            return false;
        }

        CreateLinuxSecurityContextDetails other = (CreateLinuxSecurityContextDetails) o;
        return java.util.Objects.equals(this.runAsUser, other.runAsUser)
                && java.util.Objects.equals(this.runAsGroup, other.runAsGroup)
                && java.util.Objects.equals(
                        this.isNonRootUserCheckEnabled, other.isNonRootUserCheckEnabled)
                && java.util.Objects.equals(
                        this.isRootFileSystemReadonly, other.isRootFileSystemReadonly)
                && java.util.Objects.equals(this.capabilities, other.capabilities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.runAsUser == null ? 43 : this.runAsUser.hashCode());
        result = (result * PRIME) + (this.runAsGroup == null ? 43 : this.runAsGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.isNonRootUserCheckEnabled == null
                                ? 43
                                : this.isNonRootUserCheckEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isRootFileSystemReadonly == null
                                ? 43
                                : this.isRootFileSystemReadonly.hashCode());
        result = (result * PRIME) + (this.capabilities == null ? 43 : this.capabilities.hashCode());
        return result;
    }
}
