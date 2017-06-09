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

        @JsonProperty("publicAccessType")
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

        @JsonIgnore
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
        private static Map<String, PublicAccessType> map;

        static {
            map = new HashMap<>();
            for (PublicAccessType v : PublicAccessType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PublicAccessType(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
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
    @JsonProperty("publicAccessType")
    PublicAccessType publicAccessType;
}
