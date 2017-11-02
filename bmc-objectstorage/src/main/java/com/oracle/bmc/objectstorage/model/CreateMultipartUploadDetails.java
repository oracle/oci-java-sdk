/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateMultipartUploadDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
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
                            object, contentType, contentLanguage, contentEncoding, metadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMultipartUploadDetails o) {
            return object(o.getObject())
                    .contentType(o.getContentType())
                    .contentLanguage(o.getContentLanguage())
                    .contentEncoding(o.getContentEncoding())
                    .metadata(o.getMetadata());
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
     * The content type of the object to upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    String contentType;

    /**
     * The content language of the object to upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
    String contentLanguage;

    /**
     * The content encoding of the object to upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentEncoding")
    String contentEncoding;

    /**
     * Arbitrary string keys and values for the user-defined metadata for the object.
     * Keys must be in \"opc-meta-*\" format. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
