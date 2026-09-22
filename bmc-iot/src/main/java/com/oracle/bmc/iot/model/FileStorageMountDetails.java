/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * Details about a File Storage mount for an IoT flow runtime.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FileStorageMountDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FileStorageMountDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mountPath", "mountTargetId", "exportId"})
    public FileStorageMountDetails(String mountPath, String mountTargetId, String exportId) {
        super();
        this.mountPath = mountPath;
        this.mountTargetId = mountTargetId;
        this.exportId = exportId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The path relative to {@code /mnt} where the File Storage export is mounted. Do not include a leading slash or the {@code /mnt} prefix.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mountPath")
        private String mountPath;

        /**
         * The path relative to {@code /mnt} where the File Storage export is mounted. Do not include a leading slash or the {@code /mnt} prefix.
         * @param mountPath the value to set
         * @return this builder
         **/
        public Builder mountPath(String mountPath) {
            this.mountPath = mountPath;
            this.__explicitlySet__.add("mountPath");
            return this;
        }
        /**
         * The OCID of the File Storage mount target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mountTargetId")
        private String mountTargetId;

        /**
         * The OCID of the File Storage mount target.
         * @param mountTargetId the value to set
         * @return this builder
         **/
        public Builder mountTargetId(String mountTargetId) {
            this.mountTargetId = mountTargetId;
            this.__explicitlySet__.add("mountTargetId");
            return this;
        }
        /**
         * The OCID of the File Storage export.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exportId")
        private String exportId;

        /**
         * The OCID of the File Storage export.
         * @param exportId the value to set
         * @return this builder
         **/
        public Builder exportId(String exportId) {
            this.exportId = exportId;
            this.__explicitlySet__.add("exportId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FileStorageMountDetails build() {
            FileStorageMountDetails model =
                    new FileStorageMountDetails(this.mountPath, this.mountTargetId, this.exportId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileStorageMountDetails model) {
            if (model.wasPropertyExplicitlySet("mountPath")) {
                this.mountPath(model.getMountPath());
            }
            if (model.wasPropertyExplicitlySet("mountTargetId")) {
                this.mountTargetId(model.getMountTargetId());
            }
            if (model.wasPropertyExplicitlySet("exportId")) {
                this.exportId(model.getExportId());
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
     * The path relative to {@code /mnt} where the File Storage export is mounted. Do not include a leading slash or the {@code /mnt} prefix.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mountPath")
    private final String mountPath;

    /**
     * The path relative to {@code /mnt} where the File Storage export is mounted. Do not include a leading slash or the {@code /mnt} prefix.
     * @return the value
     **/
    public String getMountPath() {
        return mountPath;
    }

    /**
     * The OCID of the File Storage mount target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mountTargetId")
    private final String mountTargetId;

    /**
     * The OCID of the File Storage mount target.
     * @return the value
     **/
    public String getMountTargetId() {
        return mountTargetId;
    }

    /**
     * The OCID of the File Storage export.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportId")
    private final String exportId;

    /**
     * The OCID of the File Storage export.
     * @return the value
     **/
    public String getExportId() {
        return exportId;
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
        sb.append("FileStorageMountDetails(");
        sb.append("super=").append(super.toString());
        sb.append("mountPath=").append(String.valueOf(this.mountPath));
        sb.append(", mountTargetId=").append(String.valueOf(this.mountTargetId));
        sb.append(", exportId=").append(String.valueOf(this.exportId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileStorageMountDetails)) {
            return false;
        }

        FileStorageMountDetails other = (FileStorageMountDetails) o;
        return java.util.Objects.equals(this.mountPath, other.mountPath)
                && java.util.Objects.equals(this.mountTargetId, other.mountTargetId)
                && java.util.Objects.equals(this.exportId, other.exportId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mountPath == null ? 43 : this.mountPath.hashCode());
        result =
                (result * PRIME)
                        + (this.mountTargetId == null ? 43 : this.mountTargetId.hashCode());
        result = (result * PRIME) + (this.exportId == null ? 43 : this.exportId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
