/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The File Storage Mount Configuration Details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FileStorageMountConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "storageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FileStorageMountConfigurationDetails extends StorageMountConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("destinationDirectoryName")
        private String destinationDirectoryName;

        public Builder destinationDirectoryName(String destinationDirectoryName) {
            this.destinationDirectoryName = destinationDirectoryName;
            this.__explicitlySet__.add("destinationDirectoryName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationPath")
        private String destinationPath;

        public Builder destinationPath(String destinationPath) {
            this.destinationPath = destinationPath;
            this.__explicitlySet__.add("destinationPath");
            return this;
        }
        /** OCID of the mount target */
        @com.fasterxml.jackson.annotation.JsonProperty("mountTargetId")
        private String mountTargetId;

        /**
         * OCID of the mount target
         *
         * @param mountTargetId the value to set
         * @return this builder
         */
        public Builder mountTargetId(String mountTargetId) {
            this.mountTargetId = mountTargetId;
            this.__explicitlySet__.add("mountTargetId");
            return this;
        }
        /** OCID of the export */
        @com.fasterxml.jackson.annotation.JsonProperty("exportId")
        private String exportId;

        /**
         * OCID of the export
         *
         * @param exportId the value to set
         * @return this builder
         */
        public Builder exportId(String exportId) {
            this.exportId = exportId;
            this.__explicitlySet__.add("exportId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FileStorageMountConfigurationDetails build() {
            FileStorageMountConfigurationDetails model =
                    new FileStorageMountConfigurationDetails(
                            this.destinationDirectoryName,
                            this.destinationPath,
                            this.mountTargetId,
                            this.exportId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileStorageMountConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("destinationDirectoryName")) {
                this.destinationDirectoryName(model.getDestinationDirectoryName());
            }
            if (model.wasPropertyExplicitlySet("destinationPath")) {
                this.destinationPath(model.getDestinationPath());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public FileStorageMountConfigurationDetails(
            String destinationDirectoryName,
            String destinationPath,
            String mountTargetId,
            String exportId) {
        super(destinationDirectoryName, destinationPath);
        this.mountTargetId = mountTargetId;
        this.exportId = exportId;
    }

    /** OCID of the mount target */
    @com.fasterxml.jackson.annotation.JsonProperty("mountTargetId")
    private final String mountTargetId;

    /**
     * OCID of the mount target
     *
     * @return the value
     */
    public String getMountTargetId() {
        return mountTargetId;
    }

    /** OCID of the export */
    @com.fasterxml.jackson.annotation.JsonProperty("exportId")
    private final String exportId;

    /**
     * OCID of the export
     *
     * @return the value
     */
    public String getExportId() {
        return exportId;
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
        sb.append("FileStorageMountConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
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
        if (!(o instanceof FileStorageMountConfigurationDetails)) {
            return false;
        }

        FileStorageMountConfigurationDetails other = (FileStorageMountConfigurationDetails) o;
        return java.util.Objects.equals(this.mountTargetId, other.mountTargetId)
                && java.util.Objects.equals(this.exportId, other.exportId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.mountTargetId == null ? 43 : this.mountTargetId.hashCode());
        result = (result * PRIME) + (this.exportId == null ? 43 : this.exportId.hashCode());
        return result;
    }
}
