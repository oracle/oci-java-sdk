/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for creating the operations performed on a file system for non-movable compute instance.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateComputeInstanceNonMovableFileSystemOperationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateComputeInstanceNonMovableFileSystemOperationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"exportPath", "mountPoint", "mountTargetId"})
    public CreateComputeInstanceNonMovableFileSystemOperationDetails(
            String exportPath, String mountPoint, String mountTargetId) {
        super();
        this.exportPath = exportPath;
        this.mountPoint = mountPoint;
        this.mountTargetId = mountTargetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The export path of the file system.
         * <p>
         * Example: {@code /fs-export-path}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exportPath")
        private String exportPath;

        /**
         * The export path of the file system.
         * <p>
         * Example: {@code /fs-export-path}
         *
         * @param exportPath the value to set
         * @return this builder
         **/
        public Builder exportPath(String exportPath) {
            this.exportPath = exportPath;
            this.__explicitlySet__.add("exportPath");
            return this;
        }
        /**
         * The physical mount point of the file system on a host.
         * <p>
         * Example: {@code /mnt/yourmountpoint}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
        private String mountPoint;

        /**
         * The physical mount point of the file system on a host.
         * <p>
         * Example: {@code /mnt/yourmountpoint}
         *
         * @param mountPoint the value to set
         * @return this builder
         **/
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
            this.__explicitlySet__.add("mountPoint");
            return this;
        }
        /**
         * The OCID of the mount target.
         * <p>
         * Example: {@code ocid1.mounttarget.oc1..uniqueID}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mountTargetId")
        private String mountTargetId;

        /**
         * The OCID of the mount target.
         * <p>
         * Example: {@code ocid1.mounttarget.oc1..uniqueID}
         *
         * @param mountTargetId the value to set
         * @return this builder
         **/
        public Builder mountTargetId(String mountTargetId) {
            this.mountTargetId = mountTargetId;
            this.__explicitlySet__.add("mountTargetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateComputeInstanceNonMovableFileSystemOperationDetails build() {
            CreateComputeInstanceNonMovableFileSystemOperationDetails model =
                    new CreateComputeInstanceNonMovableFileSystemOperationDetails(
                            this.exportPath, this.mountPoint, this.mountTargetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateComputeInstanceNonMovableFileSystemOperationDetails model) {
            if (model.wasPropertyExplicitlySet("exportPath")) {
                this.exportPath(model.getExportPath());
            }
            if (model.wasPropertyExplicitlySet("mountPoint")) {
                this.mountPoint(model.getMountPoint());
            }
            if (model.wasPropertyExplicitlySet("mountTargetId")) {
                this.mountTargetId(model.getMountTargetId());
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
     * The export path of the file system.
     * <p>
     * Example: {@code /fs-export-path}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportPath")
    private final String exportPath;

    /**
     * The export path of the file system.
     * <p>
     * Example: {@code /fs-export-path}
     *
     * @return the value
     **/
    public String getExportPath() {
        return exportPath;
    }

    /**
     * The physical mount point of the file system on a host.
     * <p>
     * Example: {@code /mnt/yourmountpoint}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
    private final String mountPoint;

    /**
     * The physical mount point of the file system on a host.
     * <p>
     * Example: {@code /mnt/yourmountpoint}
     *
     * @return the value
     **/
    public String getMountPoint() {
        return mountPoint;
    }

    /**
     * The OCID of the mount target.
     * <p>
     * Example: {@code ocid1.mounttarget.oc1..uniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mountTargetId")
    private final String mountTargetId;

    /**
     * The OCID of the mount target.
     * <p>
     * Example: {@code ocid1.mounttarget.oc1..uniqueID}
     *
     * @return the value
     **/
    public String getMountTargetId() {
        return mountTargetId;
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
        sb.append("CreateComputeInstanceNonMovableFileSystemOperationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("exportPath=").append(String.valueOf(this.exportPath));
        sb.append(", mountPoint=").append(String.valueOf(this.mountPoint));
        sb.append(", mountTargetId=").append(String.valueOf(this.mountTargetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateComputeInstanceNonMovableFileSystemOperationDetails)) {
            return false;
        }

        CreateComputeInstanceNonMovableFileSystemOperationDetails other =
                (CreateComputeInstanceNonMovableFileSystemOperationDetails) o;
        return java.util.Objects.equals(this.exportPath, other.exportPath)
                && java.util.Objects.equals(this.mountPoint, other.mountPoint)
                && java.util.Objects.equals(this.mountTargetId, other.mountTargetId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.exportPath == null ? 43 : this.exportPath.hashCode());
        result = (result * PRIME) + (this.mountPoint == null ? 43 : this.mountPoint.hashCode());
        result =
                (result * PRIME)
                        + (this.mountTargetId == null ? 43 : this.mountTargetId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
