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
@JsonDeserialize(builder = Bucket.Builder.class)
public class Bucket {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("namespace")
        private String namespace;

        @JsonProperty("name")
        private String name;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("metadata")
        private Map<String, String> metadata;

        @JsonProperty("createdBy")
        private String createdBy;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("etag")
        private String etag;

        public Bucket build() {
            return new Bucket(
                    namespace, name, compartmentId, metadata, createdBy, timeCreated, etag);
        }

        @JsonIgnore
        public Builder copy(Bucket o) {
            return namespace(o.getNamespace())
                    .name(o.getName())
                    .compartmentId(o.getCompartmentId())
                    .metadata(o.getMetadata())
                    .createdBy(o.getCreatedBy())
                    .timeCreated(o.getTimeCreated())
                    .etag(o.getEtag());
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
    @Valid
    @NotNull
    String namespace;

    /**
     * The name of the bucket.
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    String name;

    /**
     * The compartment ID in which the bucket is authorized.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    String compartmentId;

    /**
     * Arbitrary string keys and values for user-defined metadata.
     **/
    @JsonProperty("metadata")
    @Valid
    @NotNull
    Map<String, String> metadata;

    /**
     * The OCID of the user who created the bucket.
     **/
    @JsonProperty("createdBy")
    @Valid
    @NotNull
    String createdBy;

    /**
     * The date and time at which the bucket was created.
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;

    /**
     * The entity tag for the bucket.
     **/
    @JsonProperty("etag")
    @Valid
    @NotNull
    String etag;
}
