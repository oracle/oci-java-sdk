/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
    builder = BulkEditTagsResourceType.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkEditTagsResourceType
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceType", "metadataKeys"})
    public BulkEditTagsResourceType(String resourceType, java.util.List<String> metadataKeys) {
        super();
        this.resourceType = resourceType;
        this.metadataKeys = metadataKeys;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique name of the resource type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The unique name of the resource type.
         *
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The metadata keys required to identify the resource.
         * <p>
         * For example, for a bucket, the value of {@code metadataKeys} will be ["namespaceName", "bucketName"].
         * This information will match the API documentation.
         * See [UpdateBucket](https://docs.oracle.com/iaas/api/#/en/objectstorage/latest/Bucket/UpdateBucket) and
         * [DeleteBucket](https://docs.oracle.com/iaas/api/#/en/objectstorage/latest/Bucket/DeleteBucket).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadataKeys")
        private java.util.List<String> metadataKeys;

        /**
         * The metadata keys required to identify the resource.
         * <p>
         * For example, for a bucket, the value of {@code metadataKeys} will be ["namespaceName", "bucketName"].
         * This information will match the API documentation.
         * See [UpdateBucket](https://docs.oracle.com/iaas/api/#/en/objectstorage/latest/Bucket/UpdateBucket) and
         * [DeleteBucket](https://docs.oracle.com/iaas/api/#/en/objectstorage/latest/Bucket/DeleteBucket).
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

        public BulkEditTagsResourceType build() {
            BulkEditTagsResourceType model =
                    new BulkEditTagsResourceType(this.resourceType, this.metadataKeys);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkEditTagsResourceType model) {
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("metadataKeys")) {
                this.metadataKeys(model.getMetadataKeys());
            }
            return this;
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
     * The unique name of the resource type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The unique name of the resource type.
     *
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
    }

    /**
     * The metadata keys required to identify the resource.
     * <p>
     * For example, for a bucket, the value of {@code metadataKeys} will be ["namespaceName", "bucketName"].
     * This information will match the API documentation.
     * See [UpdateBucket](https://docs.oracle.com/iaas/api/#/en/objectstorage/latest/Bucket/UpdateBucket) and
     * [DeleteBucket](https://docs.oracle.com/iaas/api/#/en/objectstorage/latest/Bucket/DeleteBucket).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataKeys")
    private final java.util.List<String> metadataKeys;

    /**
     * The metadata keys required to identify the resource.
     * <p>
     * For example, for a bucket, the value of {@code metadataKeys} will be ["namespaceName", "bucketName"].
     * This information will match the API documentation.
     * See [UpdateBucket](https://docs.oracle.com/iaas/api/#/en/objectstorage/latest/Bucket/UpdateBucket) and
     * [DeleteBucket](https://docs.oracle.com/iaas/api/#/en/objectstorage/latest/Bucket/DeleteBucket).
     *
     * @return the value
     **/
    public java.util.List<String> getMetadataKeys() {
        return metadataKeys;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BulkEditTagsResourceType(");
        sb.append("super=").append(super.toString());
        sb.append("resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", metadataKeys=").append(String.valueOf(this.metadataKeys));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkEditTagsResourceType)) {
            return false;
        }

        BulkEditTagsResourceType other = (BulkEditTagsResourceType) o;
        return java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.metadataKeys, other.metadataKeys)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.metadataKeys == null ? 43 : this.metadataKeys.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
