/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The object storage location where usage or cost CSVs will be uploaded. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ObjectStorageLocation.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "locationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ObjectStorageLocation extends ResultLocation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The destination Object Store Region specified by the customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The destination Object Store Region specified by the customer.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** The namespace needed to determine the object storage bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The namespace needed to determine the object storage bucket.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The bucket name where usage or cost CSVs will be uploaded. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The bucket name where usage or cost CSVs will be uploaded.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectStorageLocation build() {
            ObjectStorageLocation model =
                    new ObjectStorageLocation(this.region, this.namespace, this.bucketName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectStorageLocation model) {
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public ObjectStorageLocation(String region, String namespace, String bucketName) {
        super();
        this.region = region;
        this.namespace = namespace;
        this.bucketName = bucketName;
    }

    /** The destination Object Store Region specified by the customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The destination Object Store Region specified by the customer.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** The namespace needed to determine the object storage bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The namespace needed to determine the object storage bucket.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The bucket name where usage or cost CSVs will be uploaded. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The bucket name where usage or cost CSVs will be uploaded.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
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
        sb.append("ObjectStorageLocation(");
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
        if (!(o instanceof ObjectStorageLocation)) {
            return false;
        }

        ObjectStorageLocation other = (ObjectStorageLocation) o;
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
