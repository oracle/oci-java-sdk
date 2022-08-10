/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * Multipart uploads provide efficient and resilient uploads, especially for large objects. Multipart uploads also accommodate
 * objects that are too large for a single upload operation. With multipart uploads, individual parts of an object can be
 * uploaded in parallel to reduce the amount of time you spend uploading. Multipart uploads can also minimize the impact
 * of network failures by letting you retry a failed part upload instead of requiring you to retry an entire object upload.
 * See [Using Multipart Uploads](https://docs.cloud.oracle.com/Content/Object/Tasks/usingmultipartuploads.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized,
 * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MultipartUpload.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MultipartUpload extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "namespace",
        "bucket",
        "object",
        "uploadId",
        "timeCreated",
        "storageTier"
    })
    public MultipartUpload(
            String namespace,
            String bucket,
            String object,
            String uploadId,
            java.util.Date timeCreated,
            StorageTier storageTier) {
        super();
        this.namespace = namespace;
        this.bucket = bucket;
        this.object = object;
        this.uploadId = uploadId;
        this.timeCreated = timeCreated;
        this.storageTier = storageTier;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Object Storage namespace in which the in-progress multipart upload is stored.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace in which the in-progress multipart upload is stored.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The bucket in which the in-progress multipart upload is stored.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        /**
         * The bucket in which the in-progress multipart upload is stored.
         * @param bucket the value to set
         * @return this builder
         **/
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            this.__explicitlySet__.add("bucket");
            return this;
        }
        /**
         * The object name of the in-progress multipart upload.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("object")
        private String object;

        /**
         * The object name of the in-progress multipart upload.
         * @param object the value to set
         * @return this builder
         **/
        public Builder object(String object) {
            this.object = object;
            this.__explicitlySet__.add("object");
            return this;
        }
        /**
         * The unique identifier for the in-progress multipart upload.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uploadId")
        private String uploadId;

        /**
         * The unique identifier for the in-progress multipart upload.
         * @param uploadId the value to set
         * @return this builder
         **/
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            this.__explicitlySet__.add("uploadId");
            return this;
        }
        /**
         * The date and time the upload was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the upload was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The storage tier that the object is stored in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
        private StorageTier storageTier;

        /**
         * The storage tier that the object is stored in.
         * @param storageTier the value to set
         * @return this builder
         **/
        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            this.__explicitlySet__.add("storageTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MultipartUpload build() {
            MultipartUpload model =
                    new MultipartUpload(
                            this.namespace,
                            this.bucket,
                            this.object,
                            this.uploadId,
                            this.timeCreated,
                            this.storageTier);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MultipartUpload model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucket")) {
                this.bucket(model.getBucket());
            }
            if (model.wasPropertyExplicitlySet("object")) {
                this.object(model.getObject());
            }
            if (model.wasPropertyExplicitlySet("uploadId")) {
                this.uploadId(model.getUploadId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("storageTier")) {
                this.storageTier(model.getStorageTier());
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
     * The Object Storage namespace in which the in-progress multipart upload is stored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace in which the in-progress multipart upload is stored.
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * The bucket in which the in-progress multipart upload is stored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    private final String bucket;

    /**
     * The bucket in which the in-progress multipart upload is stored.
     * @return the value
     **/
    public String getBucket() {
        return bucket;
    }

    /**
     * The object name of the in-progress multipart upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("object")
    private final String object;

    /**
     * The object name of the in-progress multipart upload.
     * @return the value
     **/
    public String getObject() {
        return object;
    }

    /**
     * The unique identifier for the in-progress multipart upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uploadId")
    private final String uploadId;

    /**
     * The unique identifier for the in-progress multipart upload.
     * @return the value
     **/
    public String getUploadId() {
        return uploadId;
    }

    /**
     * The date and time the upload was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the upload was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The storage tier that the object is stored in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
    private final StorageTier storageTier;

    /**
     * The storage tier that the object is stored in.
     * @return the value
     **/
    public StorageTier getStorageTier() {
        return storageTier;
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
        sb.append("MultipartUpload(");
        sb.append("super=").append(super.toString());
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucket=").append(String.valueOf(this.bucket));
        sb.append(", object=").append(String.valueOf(this.object));
        sb.append(", uploadId=").append(String.valueOf(this.uploadId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", storageTier=").append(String.valueOf(this.storageTier));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MultipartUpload)) {
            return false;
        }

        MultipartUpload other = (MultipartUpload) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucket, other.bucket)
                && java.util.Objects.equals(this.object, other.object)
                && java.util.Objects.equals(this.uploadId, other.uploadId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.storageTier, other.storageTier)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucket == null ? 43 : this.bucket.hashCode());
        result = (result * PRIME) + (this.object == null ? 43 : this.object.hashCode());
        result = (result * PRIME) + (this.uploadId == null ? 43 : this.uploadId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.storageTier == null ? 43 : this.storageTier.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
