/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Details about the object storage location. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ObjectStorageObject.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ObjectStorageObject extends ModelDataSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The namespace of the Object Storage where the files are stored. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * The namespace of the Object Storage where the files are stored.
         *
         * @param namespaceName the value to set
         * @return this builder
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /** The name of the Object Storage bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The name of the Object Storage bucket.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** The prefix path (or folder) within the bucket where files are located. */
        @com.fasterxml.jackson.annotation.JsonProperty("prefixName")
        private String prefixName;

        /**
         * The prefix path (or folder) within the bucket where files are located.
         *
         * @param prefixName the value to set
         * @return this builder
         */
        public Builder prefixName(String prefixName) {
            this.prefixName = prefixName;
            this.__explicitlySet__.add("prefixName");
            return this;
        }
        /**
         * The full canonical Oracle Cloud region identifier (e.g., "us-ashburn-1") where the object
         * storage bucket containing the files resides.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The full canonical Oracle Cloud region identifier (e.g., "us-ashburn-1") where the object
         * storage bucket containing the files resides.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectStorageObject build() {
            ObjectStorageObject model =
                    new ObjectStorageObject(
                            this.namespaceName, this.bucketName, this.prefixName, this.region);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectStorageObject model) {
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("prefixName")) {
                this.prefixName(model.getPrefixName());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
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
    public ObjectStorageObject(
            String namespaceName, String bucketName, String prefixName, String region) {
        super();
        this.namespaceName = namespaceName;
        this.bucketName = bucketName;
        this.prefixName = prefixName;
        this.region = region;
    }

    /** The namespace of the Object Storage where the files are stored. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * The namespace of the Object Storage where the files are stored.
     *
     * @return the value
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /** The name of the Object Storage bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The name of the Object Storage bucket.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** The prefix path (or folder) within the bucket where files are located. */
    @com.fasterxml.jackson.annotation.JsonProperty("prefixName")
    private final String prefixName;

    /**
     * The prefix path (or folder) within the bucket where files are located.
     *
     * @return the value
     */
    public String getPrefixName() {
        return prefixName;
    }

    /**
     * The full canonical Oracle Cloud region identifier (e.g., "us-ashburn-1") where the object
     * storage bucket containing the files resides.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The full canonical Oracle Cloud region identifier (e.g., "us-ashburn-1") where the object
     * storage bucket containing the files resides.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
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
        sb.append("ObjectStorageObject(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", prefixName=").append(String.valueOf(this.prefixName));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectStorageObject)) {
            return false;
        }

        ObjectStorageObject other = (ObjectStorageObject) o;
        return java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.prefixName, other.prefixName)
                && java.util.Objects.equals(this.region, other.region)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.prefixName == null ? 43 : this.prefixName.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        return result;
    }
}
