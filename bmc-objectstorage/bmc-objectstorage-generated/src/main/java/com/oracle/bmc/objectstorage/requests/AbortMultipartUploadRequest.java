/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/AbortMultipartUploadExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use AbortMultipartUploadRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class AbortMultipartUploadRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Object Storage namespace used for the request. */
    private String namespaceName;

    /** The Object Storage namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The name of the bucket. Avoid entering confidential information. Example: {@code
     * my-new-bucket1}
     */
    private String bucketName;

    /**
     * The name of the bucket. Avoid entering confidential information. Example: {@code
     * my-new-bucket1}
     */
    public String getBucketName() {
        return bucketName;
    }
    /**
     * The name of the object. Avoid entering confidential information. Example: {@code
     * test/object1.log}
     */
    private String objectName;

    /**
     * The name of the object. Avoid entering confidential information. Example: {@code
     * test/object1.log}
     */
    public String getObjectName() {
        return objectName;
    }
    /** The upload ID for a multipart upload. */
    private String uploadId;

    /** The upload ID for a multipart upload. */
    public String getUploadId() {
        return uploadId;
    }
    /** The client request ID for tracing. */
    private String opcClientRequestId;

    /** The client request ID for tracing. */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AbortMultipartUploadRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Object Storage namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Object Storage namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * The name of the bucket. Avoid entering confidential information. Example: {@code
         * my-new-bucket1}
         */
        private String bucketName = null;

        /**
         * The name of the bucket. Avoid entering confidential information. Example: {@code
         * my-new-bucket1}
         *
         * @param bucketName the value to set
         * @return this builder instance
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * The name of the object. Avoid entering confidential information. Example: {@code
         * test/object1.log}
         */
        private String objectName = null;

        /**
         * The name of the object. Avoid entering confidential information. Example: {@code
         * test/object1.log}
         *
         * @param objectName the value to set
         * @return this builder instance
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            return this;
        }

        /** The upload ID for a multipart upload. */
        private String uploadId = null;

        /**
         * The upload ID for a multipart upload.
         *
         * @param uploadId the value to set
         * @return this builder instance
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcClientRequestId the value to set
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(AbortMultipartUploadRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            objectName(o.getObjectName());
            uploadId(o.getUploadId());
            opcClientRequestId(o.getOpcClientRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AbortMultipartUploadRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of AbortMultipartUploadRequest
         */
        public AbortMultipartUploadRequest build() {
            AbortMultipartUploadRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of AbortMultipartUploadRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AbortMultipartUploadRequest
         */
        public AbortMultipartUploadRequest buildWithoutInvocationCallback() {
            AbortMultipartUploadRequest request = new AbortMultipartUploadRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.objectName = objectName;
            request.uploadId = uploadId;
            request.opcClientRequestId = opcClientRequestId;
            return request;
            // new AbortMultipartUploadRequest(namespaceName, bucketName, objectName, uploadId,
            // opcClientRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .bucketName(bucketName)
                .objectName(objectName)
                .uploadId(uploadId)
                .opcClientRequestId(opcClientRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",bucketName=").append(String.valueOf(this.bucketName));
        sb.append(",objectName=").append(String.valueOf(this.objectName));
        sb.append(",uploadId=").append(String.valueOf(this.uploadId));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbortMultipartUploadRequest)) {
            return false;
        }

        AbortMultipartUploadRequest other = (AbortMultipartUploadRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.uploadId, other.uploadId)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.uploadId == null ? 43 : this.uploadId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        return result;
    }
}
