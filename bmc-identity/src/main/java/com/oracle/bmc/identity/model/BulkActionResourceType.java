/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BulkActionResourceType.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkActionResourceType {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "metadataKeys"})
    public BulkActionResourceType(String name, java.util.List<String> metadataKeys) {
        super();
        this.name = name;
        this.metadataKeys = metadataKeys;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique name of the resource-type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The unique name of the resource-type.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * List of metadata keys required to identify a specific resource. Some resource-types require information besides an OCID to identify
         * a specific resource. For example, the resource-type {@code buckets} requires metadataKeys {@link #deleteBucket(DeleteBucketRequest) deleteBucket}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadataKeys")
        private java.util.List<String> metadataKeys;

        /**
         * List of metadata keys required to identify a specific resource. Some resource-types require information besides an OCID to identify
         * a specific resource. For example, the resource-type {@code buckets} requires metadataKeys {@link #deleteBucket(DeleteBucketRequest) deleteBucket}.
         *
         * @param metadataKeys the value to set
         * @return this builder
         **/
        public Builder metadataKeys(java.util.List<String> metadataKeys) {
            this.metadataKeys = metadataKeys;
            this.__explicitlySet__.add("metadataKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkActionResourceType build() {
            BulkActionResourceType __instance__ = new BulkActionResourceType(name, metadataKeys);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkActionResourceType o) {
            Builder copiedBuilder = name(o.getName()).metadataKeys(o.getMetadataKeys());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The unique name of the resource-type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The unique name of the resource-type.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * List of metadata keys required to identify a specific resource. Some resource-types require information besides an OCID to identify
     * a specific resource. For example, the resource-type {@code buckets} requires metadataKeys {@link #deleteBucket(DeleteBucketRequest) deleteBucket}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataKeys")
    private final java.util.List<String> metadataKeys;

    /**
     * List of metadata keys required to identify a specific resource. Some resource-types require information besides an OCID to identify
     * a specific resource. For example, the resource-type {@code buckets} requires metadataKeys {@link #deleteBucket(DeleteBucketRequest) deleteBucket}.
     *
     * @return the value
     **/
    public java.util.List<String> getMetadataKeys() {
        return metadataKeys;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BulkActionResourceType(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", metadataKeys=").append(String.valueOf(this.metadataKeys));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkActionResourceType)) {
            return false;
        }

        BulkActionResourceType other = (BulkActionResourceType) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.metadataKeys, other.metadataKeys)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.metadataKeys == null ? 43 : this.metadataKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
