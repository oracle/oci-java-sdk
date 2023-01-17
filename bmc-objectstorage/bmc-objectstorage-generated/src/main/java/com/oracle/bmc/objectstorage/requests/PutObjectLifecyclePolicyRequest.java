/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/PutObjectLifecyclePolicyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * PutObjectLifecyclePolicyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class PutObjectLifecyclePolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.objectstorage.model.PutObjectLifecyclePolicyDetails> {

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
    /** The lifecycle policy to apply to the bucket. */
    private com.oracle.bmc.objectstorage.model.PutObjectLifecyclePolicyDetails
            putObjectLifecyclePolicyDetails;

    /** The lifecycle policy to apply to the bucket. */
    public com.oracle.bmc.objectstorage.model.PutObjectLifecyclePolicyDetails
            getPutObjectLifecyclePolicyDetails() {
        return putObjectLifecyclePolicyDetails;
    }
    /** The client request ID for tracing. */
    private String opcClientRequestId;

    /** The client request ID for tracing. */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.objectstorage.model.PutObjectLifecyclePolicyDetails getBody$() {
        return putObjectLifecyclePolicyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PutObjectLifecyclePolicyRequest,
                    com.oracle.bmc.objectstorage.model.PutObjectLifecyclePolicyDetails> {
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

        /** The lifecycle policy to apply to the bucket. */
        private com.oracle.bmc.objectstorage.model.PutObjectLifecyclePolicyDetails
                putObjectLifecyclePolicyDetails = null;

        /**
         * The lifecycle policy to apply to the bucket.
         *
         * @param putObjectLifecyclePolicyDetails the value to set
         * @return this builder instance
         */
        public Builder putObjectLifecyclePolicyDetails(
                com.oracle.bmc.objectstorage.model.PutObjectLifecyclePolicyDetails
                        putObjectLifecyclePolicyDetails) {
            this.putObjectLifecyclePolicyDetails = putObjectLifecyclePolicyDetails;
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
        public Builder copy(PutObjectLifecyclePolicyRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            putObjectLifecyclePolicyDetails(o.getPutObjectLifecyclePolicyDetails());
            opcClientRequestId(o.getOpcClientRequestId());
            ifMatch(o.getIfMatch());
            ifNoneMatch(o.getIfNoneMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PutObjectLifecyclePolicyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PutObjectLifecyclePolicyRequest
         */
        public PutObjectLifecyclePolicyRequest build() {
            PutObjectLifecyclePolicyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.objectstorage.model.PutObjectLifecyclePolicyDetails body) {
            putObjectLifecyclePolicyDetails(body);
            return this;
        }

        /**
         * Build the instance of PutObjectLifecyclePolicyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PutObjectLifecyclePolicyRequest
         */
        public PutObjectLifecyclePolicyRequest buildWithoutInvocationCallback() {
            PutObjectLifecyclePolicyRequest request = new PutObjectLifecyclePolicyRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.putObjectLifecyclePolicyDetails = putObjectLifecyclePolicyDetails;
            request.opcClientRequestId = opcClientRequestId;
            request.ifMatch = ifMatch;
            request.ifNoneMatch = ifNoneMatch;
            return request;
            // new PutObjectLifecyclePolicyRequest(namespaceName, bucketName,
            // putObjectLifecyclePolicyDetails, opcClientRequestId, ifMatch, ifNoneMatch);
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
                .putObjectLifecyclePolicyDetails(putObjectLifecyclePolicyDetails)
                .opcClientRequestId(opcClientRequestId)
                .ifMatch(ifMatch)
                .ifNoneMatch(ifNoneMatch);
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
        sb.append(",putObjectLifecyclePolicyDetails=")
                .append(String.valueOf(this.putObjectLifecyclePolicyDetails));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutObjectLifecyclePolicyRequest)) {
            return false;
        }

        PutObjectLifecyclePolicyRequest other = (PutObjectLifecyclePolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(
                        this.putObjectLifecyclePolicyDetails, other.putObjectLifecyclePolicyDetails)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.putObjectLifecyclePolicyDetails == null
                                ? 43
                                : this.putObjectLifecyclePolicyDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        return result;
    }
}
