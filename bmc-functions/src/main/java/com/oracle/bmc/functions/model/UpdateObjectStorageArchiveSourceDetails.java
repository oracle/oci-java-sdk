/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * Source details required for updating an archive based function from Object Storage. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateObjectStorageArchiveSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "archiveSourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateObjectStorageArchiveSourceDetails extends UpdateArchiveSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** The Object Storage namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The name of the Object Storage object. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The name of the Object Storage object.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * VersionId used to identify a particular version of the object. If not specified, the
         * latest version of the object is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersionId")
        private String objectVersionId;

        /**
         * VersionId used to identify a particular version of the object. If not specified, the
         * latest version of the object is used.
         *
         * @param objectVersionId the value to set
         * @return this builder
         */
        public Builder objectVersionId(String objectVersionId) {
            this.objectVersionId = objectVersionId;
            this.__explicitlySet__.add("objectVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateObjectStorageArchiveSourceDetails build() {
            UpdateObjectStorageArchiveSourceDetails model =
                    new UpdateObjectStorageArchiveSourceDetails(
                            this.bucketName, this.namespace, this.objectName, this.objectVersionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateObjectStorageArchiveSourceDetails model) {
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("objectVersionId")) {
                this.objectVersionId(model.getObjectVersionId());
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
    public UpdateObjectStorageArchiveSourceDetails(
            String bucketName, String namespace, String objectName, String objectVersionId) {
        super();
        this.bucketName = bucketName;
        this.namespace = namespace;
        this.objectName = objectName;
        this.objectVersionId = objectVersionId;
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

    /** The Object Storage namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The name of the Object Storage object. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The name of the Object Storage object.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * VersionId used to identify a particular version of the object. If not specified, the latest
     * version of the object is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersionId")
    private final String objectVersionId;

    /**
     * VersionId used to identify a particular version of the object. If not specified, the latest
     * version of the object is used.
     *
     * @return the value
     */
    public String getObjectVersionId() {
        return objectVersionId;
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
        sb.append("UpdateObjectStorageArchiveSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectVersionId=").append(String.valueOf(this.objectVersionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateObjectStorageArchiveSourceDetails)) {
            return false;
        }

        UpdateObjectStorageArchiveSourceDetails other = (UpdateObjectStorageArchiveSourceDetails) o;
        return java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.objectVersionId, other.objectVersionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersionId == null ? 43 : this.objectVersionId.hashCode());
        return result;
    }
}
