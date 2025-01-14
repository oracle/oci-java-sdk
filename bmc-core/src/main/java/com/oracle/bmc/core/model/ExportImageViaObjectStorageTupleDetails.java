/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExportImageViaObjectStorageTupleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "destinationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportImageViaObjectStorageTupleDetails extends ExportImageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("exportFormat")
        private ExportFormat exportFormat;

        public Builder exportFormat(ExportFormat exportFormat) {
            this.exportFormat = exportFormat;
            this.__explicitlySet__.add("exportFormat");
            return this;
        }
        /** The Object Storage bucket to export the image to. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The Object Storage bucket to export the image to.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** The Object Storage namespace to export the image to. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * The Object Storage namespace to export the image to.
         *
         * @param namespaceName the value to set
         * @return this builder
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /** The Object Storage object name for the exported image. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The Object Storage object name for the exported image.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportImageViaObjectStorageTupleDetails build() {
            ExportImageViaObjectStorageTupleDetails model =
                    new ExportImageViaObjectStorageTupleDetails(
                            this.exportFormat,
                            this.bucketName,
                            this.namespaceName,
                            this.objectName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportImageViaObjectStorageTupleDetails model) {
            if (model.wasPropertyExplicitlySet("exportFormat")) {
                this.exportFormat(model.getExportFormat());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
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
    public ExportImageViaObjectStorageTupleDetails(
            ExportFormat exportFormat, String bucketName, String namespaceName, String objectName) {
        super(exportFormat);
        this.bucketName = bucketName;
        this.namespaceName = namespaceName;
        this.objectName = objectName;
    }

    /** The Object Storage bucket to export the image to. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The Object Storage bucket to export the image to.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** The Object Storage namespace to export the image to. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * The Object Storage namespace to export the image to.
     *
     * @return the value
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /** The Object Storage object name for the exported image. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The Object Storage object name for the exported image.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
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
        sb.append("ExportImageViaObjectStorageTupleDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportImageViaObjectStorageTupleDetails)) {
            return false;
        }

        ExportImageViaObjectStorageTupleDetails other = (ExportImageViaObjectStorageTupleDetails) o;
        return java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        return result;
    }
}
