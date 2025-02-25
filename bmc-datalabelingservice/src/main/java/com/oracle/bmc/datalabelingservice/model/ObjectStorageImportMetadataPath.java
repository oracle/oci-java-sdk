/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservice.model;

/**
 * Object Storage details for import metadata path.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ObjectStorageImportMetadataPath.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ObjectStorageImportMetadataPath extends ImportMetadataPath {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Bucket namespace name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Bucket namespace name
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * Bucket name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        /**
         * Bucket name
         * @param bucket the value to set
         * @return this builder
         **/
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            this.__explicitlySet__.add("bucket");
            return this;
        }
        /**
         * Path for the metadata file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Path for the metadata file.
         * @param path the value to set
         * @return this builder
         **/
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectStorageImportMetadataPath build() {
            ObjectStorageImportMetadataPath model =
                    new ObjectStorageImportMetadataPath(this.namespace, this.bucket, this.path);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectStorageImportMetadataPath model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucket")) {
                this.bucket(model.getBucket());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
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

    @Deprecated
    public ObjectStorageImportMetadataPath(String namespace, String bucket, String path) {
        super();
        this.namespace = namespace;
        this.bucket = bucket;
        this.path = path;
    }

    /**
     * Bucket namespace name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Bucket namespace name
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * Bucket name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    private final String bucket;

    /**
     * Bucket name
     * @return the value
     **/
    public String getBucket() {
        return bucket;
    }

    /**
     * Path for the metadata file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Path for the metadata file.
     * @return the value
     **/
    public String getPath() {
        return path;
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
        sb.append("ObjectStorageImportMetadataPath(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucket=").append(String.valueOf(this.bucket));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectStorageImportMetadataPath)) {
            return false;
        }

        ObjectStorageImportMetadataPath other = (ObjectStorageImportMetadataPath) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucket, other.bucket)
                && java.util.Objects.equals(this.path, other.path)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucket == null ? 43 : this.bucket.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        return result;
    }
}
