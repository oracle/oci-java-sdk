/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * Specifications for the mount command to mount the OCI File Storage Service (FSS) File System to
 * Containers. <br>
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
        builder = CreateOciFssMountCommandDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOciFssMountCommandDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mountOptions"})
    public CreateOciFssMountCommandDetails(
            java.util.List<CreateOciFssMountOptionDetails> mountOptions) {
        super();
        this.mountOptions = mountOptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of mount options to be used in the mount command. The order of this array will be
         * maintained while preparing the mount command.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mountOptions")
        private java.util.List<CreateOciFssMountOptionDetails> mountOptions;

        /**
         * List of mount options to be used in the mount command. The order of this array will be
         * maintained while preparing the mount command.
         *
         * @param mountOptions the value to set
         * @return this builder
         */
        public Builder mountOptions(java.util.List<CreateOciFssMountOptionDetails> mountOptions) {
            this.mountOptions = mountOptions;
            this.__explicitlySet__.add("mountOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOciFssMountCommandDetails build() {
            CreateOciFssMountCommandDetails model =
                    new CreateOciFssMountCommandDetails(this.mountOptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOciFssMountCommandDetails model) {
            if (model.wasPropertyExplicitlySet("mountOptions")) {
                this.mountOptions(model.getMountOptions());
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
     * List of mount options to be used in the mount command. The order of this array will be
     * maintained while preparing the mount command.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mountOptions")
    private final java.util.List<CreateOciFssMountOptionDetails> mountOptions;

    /**
     * List of mount options to be used in the mount command. The order of this array will be
     * maintained while preparing the mount command.
     *
     * @return the value
     */
    public java.util.List<CreateOciFssMountOptionDetails> getMountOptions() {
        return mountOptions;
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
        sb.append("CreateOciFssMountCommandDetails(");
        sb.append("super=").append(super.toString());
        sb.append("mountOptions=").append(String.valueOf(this.mountOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOciFssMountCommandDetails)) {
            return false;
        }

        CreateOciFssMountCommandDetails other = (CreateOciFssMountCommandDetails) o;
        return java.util.Objects.equals(this.mountOptions, other.mountOptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mountOptions == null ? 43 : this.mountOptions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
