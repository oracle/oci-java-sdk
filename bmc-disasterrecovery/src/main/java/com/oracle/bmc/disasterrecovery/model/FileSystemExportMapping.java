/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The mapping between a primary region file system export path and destination region mount target.
 * <br>
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
        builder = FileSystemExportMapping.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FileSystemExportMapping
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"exportId", "destinationMountTargetId"})
    public FileSystemExportMapping(String exportId, String destinationMountTargetId) {
        super();
        this.exportId = exportId;
        this.destinationMountTargetId = destinationMountTargetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the export path.
         *
         * <p>Example: {@code ocid1.export.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exportId")
        private String exportId;

        /**
         * The OCID of the export path.
         *
         * <p>Example: {@code ocid1.export.oc1..uniqueID}
         *
         * @param exportId the value to set
         * @return this builder
         */
        public Builder exportId(String exportId) {
            this.exportId = exportId;
            this.__explicitlySet__.add("exportId");
            return this;
        }
        /**
         * The OCID of the destination mount target on which this file system export should be
         * created.
         *
         * <p>Example: {@code ocid1.mounttarget.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationMountTargetId")
        private String destinationMountTargetId;

        /**
         * The OCID of the destination mount target on which this file system export should be
         * created.
         *
         * <p>Example: {@code ocid1.mounttarget.oc1..uniqueID}
         *
         * @param destinationMountTargetId the value to set
         * @return this builder
         */
        public Builder destinationMountTargetId(String destinationMountTargetId) {
            this.destinationMountTargetId = destinationMountTargetId;
            this.__explicitlySet__.add("destinationMountTargetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FileSystemExportMapping build() {
            FileSystemExportMapping model =
                    new FileSystemExportMapping(this.exportId, this.destinationMountTargetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileSystemExportMapping model) {
            if (model.wasPropertyExplicitlySet("exportId")) {
                this.exportId(model.getExportId());
            }
            if (model.wasPropertyExplicitlySet("destinationMountTargetId")) {
                this.destinationMountTargetId(model.getDestinationMountTargetId());
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
     * The OCID of the export path.
     *
     * <p>Example: {@code ocid1.export.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exportId")
    private final String exportId;

    /**
     * The OCID of the export path.
     *
     * <p>Example: {@code ocid1.export.oc1..uniqueID}
     *
     * @return the value
     */
    public String getExportId() {
        return exportId;
    }

    /**
     * The OCID of the destination mount target on which this file system export should be created.
     *
     * <p>Example: {@code ocid1.mounttarget.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationMountTargetId")
    private final String destinationMountTargetId;

    /**
     * The OCID of the destination mount target on which this file system export should be created.
     *
     * <p>Example: {@code ocid1.mounttarget.oc1..uniqueID}
     *
     * @return the value
     */
    public String getDestinationMountTargetId() {
        return destinationMountTargetId;
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
        sb.append("FileSystemExportMapping(");
        sb.append("super=").append(super.toString());
        sb.append("exportId=").append(String.valueOf(this.exportId));
        sb.append(", destinationMountTargetId=")
                .append(String.valueOf(this.destinationMountTargetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileSystemExportMapping)) {
            return false;
        }

        FileSystemExportMapping other = (FileSystemExportMapping) o;
        return java.util.Objects.equals(this.exportId, other.exportId)
                && java.util.Objects.equals(
                        this.destinationMountTargetId, other.destinationMountTargetId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.exportId == null ? 43 : this.exportId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationMountTargetId == null
                                ? 43
                                : this.destinationMountTargetId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
