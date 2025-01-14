/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * The bulk action resource entity. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BulkActionResource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkActionResource
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"identifier", "entityType", "metadata"})
    public BulkActionResource(
            String identifier, String entityType, java.util.Map<String, String> metadata) {
        super();
        this.identifier = identifier;
        this.entityType = entityType;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The resource OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * The resource OCID.
         *
         * @param identifier the value to set
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /**
         * The resource-type. To get the list of supported resource-types use {@link
         * #listBulkActionResourceTypes(ListBulkActionResourceTypesRequest)
         * listBulkActionResourceTypes}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The resource-type. To get the list of supported resource-types use {@link
         * #listBulkActionResourceTypes(ListBulkActionResourceTypesRequest)
         * listBulkActionResourceTypes}.
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /**
         * Additional information that helps to identity the resource for bulk action.
         *
         * <p>The APIs to delete and move most resource types only require the resource identifier
         * (ocid). But some resource-types require additional identifying information.
         *
         * <p>This information is provided in the resource's public API document. It is also
         * available through the {@link
         * #listBulkActionResourceTypes(ListBulkActionResourceTypesRequest)
         * listBulkActionResourceTypes}.
         *
         * <p>*Example**: The APIs to delete or move the {@code buckets} resource-type require
         * {@code namespaceName} and {@code bucketName} to identify the resource, as shown in the
         * APIs, {@link #deleteBucket(DeleteBucketRequest) deleteBucket} and {@link
         * #updateBucket(UpdateBucketRequest) updateBucket}.
         *
         * <p>To add a bucket for bulk actions, specify {@code namespaceName} and {@code bucketName}
         * in the metadata property as shown in this example
         *
         * <p>{ "identifier": "<OCID_of_bucket>" "entityType": "bucket", "metadata": {
         * "namespaceName": "sampleNamespace", "bucketName": "sampleBucket" } }
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Additional information that helps to identity the resource for bulk action.
         *
         * <p>The APIs to delete and move most resource types only require the resource identifier
         * (ocid). But some resource-types require additional identifying information.
         *
         * <p>This information is provided in the resource's public API document. It is also
         * available through the {@link
         * #listBulkActionResourceTypes(ListBulkActionResourceTypesRequest)
         * listBulkActionResourceTypes}.
         *
         * <p>*Example**: The APIs to delete or move the {@code buckets} resource-type require
         * {@code namespaceName} and {@code bucketName} to identify the resource, as shown in the
         * APIs, {@link #deleteBucket(DeleteBucketRequest) deleteBucket} and {@link
         * #updateBucket(UpdateBucketRequest) updateBucket}.
         *
         * <p>To add a bucket for bulk actions, specify {@code namespaceName} and {@code bucketName}
         * in the metadata property as shown in this example
         *
         * <p>{ "identifier": "<OCID_of_bucket>" "entityType": "bucket", "metadata": {
         * "namespaceName": "sampleNamespace", "bucketName": "sampleBucket" } }
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkActionResource build() {
            BulkActionResource model =
                    new BulkActionResource(this.identifier, this.entityType, this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkActionResource model) {
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The resource OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * The resource OCID.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * The resource-type. To get the list of supported resource-types use {@link
     * #listBulkActionResourceTypes(ListBulkActionResourceTypesRequest)
     * listBulkActionResourceTypes}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The resource-type. To get the list of supported resource-types use {@link
     * #listBulkActionResourceTypes(ListBulkActionResourceTypesRequest)
     * listBulkActionResourceTypes}.
     *
     * @return the value
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Additional information that helps to identity the resource for bulk action.
     *
     * <p>The APIs to delete and move most resource types only require the resource identifier
     * (ocid). But some resource-types require additional identifying information.
     *
     * <p>This information is provided in the resource's public API document. It is also available
     * through the {@link #listBulkActionResourceTypes(ListBulkActionResourceTypesRequest)
     * listBulkActionResourceTypes}.
     *
     * <p>*Example**: The APIs to delete or move the {@code buckets} resource-type require {@code
     * namespaceName} and {@code bucketName} to identify the resource, as shown in the APIs, {@link
     * #deleteBucket(DeleteBucketRequest) deleteBucket} and {@link
     * #updateBucket(UpdateBucketRequest) updateBucket}.
     *
     * <p>To add a bucket for bulk actions, specify {@code namespaceName} and {@code bucketName} in
     * the metadata property as shown in this example
     *
     * <p>{ "identifier": "<OCID_of_bucket>" "entityType": "bucket", "metadata": { "namespaceName":
     * "sampleNamespace", "bucketName": "sampleBucket" } }
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Additional information that helps to identity the resource for bulk action.
     *
     * <p>The APIs to delete and move most resource types only require the resource identifier
     * (ocid). But some resource-types require additional identifying information.
     *
     * <p>This information is provided in the resource's public API document. It is also available
     * through the {@link #listBulkActionResourceTypes(ListBulkActionResourceTypesRequest)
     * listBulkActionResourceTypes}.
     *
     * <p>*Example**: The APIs to delete or move the {@code buckets} resource-type require {@code
     * namespaceName} and {@code bucketName} to identify the resource, as shown in the APIs, {@link
     * #deleteBucket(DeleteBucketRequest) deleteBucket} and {@link
     * #updateBucket(UpdateBucketRequest) updateBucket}.
     *
     * <p>To add a bucket for bulk actions, specify {@code namespaceName} and {@code bucketName} in
     * the metadata property as shown in this example
     *
     * <p>{ "identifier": "<OCID_of_bucket>" "entityType": "bucket", "metadata": { "namespaceName":
     * "sampleNamespace", "bucketName": "sampleBucket" } }
     *
     * @return the value
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BulkActionResource(");
        sb.append("super=").append(super.toString());
        sb.append("identifier=").append(String.valueOf(this.identifier));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkActionResource)) {
            return false;
        }

        BulkActionResource other = (BulkActionResource) o;
        return java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
