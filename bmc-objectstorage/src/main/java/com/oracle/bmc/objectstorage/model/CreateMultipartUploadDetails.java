/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CreateMultipartUploadDetails.Builder.class)
public class CreateMultipartUploadDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("object")
        private String object;

        @JsonProperty("contentType")
        private String contentType;

        @JsonProperty("contentLanguage")
        private String contentLanguage;

        @JsonProperty("contentEncoding")
        private String contentEncoding;

        @JsonProperty("metadata")
        private Map<String, String> metadata;

        public CreateMultipartUploadDetails build() {
            return new CreateMultipartUploadDetails(
                    object, contentType, contentLanguage, contentEncoding, metadata);
        }

        @JsonIgnore
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
    @JsonProperty("object")
    @Valid
    @NotNull
    String object;

    /**
     * the content type of the object to upload.
     **/
    @JsonProperty("contentType")
    String contentType;

    /**
     * the content language of the object to upload.
     **/
    @JsonProperty("contentLanguage")
    String contentLanguage;

    /**
     * the content encoding of the object to upload.
     **/
    @JsonProperty("contentEncoding")
    String contentEncoding;

    /**
     * Arbitrary string keys and values for the user-defined metadata for the object.
     * Keys must be in \"opc-meta-*\" format.
     *
     **/
    @JsonProperty("metadata")
    Map<String, String> metadata;
}
