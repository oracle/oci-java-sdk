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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Bucket.Builder.class)
public class Bucket {
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

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
        private PublicAccessType publicAccessType;

        public Bucket build() {
            return new Bucket(
                    namespace,
                    name,
                    compartmentId,
                    metadata,
                    createdBy,
                    timeCreated,
                    etag,
                    publicAccessType);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Bucket o) {
            return namespace(o.getNamespace())
                    .name(o.getName())
                    .compartmentId(o.getCompartmentId())
                    .metadata(o.getMetadata())
                    .createdBy(o.getCreatedBy())
                    .timeCreated(o.getTimeCreated())
                    .etag(o.getEtag())
                    .publicAccessType(o.getPublicAccessType());
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
     * Arbitrary string keys and values for user-defined metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.Map<String, String> metadata;

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
    /**
     * The type of public access available on this bucket. Allows authenticated caller to access the bucket or
     * contents of this bucket. By default a bucket is set to NoPublicAccess. It is treated as NoPublicAccess
     * when this value is not specified. When the type is NoPublicAccess the bucket does not allow any public access.
     * When the type is ObjectRead the bucket allows public access to the GetObject, HeadObject, ListObjects.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PublicAccessType {
        NoPublicAccess("NoPublicAccess"),
        ObjectRead("ObjectRead"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PublicAccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (PublicAccessType v : PublicAccessType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PublicAccessType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PublicAccessType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PublicAccessType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of public access available on this bucket. Allows authenticated caller to access the bucket or
     * contents of this bucket. By default a bucket is set to NoPublicAccess. It is treated as NoPublicAccess
     * when this value is not specified. When the type is NoPublicAccess the bucket does not allow any public access.
     * When the type is ObjectRead the bucket allows public access to the GetObject, HeadObject, ListObjects.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
    PublicAccessType publicAccessType;
}
