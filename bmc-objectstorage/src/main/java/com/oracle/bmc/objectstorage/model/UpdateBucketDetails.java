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

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = UpdateBucketDetails.Builder.class)
public class UpdateBucketDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("namespace")
        private String namespace;

        @JsonProperty("name")
        private String name;

        @JsonProperty("metadata")
        private Map<String, String> metadata;

        public UpdateBucketDetails build() {
            return new UpdateBucketDetails(namespace, name, metadata);
        }

        @JsonIgnore
        public Builder copy(UpdateBucketDetails o) {
            return namespace(o.getNamespace()).name(o.getName()).metadata(o.getMetadata());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The namespace in which the bucket lives.
     **/
    @JsonProperty("namespace")
    String namespace;

    /**
     * The name of the bucket.
     **/
    @JsonProperty("name")
    String name;

    /**
     * Arbitrary string keys and values for the user-defined metadata.
     **/
    @JsonProperty("metadata")
    Map<String, String> metadata;
}
