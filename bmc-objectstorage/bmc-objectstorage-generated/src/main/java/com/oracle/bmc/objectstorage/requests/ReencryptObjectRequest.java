/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ReencryptObjectExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ReencryptObjectRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ReencryptObjectRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.objectstorage.model.ReencryptObjectDetails> {

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
    /** Request object for re-encrypting the data encryption key associated with an object. */
    private com.oracle.bmc.objectstorage.model.ReencryptObjectDetails reencryptObjectDetails;

    /** Request object for re-encrypting the data encryption key associated with an object. */
    public com.oracle.bmc.objectstorage.model.ReencryptObjectDetails getReencryptObjectDetails() {
        return reencryptObjectDetails;
    }
    /** VersionId used to identify a particular version of the object */
    private String versionId;

    /** VersionId used to identify a particular version of the object */
    public String getVersionId() {
        return versionId;
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
    public com.oracle.bmc.objectstorage.model.ReencryptObjectDetails getBody$() {
        return reencryptObjectDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ReencryptObjectRequest,
                    com.oracle.bmc.objectstorage.model.ReencryptObjectDetails> {
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

        /** Request object for re-encrypting the data encryption key associated with an object. */
        private com.oracle.bmc.objectstorage.model.ReencryptObjectDetails reencryptObjectDetails =
                null;

        /**
         * Request object for re-encrypting the data encryption key associated with an object.
         *
         * @param reencryptObjectDetails the value to set
         * @return this builder instance
         */
        public Builder reencryptObjectDetails(
                com.oracle.bmc.objectstorage.model.ReencryptObjectDetails reencryptObjectDetails) {
            this.reencryptObjectDetails = reencryptObjectDetails;
            return this;
        }

        /** VersionId used to identify a particular version of the object */
        private String versionId = null;

        /**
         * VersionId used to identify a particular version of the object
         *
         * @param versionId the value to set
         * @return this builder instance
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
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
        public Builder copy(ReencryptObjectRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            objectName(o.getObjectName());
            reencryptObjectDetails(o.getReencryptObjectDetails());
            versionId(o.getVersionId());
            opcClientRequestId(o.getOpcClientRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ReencryptObjectRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ReencryptObjectRequest
         */
        public ReencryptObjectRequest build() {
            ReencryptObjectRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.objectstorage.model.ReencryptObjectDetails body) {
            reencryptObjectDetails(body);
            return this;
        }

        /**
         * Build the instance of ReencryptObjectRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ReencryptObjectRequest
         */
        public ReencryptObjectRequest buildWithoutInvocationCallback() {
            ReencryptObjectRequest request = new ReencryptObjectRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.objectName = objectName;
            request.reencryptObjectDetails = reencryptObjectDetails;
            request.versionId = versionId;
            request.opcClientRequestId = opcClientRequestId;
            return request;
            // new ReencryptObjectRequest(namespaceName, bucketName, objectName,
            // reencryptObjectDetails, versionId, opcClientRequestId);
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
                .reencryptObjectDetails(reencryptObjectDetails)
                .versionId(versionId)
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
        sb.append(",reencryptObjectDetails=").append(String.valueOf(this.reencryptObjectDetails));
        sb.append(",versionId=").append(String.valueOf(this.versionId));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReencryptObjectRequest)) {
            return false;
        }

        ReencryptObjectRequest other = (ReencryptObjectRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(
                        this.reencryptObjectDetails, other.reencryptObjectDetails)
                && java.util.Objects.equals(this.versionId, other.versionId)
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
        result =
                (result * PRIME)
                        + (this.reencryptObjectDetails == null
                                ? 43
                                : this.reencryptObjectDetails.hashCode());
        result = (result * PRIME) + (this.versionId == null ? 43 : this.versionId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        return result;
    }
}
