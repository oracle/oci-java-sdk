/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Update details for an Object Storage bucket that contains Terraform configuration files.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateObjectStorageConfigSourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configSourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateObjectStorageConfigSourceDetails extends UpdateConfigSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
        private String workingDirectory;

        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = workingDirectory;
            this.__explicitlySet__.add("workingDirectory");
            return this;
        }
        /**
         * The name of the bucket's region.
         * Example: {@code us-phoenix-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The name of the bucket's region.
         * Example: {@code us-phoenix-1}
         *
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The Object Storage namespace that contains the bucket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace that contains the bucket.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The name of the bucket that contains the Terraform configuration files.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The name of the bucket that contains the Terraform configuration files.
         * @param bucketName the value to set
         * @return this builder
         **/
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateObjectStorageConfigSourceDetails build() {
            UpdateObjectStorageConfigSourceDetails model =
                    new UpdateObjectStorageConfigSourceDetails(
                            this.workingDirectory, this.region, this.namespace, this.bucketName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateObjectStorageConfigSourceDetails model) {
            if (model.wasPropertyExplicitlySet("workingDirectory")) {
                this.workingDirectory(model.getWorkingDirectory());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
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
    public UpdateObjectStorageConfigSourceDetails(
            String workingDirectory, String region, String namespace, String bucketName) {
        super(workingDirectory);
        this.region = region;
        this.namespace = namespace;
        this.bucketName = bucketName;
    }

    /**
     * The name of the bucket's region.
     * Example: {@code us-phoenix-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The name of the bucket's region.
     * Example: {@code us-phoenix-1}
     *
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * The Object Storage namespace that contains the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace that contains the bucket.
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * The name of the bucket that contains the Terraform configuration files.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The name of the bucket that contains the Terraform configuration files.
     * @return the value
     **/
    public String getBucketName() {
        return bucketName;
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
        sb.append("UpdateObjectStorageConfigSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateObjectStorageConfigSourceDetails)) {
            return false;
        }

        UpdateObjectStorageConfigSourceDetails other = (UpdateObjectStorageConfigSourceDetails) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        return result;
    }
}
