/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized,
 * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateMultipartUploadDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateMultipartUploadDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("object")
        private String object;

        public Builder object(String object) {
            this.object = object;
            this.__explicitlySet__.add("object");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private String contentType;

        public Builder contentType(String contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
        private String contentLanguage;

        public Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = contentLanguage;
            this.__explicitlySet__.add("contentLanguage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentEncoding")
        private String contentEncoding;

        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            this.__explicitlySet__.add("contentEncoding");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentDisposition")
        private String contentDisposition;

        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            this.__explicitlySet__.add("contentDisposition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cacheControl")
        private String cacheControl;

        public Builder cacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
            this.__explicitlySet__.add("cacheControl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
        private StorageTier storageTier;

        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            this.__explicitlySet__.add("storageTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMultipartUploadDetails build() {
            CreateMultipartUploadDetails __instance__ =
                    new CreateMultipartUploadDetails(
                            object,
                            contentType,
                            contentLanguage,
                            contentEncoding,
                            contentDisposition,
                            cacheControl,
                            storageTier,
                            metadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMultipartUploadDetails o) {
            Builder copiedBuilder =
                    object(o.getObject())
                            .contentType(o.getContentType())
                            .contentLanguage(o.getContentLanguage())
                            .contentEncoding(o.getContentEncoding())
                            .contentDisposition(o.getContentDisposition())
                            .cacheControl(o.getCacheControl())
                            .storageTier(o.getStorageTier())
                            .metadata(o.getMetadata());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the object to which this multi-part upload is targeted. Avoid entering confidential information.
     * Example: test/object1.log
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("object")
    String object;

    /**
     * The optional Content-Type header that defines the standard MIME type format of the object to upload.
     * Specifying values for this header has no effect on Object Storage behavior. Programs that read the object
     * determine what to do based on the value provided. For example, you could use this header to identify and
     * perform special operations on text only objects.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    String contentType;

    /**
     * The optional Content-Language header that defines the content language of the object to upload. Specifying
     * values for this header has no effect on Object Storage behavior. Programs that read the object determine what
     * to do based on the value provided. For example, you could use this header to identify and differentiate objects
     * based on a particular language.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
    String contentLanguage;

    /**
     * The optional Content-Encoding header that defines the content encodings that were applied to the object to
     * upload. Specifying values for this header has no effect on Object Storage behavior. Programs that read the
     * object determine what to do based on the value provided. For example, you could use this header to determine
     * what decoding mechanisms need to be applied to obtain the media-type specified by the Content-Type header of
     * the object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentEncoding")
    String contentEncoding;

    /**
     * The optional Content-Disposition header that defines presentational information for the object to be
     * returned in GetObject and HeadObject responses. Specifying values for this header has no effect on Object
     * Storage behavior. Programs that read the object determine what to do based on the value provided.
     * For example, you could use this header to let users download objects with custom filenames in a browser.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentDisposition")
    String contentDisposition;

    /**
     * The optional Cache-Control header that defines the caching behavior value to be returned in GetObject and
     * HeadObject responses. Specifying values for this header has no effect on Object Storage behavior. Programs
     * that read the object determine what to do based on the value provided.
     * For example, you could use this header to identify objects that require caching restrictions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cacheControl")
    String cacheControl;

    /**
     * The storage tier that the object should be stored in. If not specified, the object will be stored in
     * the same storage tier as the bucket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
    StorageTier storageTier;

    /**
     * Arbitrary string keys and values for the user-defined metadata for the object.
     * Keys must be in "opc-meta-*" format. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
