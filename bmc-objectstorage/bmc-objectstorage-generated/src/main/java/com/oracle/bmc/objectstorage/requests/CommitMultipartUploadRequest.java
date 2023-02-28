/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CommitMultipartUploadExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CommitMultipartUploadRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CommitMultipartUploadRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.objectstorage.model.CommitMultipartUploadDetails> {

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
    /** The part numbers and entity tags (ETags) for the parts you want to commit. */
    private com.oracle.bmc.objectstorage.model.CommitMultipartUploadDetails
            commitMultipartUploadDetails;

    /** The part numbers and entity tags (ETags) for the parts you want to commit. */
    public com.oracle.bmc.objectstorage.model.CommitMultipartUploadDetails
            getCommitMultipartUploadDetails() {
        return commitMultipartUploadDetails;
    }
    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag
     * matches the ETag of the existing resource, GET and HEAD requests will return the resource and
     * PUT and POST requests will upload the resource.
     */
    private String ifMatch;

    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag
     * matches the ETag of the existing resource, GET and HEAD requests will return the resource and
     * PUT and POST requests will upload the resource.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that
     * the request should fail if the resource already exists.
     */
    private String ifNoneMatch;

    /**
     * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates that
     * the request should fail if the resource already exists.
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }
    /** The client request ID for tracing. */
    private String opcClientRequestId;

    /** The client request ID for tracing. */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.objectstorage.model.CommitMultipartUploadDetails getBody$() {
        return commitMultipartUploadDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CommitMultipartUploadRequest,
                    com.oracle.bmc.objectstorage.model.CommitMultipartUploadDetails> {
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

        /** The part numbers and entity tags (ETags) for the parts you want to commit. */
        private com.oracle.bmc.objectstorage.model.CommitMultipartUploadDetails
                commitMultipartUploadDetails = null;

        /**
         * The part numbers and entity tags (ETags) for the parts you want to commit.
         *
         * @param commitMultipartUploadDetails the value to set
         * @return this builder instance
         */
        public Builder commitMultipartUploadDetails(
                com.oracle.bmc.objectstorage.model.CommitMultipartUploadDetails
                        commitMultipartUploadDetails) {
            this.commitMultipartUploadDetails = commitMultipartUploadDetails;
            return this;
        }

        /**
         * The entity tag (ETag) to match with the ETag of an existing resource. If the specified
         * ETag matches the ETag of the existing resource, GET and HEAD requests will return the
         * resource and PUT and POST requests will upload the resource.
         */
        private String ifMatch = null;

        /**
         * The entity tag (ETag) to match with the ETag of an existing resource. If the specified
         * ETag matches the ETag of the existing resource, GET and HEAD requests will return the
         * resource and PUT and POST requests will upload the resource.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates
         * that the request should fail if the resource already exists.
         */
        private String ifNoneMatch = null;

        /**
         * The entity tag (ETag) to avoid matching. The only valid value is '*', which indicates
         * that the request should fail if the resource already exists.
         *
         * @param ifNoneMatch the value to set
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
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
        public Builder copy(CommitMultipartUploadRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            objectName(o.getObjectName());
            uploadId(o.getUploadId());
            commitMultipartUploadDetails(o.getCommitMultipartUploadDetails());
            ifMatch(o.getIfMatch());
            ifNoneMatch(o.getIfNoneMatch());
            opcClientRequestId(o.getOpcClientRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CommitMultipartUploadRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CommitMultipartUploadRequest
         */
        public CommitMultipartUploadRequest build() {
            CommitMultipartUploadRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.objectstorage.model.CommitMultipartUploadDetails body) {
            commitMultipartUploadDetails(body);
            return this;
        }

        /**
         * Build the instance of CommitMultipartUploadRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CommitMultipartUploadRequest
         */
        public CommitMultipartUploadRequest buildWithoutInvocationCallback() {
            CommitMultipartUploadRequest request = new CommitMultipartUploadRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.objectName = objectName;
            request.uploadId = uploadId;
            request.commitMultipartUploadDetails = commitMultipartUploadDetails;
            request.ifMatch = ifMatch;
            request.ifNoneMatch = ifNoneMatch;
            request.opcClientRequestId = opcClientRequestId;
            return request;
            // new CommitMultipartUploadRequest(namespaceName, bucketName, objectName, uploadId,
            // commitMultipartUploadDetails, ifMatch, ifNoneMatch, opcClientRequestId);
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
                .commitMultipartUploadDetails(commitMultipartUploadDetails)
                .ifMatch(ifMatch)
                .ifNoneMatch(ifNoneMatch)
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
        sb.append(",commitMultipartUploadDetails=")
                .append(String.valueOf(this.commitMultipartUploadDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommitMultipartUploadRequest)) {
            return false;
        }

        CommitMultipartUploadRequest other = (CommitMultipartUploadRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.uploadId, other.uploadId)
                && java.util.Objects.equals(
                        this.commitMultipartUploadDetails, other.commitMultipartUploadDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch)
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
                        + (this.commitMultipartUploadDetails == null
                                ? 43
                                : this.commitMultipartUploadDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        return result;
    }
}
