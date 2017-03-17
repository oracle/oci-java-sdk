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
@JsonDeserialize(builder = CreateBucketDetails.Builder.class)
public class CreateBucketDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("name")
        private String name;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("metadata")
        private Map<String, String> metadata;

        public CreateBucketDetails build() {
            return new CreateBucketDetails(name, compartmentId, metadata);
        }

        @JsonIgnore
        public Builder copy(CreateBucketDetails o) {
            return name(o.getName()).compartmentId(o.getCompartmentId()).metadata(o.getMetadata());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the bucket. Valid characters are letters (upper or lower case),
     * numbers and dashes. Bucket names must be unique within the namespace.
     *
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    @Size(min = 1, max = 63)
    String name;

    /**
     * The ID of the compartment in which to create the bucket.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    String compartmentId;

    /**
     * Arbitrary string keys and values for user-defined metadata.
     **/
    @JsonProperty("metadata")
    Map<String, String> metadata;
}
