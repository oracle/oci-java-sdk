/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for creating a mount for a file system on a block volume. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateComputeInstanceNonMovableBlockVolumeMountOperationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateComputeInstanceNonMovableBlockVolumeMountOperationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mountPoint"})
    public CreateComputeInstanceNonMovableBlockVolumeMountOperationDetails(String mountPoint) {
        super();
        this.mountPoint = mountPoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The physical mount point where the file system is mounted on the block volume.
         *
         * <p>Example: {@code /mnt/yourmountpoint}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
        private String mountPoint;

        /**
         * The physical mount point where the file system is mounted on the block volume.
         *
         * <p>Example: {@code /mnt/yourmountpoint}
         *
         * @param mountPoint the value to set
         * @return this builder
         */
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
            this.__explicitlySet__.add("mountPoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateComputeInstanceNonMovableBlockVolumeMountOperationDetails build() {
            CreateComputeInstanceNonMovableBlockVolumeMountOperationDetails model =
                    new CreateComputeInstanceNonMovableBlockVolumeMountOperationDetails(
                            this.mountPoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateComputeInstanceNonMovableBlockVolumeMountOperationDetails model) {
            if (model.wasPropertyExplicitlySet("mountPoint")) {
                this.mountPoint(model.getMountPoint());
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
     * The physical mount point where the file system is mounted on the block volume.
     *
     * <p>Example: {@code /mnt/yourmountpoint}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
    private final String mountPoint;

    /**
     * The physical mount point where the file system is mounted on the block volume.
     *
     * <p>Example: {@code /mnt/yourmountpoint}
     *
     * @return the value
     */
    public String getMountPoint() {
        return mountPoint;
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
        sb.append("CreateComputeInstanceNonMovableBlockVolumeMountOperationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("mountPoint=").append(String.valueOf(this.mountPoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateComputeInstanceNonMovableBlockVolumeMountOperationDetails)) {
            return false;
        }

        CreateComputeInstanceNonMovableBlockVolumeMountOperationDetails other =
                (CreateComputeInstanceNonMovableBlockVolumeMountOperationDetails) o;
        return java.util.Objects.equals(this.mountPoint, other.mountPoint) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mountPoint == null ? 43 : this.mountPoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
