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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BucketSummary.Builder.class)
public class BucketSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        public BucketSummary build() {
            return new BucketSummary(namespace, name, compartmentId, createdBy, timeCreated, etag);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BucketSummary o) {
            return namespace(o.getNamespace())
                    .name(o.getName())
                    .compartmentId(o.getCompartmentId())
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
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String namespace;

    /**
     * The name of the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String name;

    /**
     * The compartment ID in which the bucket is authorized.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String compartmentId;

    /**
     * The OCID of the user who created the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String createdBy;

    /**
     * The date and time at which the bucket was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.Date timeCreated;

    /**
     * The entity tag for the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String etag;
}
