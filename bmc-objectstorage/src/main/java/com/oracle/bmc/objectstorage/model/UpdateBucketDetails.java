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

        @JsonProperty("publicAccessType")
        private PublicAccessType publicAccessType;

        public UpdateBucketDetails build() {
            return new UpdateBucketDetails(namespace, name, metadata, publicAccessType);
        }

        @JsonIgnore
        public Builder copy(UpdateBucketDetails o) {
            return namespace(o.getNamespace())
                    .name(o.getName())
                    .metadata(o.getMetadata())
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
    String namespace;

    /**
     * The name of the bucket.
     **/
    @JsonProperty("name")
    String name;

    /**
     * Arbitrary string, up to 4KB, of keys and values for user-defined metadata.
     **/
    @JsonProperty("metadata")
    Map<String, String> metadata;
    /**
     * The type of public access available on this bucket. Allows authenticated caller to access the bucket or
     * contents of this bucket. By default a bucket is set to NoPublicAccess. It is treated as NoPublicAccess
     * when this value is not specified. When the type is NoPublicAccess the bucket does not allow any public access.
     * When the type is ObjectRead the bucket allows public access to the GetObject, HeadObject, ListObjects.
     *
     **/
    public enum PublicAccessType {
        NoPublicAccess("NoPublicAccess"),
        ObjectRead("ObjectRead"),
        ;

        private final String value;
        private static Map<String, PublicAccessType> map;

        static {
            map = new HashMap<>();
            for (PublicAccessType v : PublicAccessType.values()) {
                map.put(v.getValue(), v);
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
            throw new RuntimeException("Invalid PublicAccessType: " + key);
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
