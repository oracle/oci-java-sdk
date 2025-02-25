/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * A container on a container instance.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ContainerInstanceContainer.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ContainerInstanceContainer
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"containerId", "displayName"})
    public ContainerInstanceContainer(String containerId, String displayName) {
        super();
        this.containerId = containerId;
        this.displayName = displayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the container.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containerId")
        private String containerId;

        /**
         * The OCID of the container.
         * @param containerId the value to set
         * @return this builder
         **/
        public Builder containerId(String containerId) {
            this.containerId = containerId;
            this.__explicitlySet__.add("containerId");
            return this;
        }
        /**
         * Display name for the Container.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for the Container.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerInstanceContainer build() {
            ContainerInstanceContainer model =
                    new ContainerInstanceContainer(this.containerId, this.displayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerInstanceContainer model) {
            if (model.wasPropertyExplicitlySet("containerId")) {
                this.containerId(model.getContainerId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
     * The OCID of the container.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerId")
    private final String containerId;

    /**
     * The OCID of the container.
     * @return the value
     **/
    public String getContainerId() {
        return containerId;
    }

    /**
     * Display name for the Container.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for the Container.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
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
        sb.append("ContainerInstanceContainer(");
        sb.append("super=").append(super.toString());
        sb.append("containerId=").append(String.valueOf(this.containerId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerInstanceContainer)) {
            return false;
        }

        ContainerInstanceContainer other = (ContainerInstanceContainer) o;
        return java.util.Objects.equals(this.containerId, other.containerId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.containerId == null ? 43 : this.containerId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
