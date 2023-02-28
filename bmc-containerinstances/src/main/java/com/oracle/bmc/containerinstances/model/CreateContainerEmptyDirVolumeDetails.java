/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * The empty directory for container instance <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateContainerEmptyDirVolumeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "volumeType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateContainerEmptyDirVolumeDetails extends CreateContainerVolumeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Volume type that we are using for empty dir where it could be either File Storage or
         * Memory
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backingStore")
        private ContainerEmptyDirVolume.BackingStore backingStore;

        /**
         * Volume type that we are using for empty dir where it could be either File Storage or
         * Memory
         *
         * @param backingStore the value to set
         * @return this builder
         */
        public Builder backingStore(ContainerEmptyDirVolume.BackingStore backingStore) {
            this.backingStore = backingStore;
            this.__explicitlySet__.add("backingStore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateContainerEmptyDirVolumeDetails build() {
            CreateContainerEmptyDirVolumeDetails model =
                    new CreateContainerEmptyDirVolumeDetails(this.name, this.backingStore);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateContainerEmptyDirVolumeDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("backingStore")) {
                this.backingStore(model.getBackingStore());
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
    public CreateContainerEmptyDirVolumeDetails(
            String name, ContainerEmptyDirVolume.BackingStore backingStore) {
        super(name);
        this.backingStore = backingStore;
    }

    /**
     * Volume type that we are using for empty dir where it could be either File Storage or Memory
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backingStore")
    private final ContainerEmptyDirVolume.BackingStore backingStore;

    /**
     * Volume type that we are using for empty dir where it could be either File Storage or Memory
     *
     * @return the value
     */
    public ContainerEmptyDirVolume.BackingStore getBackingStore() {
        return backingStore;
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
        sb.append("CreateContainerEmptyDirVolumeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", backingStore=").append(String.valueOf(this.backingStore));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateContainerEmptyDirVolumeDetails)) {
            return false;
        }

        CreateContainerEmptyDirVolumeDetails other = (CreateContainerEmptyDirVolumeDetails) o;
        return java.util.Objects.equals(this.backingStore, other.backingStore)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.backingStore == null ? 43 : this.backingStore.hashCode());
        return result;
    }
}
