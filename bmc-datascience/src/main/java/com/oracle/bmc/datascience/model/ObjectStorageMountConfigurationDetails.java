/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The Object Storage Configuration Details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ObjectStorageMountConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "storageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ObjectStorageMountConfigurationDetails extends StorageMountConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("destinationDirectoryName")
        private String destinationDirectoryName;

        public Builder destinationDirectoryName(String destinationDirectoryName) {
            this.destinationDirectoryName = destinationDirectoryName;
            this.__explicitlySet__.add("destinationDirectoryName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationPath")
        private String destinationPath;

        public Builder destinationPath(String destinationPath) {
            this.destinationPath = destinationPath;
            this.__explicitlySet__.add("destinationPath");
            return this;
        }
        /**
         * The object storage namespace
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The object storage namespace
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The object storage bucket
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        /**
         * The object storage bucket
         * @param bucket the value to set
         * @return this builder
         **/
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            this.__explicitlySet__.add("bucket");
            return this;
        }
        /**
         * Prefix in the bucket to mount
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * Prefix in the bucket to mount
         * @param prefix the value to set
         * @return this builder
         **/
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectStorageMountConfigurationDetails build() {
            ObjectStorageMountConfigurationDetails model =
                    new ObjectStorageMountConfigurationDetails(
                            this.destinationDirectoryName,
                            this.destinationPath,
                            this.namespace,
                            this.bucket,
                            this.prefix);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectStorageMountConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("destinationDirectoryName")) {
                this.destinationDirectoryName(model.getDestinationDirectoryName());
            }
            if (model.wasPropertyExplicitlySet("destinationPath")) {
                this.destinationPath(model.getDestinationPath());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucket")) {
                this.bucket(model.getBucket());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
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
    public ObjectStorageMountConfigurationDetails(
            String destinationDirectoryName,
            String destinationPath,
            String namespace,
            String bucket,
            String prefix) {
        super(destinationDirectoryName, destinationPath);
        this.namespace = namespace;
        this.bucket = bucket;
        this.prefix = prefix;
    }

    /**
     * The object storage namespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The object storage namespace
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * The object storage bucket
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    private final String bucket;

    /**
     * The object storage bucket
     * @return the value
     **/
    public String getBucket() {
        return bucket;
    }

    /**
     * Prefix in the bucket to mount
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * Prefix in the bucket to mount
     * @return the value
     **/
    public String getPrefix() {
        return prefix;
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
        sb.append("ObjectStorageMountConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucket=").append(String.valueOf(this.bucket));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectStorageMountConfigurationDetails)) {
            return false;
        }

        ObjectStorageMountConfigurationDetails other = (ObjectStorageMountConfigurationDetails) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucket, other.bucket)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucket == null ? 43 : this.bucket.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        return result;
    }
}
