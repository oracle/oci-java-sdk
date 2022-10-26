/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not
 * authorized, talk to an administrator. If you are an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMultipartUploadDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateMultipartUploadDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "object",
        "contentType",
        "contentLanguage",
        "contentEncoding",
        "contentDisposition",
        "cacheControl",
        "storageTier",
        "metadata"
    })
    public CreateMultipartUploadDetails(
            String object,
            String contentType,
            String contentLanguage,
            String contentEncoding,
            String contentDisposition,
            String cacheControl,
            StorageTier storageTier,
            java.util.Map<String, String> metadata) {
        super();
        this.object = object;
        this.contentType = contentType;
        this.contentLanguage = contentLanguage;
        this.contentEncoding = contentEncoding;
        this.contentDisposition = contentDisposition;
        this.cacheControl = cacheControl;
        this.storageTier = storageTier;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the object to which this multi-part upload is targeted. Avoid entering
         * confidential information. Example: test/object1.log
         */
        @com.fasterxml.jackson.annotation.JsonProperty("object")
        private String object;

        /**
         * The name of the object to which this multi-part upload is targeted. Avoid entering
         * confidential information. Example: test/object1.log
         *
         * @param object the value to set
         * @return this builder
         */
        public Builder object(String object) {
            this.object = object;
            this.__explicitlySet__.add("object");
            return this;
        }
        /**
         * The optional Content-Type header that defines the standard MIME type format of the object
         * to upload. Specifying values for this header has no effect on Object Storage behavior.
         * Programs that read the object determine what to do based on the value provided. For
         * example, you could use this header to identify and perform special operations on text
         * only objects.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private String contentType;

        /**
         * The optional Content-Type header that defines the standard MIME type format of the object
         * to upload. Specifying values for this header has no effect on Object Storage behavior.
         * Programs that read the object determine what to do based on the value provided. For
         * example, you could use this header to identify and perform special operations on text
         * only objects.
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }
        /**
         * The optional Content-Language header that defines the content language of the object to
         * upload. Specifying values for this header has no effect on Object Storage behavior.
         * Programs that read the object determine what to do based on the value provided. For
         * example, you could use this header to identify and differentiate objects based on a
         * particular language.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
        private String contentLanguage;

        /**
         * The optional Content-Language header that defines the content language of the object to
         * upload. Specifying values for this header has no effect on Object Storage behavior.
         * Programs that read the object determine what to do based on the value provided. For
         * example, you could use this header to identify and differentiate objects based on a
         * particular language.
         *
         * @param contentLanguage the value to set
         * @return this builder
         */
        public Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = contentLanguage;
            this.__explicitlySet__.add("contentLanguage");
            return this;
        }
        /**
         * The optional Content-Encoding header that defines the content encodings that were applied
         * to the object to upload. Specifying values for this header has no effect on Object
         * Storage behavior. Programs that read the object determine what to do based on the value
         * provided. For example, you could use this header to determine what decoding mechanisms
         * need to be applied to obtain the media-type specified by the Content-Type header of the
         * object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("contentEncoding")
        private String contentEncoding;

        /**
         * The optional Content-Encoding header that defines the content encodings that were applied
         * to the object to upload. Specifying values for this header has no effect on Object
         * Storage behavior. Programs that read the object determine what to do based on the value
         * provided. For example, you could use this header to determine what decoding mechanisms
         * need to be applied to obtain the media-type specified by the Content-Type header of the
         * object.
         *
         * @param contentEncoding the value to set
         * @return this builder
         */
        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            this.__explicitlySet__.add("contentEncoding");
            return this;
        }
        /**
         * The optional Content-Disposition header that defines presentational information for the
         * object to be returned in GetObject and HeadObject responses. Specifying values for this
         * header has no effect on Object Storage behavior. Programs that read the object determine
         * what to do based on the value provided. For example, you could use this header to let
         * users download objects with custom filenames in a browser.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("contentDisposition")
        private String contentDisposition;

        /**
         * The optional Content-Disposition header that defines presentational information for the
         * object to be returned in GetObject and HeadObject responses. Specifying values for this
         * header has no effect on Object Storage behavior. Programs that read the object determine
         * what to do based on the value provided. For example, you could use this header to let
         * users download objects with custom filenames in a browser.
         *
         * @param contentDisposition the value to set
         * @return this builder
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            this.__explicitlySet__.add("contentDisposition");
            return this;
        }
        /**
         * The optional Cache-Control header that defines the caching behavior value to be returned
         * in GetObject and HeadObject responses. Specifying values for this header has no effect on
         * Object Storage behavior. Programs that read the object determine what to do based on the
         * value provided. For example, you could use this header to identify objects that require
         * caching restrictions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cacheControl")
        private String cacheControl;

        /**
         * The optional Cache-Control header that defines the caching behavior value to be returned
         * in GetObject and HeadObject responses. Specifying values for this header has no effect on
         * Object Storage behavior. Programs that read the object determine what to do based on the
         * value provided. For example, you could use this header to identify objects that require
         * caching restrictions.
         *
         * @param cacheControl the value to set
         * @return this builder
         */
        public Builder cacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
            this.__explicitlySet__.add("cacheControl");
            return this;
        }
        /**
         * The storage tier that the object should be stored in. If not specified, the object will
         * be stored in the same storage tier as the bucket.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
        private StorageTier storageTier;

        /**
         * The storage tier that the object should be stored in. If not specified, the object will
         * be stored in the same storage tier as the bucket.
         *
         * @param storageTier the value to set
         * @return this builder
         */
        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            this.__explicitlySet__.add("storageTier");
            return this;
        }
        /**
         * Arbitrary string keys and values for the user-defined metadata for the object. Keys must
         * be in "opc-meta-*" format. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Arbitrary string keys and values for the user-defined metadata for the object. Keys must
         * be in "opc-meta-*" format. Avoid entering confidential information.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMultipartUploadDetails build() {
            CreateMultipartUploadDetails model =
                    new CreateMultipartUploadDetails(
                            this.object,
                            this.contentType,
                            this.contentLanguage,
                            this.contentEncoding,
                            this.contentDisposition,
                            this.cacheControl,
                            this.storageTier,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMultipartUploadDetails model) {
            if (model.wasPropertyExplicitlySet("object")) {
                this.object(model.getObject());
            }
            if (model.wasPropertyExplicitlySet("contentType")) {
                this.contentType(model.getContentType());
            }
            if (model.wasPropertyExplicitlySet("contentLanguage")) {
                this.contentLanguage(model.getContentLanguage());
            }
            if (model.wasPropertyExplicitlySet("contentEncoding")) {
                this.contentEncoding(model.getContentEncoding());
            }
            if (model.wasPropertyExplicitlySet("contentDisposition")) {
                this.contentDisposition(model.getContentDisposition());
            }
            if (model.wasPropertyExplicitlySet("cacheControl")) {
                this.cacheControl(model.getCacheControl());
            }
            if (model.wasPropertyExplicitlySet("storageTier")) {
                this.storageTier(model.getStorageTier());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
     * The name of the object to which this multi-part upload is targeted. Avoid entering
     * confidential information. Example: test/object1.log
     */
    @com.fasterxml.jackson.annotation.JsonProperty("object")
    private final String object;

    /**
     * The name of the object to which this multi-part upload is targeted. Avoid entering
     * confidential information. Example: test/object1.log
     *
     * @return the value
     */
    public String getObject() {
        return object;
    }

    /**
     * The optional Content-Type header that defines the standard MIME type format of the object to
     * upload. Specifying values for this header has no effect on Object Storage behavior. Programs
     * that read the object determine what to do based on the value provided. For example, you could
     * use this header to identify and perform special operations on text only objects.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final String contentType;

    /**
     * The optional Content-Type header that defines the standard MIME type format of the object to
     * upload. Specifying values for this header has no effect on Object Storage behavior. Programs
     * that read the object determine what to do based on the value provided. For example, you could
     * use this header to identify and perform special operations on text only objects.
     *
     * @return the value
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * The optional Content-Language header that defines the content language of the object to
     * upload. Specifying values for this header has no effect on Object Storage behavior. Programs
     * that read the object determine what to do based on the value provided. For example, you could
     * use this header to identify and differentiate objects based on a particular language.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
    private final String contentLanguage;

    /**
     * The optional Content-Language header that defines the content language of the object to
     * upload. Specifying values for this header has no effect on Object Storage behavior. Programs
     * that read the object determine what to do based on the value provided. For example, you could
     * use this header to identify and differentiate objects based on a particular language.
     *
     * @return the value
     */
    public String getContentLanguage() {
        return contentLanguage;
    }

    /**
     * The optional Content-Encoding header that defines the content encodings that were applied to
     * the object to upload. Specifying values for this header has no effect on Object Storage
     * behavior. Programs that read the object determine what to do based on the value provided. For
     * example, you could use this header to determine what decoding mechanisms need to be applied
     * to obtain the media-type specified by the Content-Type header of the object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentEncoding")
    private final String contentEncoding;

    /**
     * The optional Content-Encoding header that defines the content encodings that were applied to
     * the object to upload. Specifying values for this header has no effect on Object Storage
     * behavior. Programs that read the object determine what to do based on the value provided. For
     * example, you could use this header to determine what decoding mechanisms need to be applied
     * to obtain the media-type specified by the Content-Type header of the object.
     *
     * @return the value
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * The optional Content-Disposition header that defines presentational information for the
     * object to be returned in GetObject and HeadObject responses. Specifying values for this
     * header has no effect on Object Storage behavior. Programs that read the object determine what
     * to do based on the value provided. For example, you could use this header to let users
     * download objects with custom filenames in a browser.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentDisposition")
    private final String contentDisposition;

    /**
     * The optional Content-Disposition header that defines presentational information for the
     * object to be returned in GetObject and HeadObject responses. Specifying values for this
     * header has no effect on Object Storage behavior. Programs that read the object determine what
     * to do based on the value provided. For example, you could use this header to let users
     * download objects with custom filenames in a browser.
     *
     * @return the value
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * The optional Cache-Control header that defines the caching behavior value to be returned in
     * GetObject and HeadObject responses. Specifying values for this header has no effect on Object
     * Storage behavior. Programs that read the object determine what to do based on the value
     * provided. For example, you could use this header to identify objects that require caching
     * restrictions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cacheControl")
    private final String cacheControl;

    /**
     * The optional Cache-Control header that defines the caching behavior value to be returned in
     * GetObject and HeadObject responses. Specifying values for this header has no effect on Object
     * Storage behavior. Programs that read the object determine what to do based on the value
     * provided. For example, you could use this header to identify objects that require caching
     * restrictions.
     *
     * @return the value
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * The storage tier that the object should be stored in. If not specified, the object will be
     * stored in the same storage tier as the bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
    private final StorageTier storageTier;

    /**
     * The storage tier that the object should be stored in. If not specified, the object will be
     * stored in the same storage tier as the bucket.
     *
     * @return the value
     */
    public StorageTier getStorageTier() {
        return storageTier;
    }

    /**
     * Arbitrary string keys and values for the user-defined metadata for the object. Keys must be
     * in "opc-meta-*" format. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Arbitrary string keys and values for the user-defined metadata for the object. Keys must be
     * in "opc-meta-*" format. Avoid entering confidential information.
     *
     * @return the value
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
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
        sb.append("CreateMultipartUploadDetails(");
        sb.append("super=").append(super.toString());
        sb.append("object=").append(String.valueOf(this.object));
        sb.append(", contentType=").append(String.valueOf(this.contentType));
        sb.append(", contentLanguage=").append(String.valueOf(this.contentLanguage));
        sb.append(", contentEncoding=").append(String.valueOf(this.contentEncoding));
        sb.append(", contentDisposition=").append(String.valueOf(this.contentDisposition));
        sb.append(", cacheControl=").append(String.valueOf(this.cacheControl));
        sb.append(", storageTier=").append(String.valueOf(this.storageTier));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMultipartUploadDetails)) {
            return false;
        }

        CreateMultipartUploadDetails other = (CreateMultipartUploadDetails) o;
        return java.util.Objects.equals(this.object, other.object)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.contentLanguage, other.contentLanguage)
                && java.util.Objects.equals(this.contentEncoding, other.contentEncoding)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition)
                && java.util.Objects.equals(this.cacheControl, other.cacheControl)
                && java.util.Objects.equals(this.storageTier, other.storageTier)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.object == null ? 43 : this.object.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLanguage == null ? 43 : this.contentLanguage.hashCode());
        result =
                (result * PRIME)
                        + (this.contentEncoding == null ? 43 : this.contentEncoding.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result = (result * PRIME) + (this.cacheControl == null ? 43 : this.cacheControl.hashCode());
        result = (result * PRIME) + (this.storageTier == null ? 43 : this.storageTier.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
