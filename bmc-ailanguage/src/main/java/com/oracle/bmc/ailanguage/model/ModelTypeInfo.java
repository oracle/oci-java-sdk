/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Model information like versions and capabilities <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ModelTypeInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModelTypeInfo extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"versions", "capabilities"})
    public ModelTypeInfo(
            java.util.List<String> versions, java.util.Map<String, Capabilities> capabilities) {
        super();
        this.versions = versions;
        this.capabilities = capabilities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Model versions available for this model type */
        @com.fasterxml.jackson.annotation.JsonProperty("versions")
        private java.util.List<String> versions;

        /**
         * Model versions available for this model type
         *
         * @param versions the value to set
         * @return this builder
         */
        public Builder versions(java.util.List<String> versions) {
            this.versions = versions;
            this.__explicitlySet__.add("versions");
            return this;
        }
        /** Model information capabilities related to version */
        @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
        private java.util.Map<String, Capabilities> capabilities;

        /**
         * Model information capabilities related to version
         *
         * @param capabilities the value to set
         * @return this builder
         */
        public Builder capabilities(java.util.Map<String, Capabilities> capabilities) {
            this.capabilities = capabilities;
            this.__explicitlySet__.add("capabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelTypeInfo build() {
            ModelTypeInfo model = new ModelTypeInfo(this.versions, this.capabilities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelTypeInfo model) {
            if (model.wasPropertyExplicitlySet("versions")) {
                this.versions(model.getVersions());
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

    /** Model versions available for this model type */
    @com.fasterxml.jackson.annotation.JsonProperty("versions")
    private final java.util.List<String> versions;

    /**
     * Model versions available for this model type
     *
     * @return the value
     */
    public java.util.List<String> getVersions() {
        return versions;
    }

    /** Model information capabilities related to version */
    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    private final java.util.Map<String, Capabilities> capabilities;

    /**
     * Model information capabilities related to version
     *
     * @return the value
     */
    public java.util.Map<String, Capabilities> getCapabilities() {
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
        sb.append("ModelTypeInfo(");
        sb.append("super=").append(super.toString());
        sb.append("versions=").append(String.valueOf(this.versions));
        sb.append(", capabilities=").append(String.valueOf(this.capabilities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelTypeInfo)) {
            return false;
        }

        ModelTypeInfo other = (ModelTypeInfo) o;
        return java.util.Objects.equals(this.versions, other.versions)
                && java.util.Objects.equals(this.capabilities, other.capabilities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.versions == null ? 43 : this.versions.hashCode());
        result = (result * PRIME) + (this.capabilities == null ? 43 : this.capabilities.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
