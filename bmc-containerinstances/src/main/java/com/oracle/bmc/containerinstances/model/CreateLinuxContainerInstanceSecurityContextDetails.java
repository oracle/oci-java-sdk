/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * Security context for all containers in a Linux container instance. <br>
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
        builder = CreateLinuxContainerInstanceSecurityContextDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "securityContextType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateLinuxContainerInstanceSecurityContextDetails
        extends CreateContainerInstanceSecurityContextDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A special supplemental group that applies to all containers in the container instance.
         * Some volume types allow the container instance to change ownership of the volume. The
         * owning GID will be the fsGroup, the setgid bit will be set (new files will be owned by
         * the fsGroup), and the permission bits are OR'd with rw-rw----. If unset, the container
         * instance will not modify the ownership and permissions of volumes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fsGroup")
        private Integer fsGroup;

        /**
         * A special supplemental group that applies to all containers in the container instance.
         * Some volume types allow the container instance to change ownership of the volume. The
         * owning GID will be the fsGroup, the setgid bit will be set (new files will be owned by
         * the fsGroup), and the permission bits are OR'd with rw-rw----. If unset, the container
         * instance will not modify the ownership and permissions of volumes.
         *
         * @param fsGroup the value to set
         * @return this builder
         */
        public Builder fsGroup(Integer fsGroup) {
            this.fsGroup = fsGroup;
            this.__explicitlySet__.add("fsGroup");
            return this;
        }
        /**
         * Defines behavior of changing ownership and permission of the volume before being exposed
         * inside the containers. This only applies to volumes which support fsGroup ownership and
         * permissions, and will have no effect on ephemeral volumes. ON_ROOT_MISMATCH only changes
         * permissions and ownership if the permission and ownership of the root directory does not
         * match the expected permissions and ownership of the volume. This can improve container
         * instance start times. ALWAYS changes permission and ownership of the volume when it is
         * mounted. If unset, ALWAYS is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fsGroupChangePolicy")
        private ContainerFsGroupChangePolicyType fsGroupChangePolicy;

        /**
         * Defines behavior of changing ownership and permission of the volume before being exposed
         * inside the containers. This only applies to volumes which support fsGroup ownership and
         * permissions, and will have no effect on ephemeral volumes. ON_ROOT_MISMATCH only changes
         * permissions and ownership if the permission and ownership of the root directory does not
         * match the expected permissions and ownership of the volume. This can improve container
         * instance start times. ALWAYS changes permission and ownership of the volume when it is
         * mounted. If unset, ALWAYS is used.
         *
         * @param fsGroupChangePolicy the value to set
         * @return this builder
         */
        public Builder fsGroupChangePolicy(ContainerFsGroupChangePolicyType fsGroupChangePolicy) {
            this.fsGroupChangePolicy = fsGroupChangePolicy;
            this.__explicitlySet__.add("fsGroupChangePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateLinuxContainerInstanceSecurityContextDetails build() {
            CreateLinuxContainerInstanceSecurityContextDetails model =
                    new CreateLinuxContainerInstanceSecurityContextDetails(
                            this.fsGroup, this.fsGroupChangePolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLinuxContainerInstanceSecurityContextDetails model) {
            if (model.wasPropertyExplicitlySet("fsGroup")) {
                this.fsGroup(model.getFsGroup());
            }
            if (model.wasPropertyExplicitlySet("fsGroupChangePolicy")) {
                this.fsGroupChangePolicy(model.getFsGroupChangePolicy());
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
    public CreateLinuxContainerInstanceSecurityContextDetails(
            Integer fsGroup, ContainerFsGroupChangePolicyType fsGroupChangePolicy) {
        super();
        this.fsGroup = fsGroup;
        this.fsGroupChangePolicy = fsGroupChangePolicy;
    }

    /**
     * A special supplemental group that applies to all containers in the container instance. Some
     * volume types allow the container instance to change ownership of the volume. The owning GID
     * will be the fsGroup, the setgid bit will be set (new files will be owned by the fsGroup), and
     * the permission bits are OR'd with rw-rw----. If unset, the container instance will not modify
     * the ownership and permissions of volumes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsGroup")
    private final Integer fsGroup;

    /**
     * A special supplemental group that applies to all containers in the container instance. Some
     * volume types allow the container instance to change ownership of the volume. The owning GID
     * will be the fsGroup, the setgid bit will be set (new files will be owned by the fsGroup), and
     * the permission bits are OR'd with rw-rw----. If unset, the container instance will not modify
     * the ownership and permissions of volumes.
     *
     * @return the value
     */
    public Integer getFsGroup() {
        return fsGroup;
    }

    /**
     * Defines behavior of changing ownership and permission of the volume before being exposed
     * inside the containers. This only applies to volumes which support fsGroup ownership and
     * permissions, and will have no effect on ephemeral volumes. ON_ROOT_MISMATCH only changes
     * permissions and ownership if the permission and ownership of the root directory does not
     * match the expected permissions and ownership of the volume. This can improve container
     * instance start times. ALWAYS changes permission and ownership of the volume when it is
     * mounted. If unset, ALWAYS is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsGroupChangePolicy")
    private final ContainerFsGroupChangePolicyType fsGroupChangePolicy;

    /**
     * Defines behavior of changing ownership and permission of the volume before being exposed
     * inside the containers. This only applies to volumes which support fsGroup ownership and
     * permissions, and will have no effect on ephemeral volumes. ON_ROOT_MISMATCH only changes
     * permissions and ownership if the permission and ownership of the root directory does not
     * match the expected permissions and ownership of the volume. This can improve container
     * instance start times. ALWAYS changes permission and ownership of the volume when it is
     * mounted. If unset, ALWAYS is used.
     *
     * @return the value
     */
    public ContainerFsGroupChangePolicyType getFsGroupChangePolicy() {
        return fsGroupChangePolicy;
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
        sb.append("CreateLinuxContainerInstanceSecurityContextDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", fsGroup=").append(String.valueOf(this.fsGroup));
        sb.append(", fsGroupChangePolicy=").append(String.valueOf(this.fsGroupChangePolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLinuxContainerInstanceSecurityContextDetails)) {
            return false;
        }

        CreateLinuxContainerInstanceSecurityContextDetails other =
                (CreateLinuxContainerInstanceSecurityContextDetails) o;
        return java.util.Objects.equals(this.fsGroup, other.fsGroup)
                && java.util.Objects.equals(this.fsGroupChangePolicy, other.fsGroupChangePolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fsGroup == null ? 43 : this.fsGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.fsGroupChangePolicy == null
                                ? 43
                                : this.fsGroupChangePolicy.hashCode());
        return result;
    }
}
