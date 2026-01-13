/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Represents a specific component type and its associated firmware versions. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ComponentVersion.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComponentVersion
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"componentType", "version"})
    public ComponentVersion(String componentType, java.util.List<String> version) {
        super();
        this.componentType = componentType;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of component. */
        @com.fasterxml.jackson.annotation.JsonProperty("componentType")
        private String componentType;

        /**
         * The type of component.
         *
         * @param componentType the value to set
         * @return this builder
         */
        public Builder componentType(String componentType) {
            this.componentType = componentType;
            this.__explicitlySet__.add("componentType");
            return this;
        }
        /** A list of firmware versions associated with this component type. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private java.util.List<String> version;

        /**
         * A list of firmware versions associated with this component type.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(java.util.List<String> version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComponentVersion build() {
            ComponentVersion model = new ComponentVersion(this.componentType, this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComponentVersion model) {
            if (model.wasPropertyExplicitlySet("componentType")) {
                this.componentType(model.getComponentType());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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

    /** The type of component. */
    @com.fasterxml.jackson.annotation.JsonProperty("componentType")
    private final String componentType;

    /**
     * The type of component.
     *
     * @return the value
     */
    public String getComponentType() {
        return componentType;
    }

    /** A list of firmware versions associated with this component type. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final java.util.List<String> version;

    /**
     * A list of firmware versions associated with this component type.
     *
     * @return the value
     */
    public java.util.List<String> getVersion() {
        return version;
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
        sb.append("ComponentVersion(");
        sb.append("super=").append(super.toString());
        sb.append("componentType=").append(String.valueOf(this.componentType));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComponentVersion)) {
            return false;
        }

        ComponentVersion other = (ComponentVersion) o;
        return java.util.Objects.equals(this.componentType, other.componentType)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.componentType == null ? 43 : this.componentType.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
