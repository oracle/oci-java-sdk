/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * Details for importing OCI Cache data from Object Storage RDB file(s) during cluster creation.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImportOciCacheFromObjectStorageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImportOciCacheFromObjectStorageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"namespaceName", "bucketName", "objects"})
    public ImportOciCacheFromObjectStorageDetails(
            String namespaceName,
            String bucketName,
            java.util.List<ImportOciCacheFromObjectStorageObject> objects) {
        super();
        this.namespaceName = namespaceName;
        this.bucketName = bucketName;
        this.objects = objects;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Object Storage namespace name. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * The Object Storage namespace name.
         *
         * @param namespaceName the value to set
         * @return this builder
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /** The Object Storage bucket name. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The Object Storage bucket name.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** The list of objects to import from the specified bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("objects")
        private java.util.List<ImportOciCacheFromObjectStorageObject> objects;

        /**
         * The list of objects to import from the specified bucket.
         *
         * @param objects the value to set
         * @return this builder
         */
        public Builder objects(java.util.List<ImportOciCacheFromObjectStorageObject> objects) {
            this.objects = objects;
            this.__explicitlySet__.add("objects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportOciCacheFromObjectStorageDetails build() {
            ImportOciCacheFromObjectStorageDetails model =
                    new ImportOciCacheFromObjectStorageDetails(
                            this.namespaceName, this.bucketName, this.objects);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportOciCacheFromObjectStorageDetails model) {
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("objects")) {
                this.objects(model.getObjects());
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

    /** The Object Storage namespace name. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * The Object Storage namespace name.
     *
     * @return the value
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /** The Object Storage bucket name. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The Object Storage bucket name.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** The list of objects to import from the specified bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("objects")
    private final java.util.List<ImportOciCacheFromObjectStorageObject> objects;

    /**
     * The list of objects to import from the specified bucket.
     *
     * @return the value
     */
    public java.util.List<ImportOciCacheFromObjectStorageObject> getObjects() {
        return objects;
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
        sb.append("ImportOciCacheFromObjectStorageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", objects=").append(String.valueOf(this.objects));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportOciCacheFromObjectStorageDetails)) {
            return false;
        }

        ImportOciCacheFromObjectStorageDetails other = (ImportOciCacheFromObjectStorageDetails) o;
        return java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objects, other.objects)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.objects == null ? 43 : this.objects.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
