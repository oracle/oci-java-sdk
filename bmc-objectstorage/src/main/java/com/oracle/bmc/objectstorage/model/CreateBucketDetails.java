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
    builder = CreateBucketDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateBucketDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
        private PublicAccessType publicAccessType;

        public Builder publicAccessType(PublicAccessType publicAccessType) {
            this.publicAccessType = publicAccessType;
            this.__explicitlySet__.add("publicAccessType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
        private StorageTier storageTier;

        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            this.__explicitlySet__.add("storageTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBucketDetails build() {
            CreateBucketDetails __instance__ =
                    new CreateBucketDetails(
                            name, compartmentId, metadata, publicAccessType, storageTier);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBucketDetails o) {
            return name(o.getName())
                    .compartmentId(o.getCompartmentId())
                    .metadata(o.getMetadata())
                    .publicAccessType(o.getPublicAccessType())
                    .storageTier(o.getStorageTier());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the bucket. Valid characters are uppercase or lowercase letters,
     * numbers, and dashes. Bucket names must be unique within the namespace. Avoid entering confidential information.
     * example: Example: my-new-bucket1
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The ID of the compartment in which to create the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Arbitrary string, up to 4KB, of keys and values for user-defined metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;
    /**
     * The type of public access enabled on this bucket.
     * A bucket is set to `NoPublicAccess` by default, which only allows an authenticated caller to access the
     * bucket and its contents. When `ObjectRead` is enabled on the bucket, public access is allowed for the
     * `GetObject`, `HeadObject`, and `ListObjects` operations.
     *
     **/
    public enum PublicAccessType {
        NoPublicAccess("NoPublicAccess"),
        ObjectRead("ObjectRead"),
        ;

        private final String value;
        private static java.util.Map<String, PublicAccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (PublicAccessType v : PublicAccessType.values()) {
                map.put(v.getValue(), v);
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
            throw new RuntimeException("Invalid PublicAccessType: " + key);
        }
    };
    /**
     * The type of public access enabled on this bucket.
     * A bucket is set to `NoPublicAccess` by default, which only allows an authenticated caller to access the
     * bucket and its contents. When `ObjectRead` is enabled on the bucket, public access is allowed for the
     * `GetObject`, `HeadObject`, and `ListObjects` operations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
    PublicAccessType publicAccessType;
    /**
     * The type of storage tier of this bucket.
     * A bucket is set to 'Standard' tier by default, which means the bucket will be put in the standard storage tier.
     * When 'Archive' tier type is set explicitly, the bucket is put in the Archive Storage tier. The 'storageTier'
     * property is immutable after bucket is created.
     *
     **/
    public enum StorageTier {
        Standard("Standard"),
        Archive("Archive"),
        ;

        private final String value;
        private static java.util.Map<String, StorageTier> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageTier v : StorageTier.values()) {
                map.put(v.getValue(), v);
            }
        }

        StorageTier(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageTier create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid StorageTier: " + key);
        }
    };
    /**
     * The type of storage tier of this bucket.
     * A bucket is set to 'Standard' tier by default, which means the bucket will be put in the standard storage tier.
     * When 'Archive' tier type is set explicitly, the bucket is put in the Archive Storage tier. The 'storageTier'
     * property is immutable after bucket is created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
    StorageTier storageTier;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
