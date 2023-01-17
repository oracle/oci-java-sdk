/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * Container configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ContainerConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ContainerConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isRepositoryCreatedOnFirstPush", "namespace"})
    public ContainerConfiguration(Boolean isRepositoryCreatedOnFirstPush, String namespace) {
        super();
        this.isRepositoryCreatedOnFirstPush = isRepositoryCreatedOnFirstPush;
        this.namespace = namespace;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether to create a new container repository when a container is pushed to a new
         * repository path. Repositories created in this way belong to the root compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRepositoryCreatedOnFirstPush")
        private Boolean isRepositoryCreatedOnFirstPush;

        /**
         * Whether to create a new container repository when a container is pushed to a new
         * repository path. Repositories created in this way belong to the root compartment.
         *
         * @param isRepositoryCreatedOnFirstPush the value to set
         * @return this builder
         */
        public Builder isRepositoryCreatedOnFirstPush(Boolean isRepositoryCreatedOnFirstPush) {
            this.isRepositoryCreatedOnFirstPush = isRepositoryCreatedOnFirstPush;
            this.__explicitlySet__.add("isRepositoryCreatedOnFirstPush");
            return this;
        }
        /** The tenancy namespace used in the container repository path. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The tenancy namespace used in the container repository path.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerConfiguration build() {
            ContainerConfiguration model =
                    new ContainerConfiguration(this.isRepositoryCreatedOnFirstPush, this.namespace);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerConfiguration model) {
            if (model.wasPropertyExplicitlySet("isRepositoryCreatedOnFirstPush")) {
                this.isRepositoryCreatedOnFirstPush(model.getIsRepositoryCreatedOnFirstPush());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
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
     * Whether to create a new container repository when a container is pushed to a new repository
     * path. Repositories created in this way belong to the root compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRepositoryCreatedOnFirstPush")
    private final Boolean isRepositoryCreatedOnFirstPush;

    /**
     * Whether to create a new container repository when a container is pushed to a new repository
     * path. Repositories created in this way belong to the root compartment.
     *
     * @return the value
     */
    public Boolean getIsRepositoryCreatedOnFirstPush() {
        return isRepositoryCreatedOnFirstPush;
    }

    /** The tenancy namespace used in the container repository path. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The tenancy namespace used in the container repository path.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
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
        sb.append("ContainerConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("isRepositoryCreatedOnFirstPush=")
                .append(String.valueOf(this.isRepositoryCreatedOnFirstPush));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerConfiguration)) {
            return false;
        }

        ContainerConfiguration other = (ContainerConfiguration) o;
        return java.util.Objects.equals(
                        this.isRepositoryCreatedOnFirstPush, other.isRepositoryCreatedOnFirstPush)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isRepositoryCreatedOnFirstPush == null
                                ? 43
                                : this.isRepositoryCreatedOnFirstPush.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
