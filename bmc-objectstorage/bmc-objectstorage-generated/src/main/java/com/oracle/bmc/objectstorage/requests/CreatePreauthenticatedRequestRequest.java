/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CreatePreauthenticatedRequestExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreatePreauthenticatedRequestRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreatePreauthenticatedRequestRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.objectstorage.model.CreatePreauthenticatedRequestDetails> {

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
    /** Information needed to create the pre-authenticated request. */
    private com.oracle.bmc.objectstorage.model.CreatePreauthenticatedRequestDetails
            createPreauthenticatedRequestDetails;

    /** Information needed to create the pre-authenticated request. */
    public com.oracle.bmc.objectstorage.model.CreatePreauthenticatedRequestDetails
            getCreatePreauthenticatedRequestDetails() {
        return createPreauthenticatedRequestDetails;
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
    public com.oracle.bmc.objectstorage.model.CreatePreauthenticatedRequestDetails getBody$() {
        return createPreauthenticatedRequestDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreatePreauthenticatedRequestRequest,
                    com.oracle.bmc.objectstorage.model.CreatePreauthenticatedRequestDetails> {
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

        /** Information needed to create the pre-authenticated request. */
        private com.oracle.bmc.objectstorage.model.CreatePreauthenticatedRequestDetails
                createPreauthenticatedRequestDetails = null;

        /**
         * Information needed to create the pre-authenticated request.
         *
         * @param createPreauthenticatedRequestDetails the value to set
         * @return this builder instance
         */
        public Builder createPreauthenticatedRequestDetails(
                com.oracle.bmc.objectstorage.model.CreatePreauthenticatedRequestDetails
                        createPreauthenticatedRequestDetails) {
            this.createPreauthenticatedRequestDetails = createPreauthenticatedRequestDetails;
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
        public Builder copy(CreatePreauthenticatedRequestRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            createPreauthenticatedRequestDetails(o.getCreatePreauthenticatedRequestDetails());
            opcClientRequestId(o.getOpcClientRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreatePreauthenticatedRequestRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreatePreauthenticatedRequestRequest
         */
        public CreatePreauthenticatedRequestRequest build() {
            CreatePreauthenticatedRequestRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.objectstorage.model.CreatePreauthenticatedRequestDetails body) {
            createPreauthenticatedRequestDetails(body);
            return this;
        }

        /**
         * Build the instance of CreatePreauthenticatedRequestRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreatePreauthenticatedRequestRequest
         */
        public CreatePreauthenticatedRequestRequest buildWithoutInvocationCallback() {
            CreatePreauthenticatedRequestRequest request =
                    new CreatePreauthenticatedRequestRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.createPreauthenticatedRequestDetails = createPreauthenticatedRequestDetails;
            request.opcClientRequestId = opcClientRequestId;
            return request;
            // new CreatePreauthenticatedRequestRequest(namespaceName, bucketName,
            // createPreauthenticatedRequestDetails, opcClientRequestId);
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
                .createPreauthenticatedRequestDetails(createPreauthenticatedRequestDetails)
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
        sb.append(",createPreauthenticatedRequestDetails=")
                .append(String.valueOf(this.createPreauthenticatedRequestDetails));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePreauthenticatedRequestRequest)) {
            return false;
        }

        CreatePreauthenticatedRequestRequest other = (CreatePreauthenticatedRequestRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(
                        this.createPreauthenticatedRequestDetails,
                        other.createPreauthenticatedRequestDetails)
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
        result =
                (result * PRIME)
                        + (this.createPreauthenticatedRequestDetails == null
                                ? 43
                                : this.createPreauthenticatedRequestDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        return result;
    }
}
