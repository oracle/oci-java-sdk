/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/CreateRetentionRuleExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateRetentionRuleRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateRetentionRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.objectstorage.model.CreateRetentionRuleDetails> {

    /**
     * The Object Storage namespace used for the request.
     */
    private String namespaceName;

    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: {@code my-new-bucket1}
     *
     */
    private String bucketName;

    public String getBucketName() {
        return bucketName;
    }
    /**
     * The retention rule to create for the bucket.
     */
    private com.oracle.bmc.objectstorage.model.CreateRetentionRuleDetails
            createRetentionRuleDetails;

    public com.oracle.bmc.objectstorage.model.CreateRetentionRuleDetails
            getCreateRetentionRuleDetails() {
        return createRetentionRuleDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.objectstorage.model.CreateRetentionRuleDetails getBody$() {
        return createRetentionRuleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateRetentionRuleRequest,
                    com.oracle.bmc.objectstorage.model.CreateRetentionRuleDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String namespaceName = null;

        /**
         * The Object Storage namespace used for the request.
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        private String bucketName = null;

        /**
         * The name of the bucket. Avoid entering confidential information.
         * Example: {@code my-new-bucket1}
         *
         * @return this builder instance
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        private com.oracle.bmc.objectstorage.model.CreateRetentionRuleDetails
                createRetentionRuleDetails = null;

        /**
         * The retention rule to create for the bucket.
         * @return this builder instance
         */
        public Builder createRetentionRuleDetails(
                com.oracle.bmc.objectstorage.model.CreateRetentionRuleDetails
                        createRetentionRuleDetails) {
            this.createRetentionRuleDetails = createRetentionRuleDetails;
            return this;
        }

        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(CreateRetentionRuleRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            createRetentionRuleDetails(o.getCreateRetentionRuleDetails());
            opcClientRequestId(o.getOpcClientRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateRetentionRuleRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateRetentionRuleRequest
         */
        public CreateRetentionRuleRequest build() {
            CreateRetentionRuleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.objectstorage.model.CreateRetentionRuleDetails body) {
            createRetentionRuleDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateRetentionRuleRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateRetentionRuleRequest
         */
        public CreateRetentionRuleRequest buildWithoutInvocationCallback() {
            CreateRetentionRuleRequest request = new CreateRetentionRuleRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.createRetentionRuleDetails = createRetentionRuleDetails;
            request.opcClientRequestId = opcClientRequestId;
            return request;
            // new CreateRetentionRuleRequest(namespaceName, bucketName, createRetentionRuleDetails, opcClientRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .bucketName(bucketName)
                .createRetentionRuleDetails(createRetentionRuleDetails)
                .opcClientRequestId(opcClientRequestId);
    }

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
        sb.append(",createRetentionRuleDetails=")
                .append(String.valueOf(this.createRetentionRuleDetails));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRetentionRuleRequest)) {
            return false;
        }

        CreateRetentionRuleRequest other = (CreateRetentionRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(
                        this.createRetentionRuleDetails, other.createRetentionRuleDetails)
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
                        + (this.createRetentionRuleDetails == null
                                ? 43
                                : this.createRetentionRuleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        return result;
    }
}
