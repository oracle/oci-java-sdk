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
public class CreateMultipartUploadDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("object")
        private String object;

        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private String contentType;

        @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
        private String contentLanguage;

        @com.fasterxml.jackson.annotation.JsonProperty("contentEncoding")
        private String contentEncoding;

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        public CreateMultipartUploadDetails build() {
            return new CreateMultipartUploadDetails(
                    object, contentType, contentLanguage, contentEncoding, metadata);
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
     * the name of the object to which this multi-part upload is targetted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("object")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String object;

    /**
     * the content type of the object to upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    String contentType;

    /**
     * the content language of the object to upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
    String contentLanguage;

    /**
     * the content encoding of the object to upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentEncoding")
    String contentEncoding;

    /**
     * Arbitrary string keys and values for the user-defined metadata for the object.
     * Keys must be in \"opc-meta-*\" format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;
}
