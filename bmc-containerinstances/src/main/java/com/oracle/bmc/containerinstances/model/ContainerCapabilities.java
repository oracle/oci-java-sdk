/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * Linux Container capabilities to configure capabilities of container.
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
    builder = ContainerCapabilities.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ContainerCapabilities
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"addCapabilities", "dropCapabilities"})
    public ContainerCapabilities(
            java.util.List<ContainerCapabilityType> addCapabilities,
            java.util.List<ContainerCapabilityType> dropCapabilities) {
        super();
        this.addCapabilities = addCapabilities;
        this.dropCapabilities = dropCapabilities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of additional configurable container capabilities.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("addCapabilities")
        private java.util.List<ContainerCapabilityType> addCapabilities;

        /**
         * A list of additional configurable container capabilities.
         *
         * @param addCapabilities the value to set
         * @return this builder
         **/
        public Builder addCapabilities(java.util.List<ContainerCapabilityType> addCapabilities) {
            this.addCapabilities = addCapabilities;
            this.__explicitlySet__.add("addCapabilities");
            return this;
        }
        /**
         * A list of container capabilities that can be dropped.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dropCapabilities")
        private java.util.List<ContainerCapabilityType> dropCapabilities;

        /**
         * A list of container capabilities that can be dropped.
         *
         * @param dropCapabilities the value to set
         * @return this builder
         **/
        public Builder dropCapabilities(java.util.List<ContainerCapabilityType> dropCapabilities) {
            this.dropCapabilities = dropCapabilities;
            this.__explicitlySet__.add("dropCapabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerCapabilities build() {
            ContainerCapabilities model =
                    new ContainerCapabilities(this.addCapabilities, this.dropCapabilities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerCapabilities model) {
            if (model.wasPropertyExplicitlySet("addCapabilities")) {
                this.addCapabilities(model.getAddCapabilities());
            }
            if (model.wasPropertyExplicitlySet("dropCapabilities")) {
                this.dropCapabilities(model.getDropCapabilities());
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
     * A list of additional configurable container capabilities.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addCapabilities")
    private final java.util.List<ContainerCapabilityType> addCapabilities;

    /**
     * A list of additional configurable container capabilities.
     *
     * @return the value
     **/
    public java.util.List<ContainerCapabilityType> getAddCapabilities() {
        return addCapabilities;
    }

    /**
     * A list of container capabilities that can be dropped.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dropCapabilities")
    private final java.util.List<ContainerCapabilityType> dropCapabilities;

    /**
     * A list of container capabilities that can be dropped.
     *
     * @return the value
     **/
    public java.util.List<ContainerCapabilityType> getDropCapabilities() {
        return dropCapabilities;
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
        sb.append("ContainerCapabilities(");
        sb.append("super=").append(super.toString());
        sb.append("addCapabilities=").append(String.valueOf(this.addCapabilities));
        sb.append(", dropCapabilities=").append(String.valueOf(this.dropCapabilities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerCapabilities)) {
            return false;
        }

        ContainerCapabilities other = (ContainerCapabilities) o;
        return java.util.Objects.equals(this.addCapabilities, other.addCapabilities)
                && java.util.Objects.equals(this.dropCapabilities, other.dropCapabilities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.addCapabilities == null ? 43 : this.addCapabilities.hashCode());
        result =
                (result * PRIME)
                        + (this.dropCapabilities == null ? 43 : this.dropCapabilities.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
