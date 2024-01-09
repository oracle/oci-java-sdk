/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for creating a file system unmount. <br>
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
        builder = CreateFileSystemUnmountDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateFileSystemUnmountDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mountTargetId"})
    public CreateFileSystemUnmountDetails(String mountTargetId) {
        super();
        this.mountTargetId = mountTargetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the mount target.
         *
         * <p>Example: {@code ocid1.mounttarget.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mountTargetId")
        private String mountTargetId;

        /**
         * The OCID of the mount target.
         *
         * <p>Example: {@code ocid1.mounttarget.oc1..uniqueID}
         *
         * @param mountTargetId the value to set
         * @return this builder
         */
        public Builder mountTargetId(String mountTargetId) {
            this.mountTargetId = mountTargetId;
            this.__explicitlySet__.add("mountTargetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateFileSystemUnmountDetails build() {
            CreateFileSystemUnmountDetails model =
                    new CreateFileSystemUnmountDetails(this.mountTargetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateFileSystemUnmountDetails model) {
            if (model.wasPropertyExplicitlySet("mountTargetId")) {
                this.mountTargetId(model.getMountTargetId());
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
     * The OCID of the mount target.
     *
     * <p>Example: {@code ocid1.mounttarget.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mountTargetId")
    private final String mountTargetId;

    /**
     * The OCID of the mount target.
     *
     * <p>Example: {@code ocid1.mounttarget.oc1..uniqueID}
     *
     * @return the value
     */
    public String getMountTargetId() {
        return mountTargetId;
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
        sb.append("CreateFileSystemUnmountDetails(");
        sb.append("super=").append(super.toString());
        sb.append("mountTargetId=").append(String.valueOf(this.mountTargetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateFileSystemUnmountDetails)) {
            return false;
        }

        CreateFileSystemUnmountDetails other = (CreateFileSystemUnmountDetails) o;
        return java.util.Objects.equals(this.mountTargetId, other.mountTargetId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.mountTargetId == null ? 43 : this.mountTargetId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
