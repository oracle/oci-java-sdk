/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model for upload data for images and icons. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UploadData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UploadData extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "contentUrl", "mimeType", "fileExtension"})
    public UploadData(String name, String contentUrl, String mimeType, String fileExtension) {
        super();
        this.name = name;
        this.contentUrl = contentUrl;
        this.mimeType = mimeType;
        this.fileExtension = fileExtension;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name used to refer to the upload data. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name used to refer to the upload data.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The content URL of the upload data. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentUrl")
        private String contentUrl;

        /**
         * The content URL of the upload data.
         *
         * @param contentUrl the value to set
         * @return this builder
         */
        public Builder contentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
            this.__explicitlySet__.add("contentUrl");
            return this;
        }
        /** The MIME type of the upload data. */
        @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
        private String mimeType;

        /**
         * The MIME type of the upload data.
         *
         * @param mimeType the value to set
         * @return this builder
         */
        public Builder mimeType(String mimeType) {
            this.mimeType = mimeType;
            this.__explicitlySet__.add("mimeType");
            return this;
        }
        /** The file extension of the upload data. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileExtension")
        private String fileExtension;

        /**
         * The file extension of the upload data.
         *
         * @param fileExtension the value to set
         * @return this builder
         */
        public Builder fileExtension(String fileExtension) {
            this.fileExtension = fileExtension;
            this.__explicitlySet__.add("fileExtension");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UploadData build() {
            UploadData model =
                    new UploadData(this.name, this.contentUrl, this.mimeType, this.fileExtension);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadData model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("contentUrl")) {
                this.contentUrl(model.getContentUrl());
            }
            if (model.wasPropertyExplicitlySet("mimeType")) {
                this.mimeType(model.getMimeType());
            }
            if (model.wasPropertyExplicitlySet("fileExtension")) {
                this.fileExtension(model.getFileExtension());
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

    /** The name used to refer to the upload data. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name used to refer to the upload data.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The content URL of the upload data. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentUrl")
    private final String contentUrl;

    /**
     * The content URL of the upload data.
     *
     * @return the value
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /** The MIME type of the upload data. */
    @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
    private final String mimeType;

    /**
     * The MIME type of the upload data.
     *
     * @return the value
     */
    public String getMimeType() {
        return mimeType;
    }

    /** The file extension of the upload data. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileExtension")
    private final String fileExtension;

    /**
     * The file extension of the upload data.
     *
     * @return the value
     */
    public String getFileExtension() {
        return fileExtension;
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
        sb.append("UploadData(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", contentUrl=").append(String.valueOf(this.contentUrl));
        sb.append(", mimeType=").append(String.valueOf(this.mimeType));
        sb.append(", fileExtension=").append(String.valueOf(this.fileExtension));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadData)) {
            return false;
        }

        UploadData other = (UploadData) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.contentUrl, other.contentUrl)
                && java.util.Objects.equals(this.mimeType, other.mimeType)
                && java.util.Objects.equals(this.fileExtension, other.fileExtension)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.contentUrl == null ? 43 : this.contentUrl.hashCode());
        result = (result * PRIME) + (this.mimeType == null ? 43 : this.mimeType.hashCode());
        result =
                (result * PRIME)
                        + (this.fileExtension == null ? 43 : this.fileExtension.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
