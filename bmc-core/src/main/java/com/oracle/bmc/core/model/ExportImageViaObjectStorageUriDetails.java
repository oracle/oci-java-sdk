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
        builder = ExportImageViaObjectStorageUriDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "destinationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportImageViaObjectStorageUriDetails extends ExportImageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("exportFormat")
        private ExportFormat exportFormat;

        public Builder exportFormat(ExportFormat exportFormat) {
            this.exportFormat = exportFormat;
            this.__explicitlySet__.add("exportFormat");
            return this;
        }
        /**
         * The Object Storage URL to export the image to. See [Object Storage
         * URLs](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm#URLs)
         * and [Using Pre-Authenticated
         * Requests](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
         * for constructing URLs for image import/export.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationUri")
        private String destinationUri;

        /**
         * The Object Storage URL to export the image to. See [Object Storage
         * URLs](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm#URLs)
         * and [Using Pre-Authenticated
         * Requests](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
         * for constructing URLs for image import/export.
         *
         * @param destinationUri the value to set
         * @return this builder
         */
        public Builder destinationUri(String destinationUri) {
            this.destinationUri = destinationUri;
            this.__explicitlySet__.add("destinationUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportImageViaObjectStorageUriDetails build() {
            ExportImageViaObjectStorageUriDetails model =
                    new ExportImageViaObjectStorageUriDetails(
                            this.exportFormat, this.destinationUri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportImageViaObjectStorageUriDetails model) {
            if (model.wasPropertyExplicitlySet("exportFormat")) {
                this.exportFormat(model.getExportFormat());
            }
            if (model.wasPropertyExplicitlySet("destinationUri")) {
                this.destinationUri(model.getDestinationUri());
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
    public ExportImageViaObjectStorageUriDetails(ExportFormat exportFormat, String destinationUri) {
        super(exportFormat);
        this.destinationUri = destinationUri;
    }

    /**
     * The Object Storage URL to export the image to. See [Object Storage
     * URLs](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm#URLs)
     * and [Using Pre-Authenticated
     * Requests](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for constructing URLs for image import/export.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationUri")
    private final String destinationUri;

    /**
     * The Object Storage URL to export the image to. See [Object Storage
     * URLs](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm#URLs)
     * and [Using Pre-Authenticated
     * Requests](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for constructing URLs for image import/export.
     *
     * @return the value
     */
    public String getDestinationUri() {
        return destinationUri;
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
        sb.append("ExportImageViaObjectStorageUriDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", destinationUri=").append(String.valueOf(this.destinationUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportImageViaObjectStorageUriDetails)) {
            return false;
        }

        ExportImageViaObjectStorageUriDetails other = (ExportImageViaObjectStorageUriDetails) o;
        return java.util.Objects.equals(this.destinationUri, other.destinationUri)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.destinationUri == null ? 43 : this.destinationUri.hashCode());
        return result;
    }
}
