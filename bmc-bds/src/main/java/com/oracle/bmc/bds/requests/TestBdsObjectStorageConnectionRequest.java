/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.requests;

import com.oracle.bmc.bds.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/TestBdsObjectStorageConnectionExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use TestBdsObjectStorageConnectionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class TestBdsObjectStorageConnectionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.bds.model.TestBdsObjectStorageConnectionDetails> {

    /**
     * The OCID of the cluster.
     */
    private String bdsInstanceId;

    /**
     * The OCID of the cluster.
     */
    public String getBdsInstanceId() {
        return bdsInstanceId;
    }
    /**
     * The API key identifier.
     */
    private String apiKeyId;

    /**
     * The API key identifier.
     */
    public String getApiKeyId() {
        return apiKeyId;
    }
    /**
     * Parameters required to validate access to the specified Object Storage bucket using the API key.
     */
    private com.oracle.bmc.bds.model.TestBdsObjectStorageConnectionDetails
            testBdsObjectStorageConnectionDetails;

    /**
     * Parameters required to validate access to the specified Object Storage bucket using the API key.
     */
    public com.oracle.bmc.bds.model.TestBdsObjectStorageConnectionDetails
            getTestBdsObjectStorageConnectionDetails() {
        return testBdsObjectStorageConnectionDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.bds.model.TestBdsObjectStorageConnectionDetails getBody$() {
        return testBdsObjectStorageConnectionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    TestBdsObjectStorageConnectionRequest,
                    com.oracle.bmc.bds.model.TestBdsObjectStorageConnectionDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the cluster.
         */
        private String bdsInstanceId = null;

        /**
         * The OCID of the cluster.
         * @param bdsInstanceId the value to set
         * @return this builder instance
         */
        public Builder bdsInstanceId(String bdsInstanceId) {
            this.bdsInstanceId = bdsInstanceId;
            return this;
        }

        /**
         * The API key identifier.
         */
        private String apiKeyId = null;

        /**
         * The API key identifier.
         * @param apiKeyId the value to set
         * @return this builder instance
         */
        public Builder apiKeyId(String apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * Parameters required to validate access to the specified Object Storage bucket using the API key.
         */
        private com.oracle.bmc.bds.model.TestBdsObjectStorageConnectionDetails
                testBdsObjectStorageConnectionDetails = null;

        /**
         * Parameters required to validate access to the specified Object Storage bucket using the API key.
         * @param testBdsObjectStorageConnectionDetails the value to set
         * @return this builder instance
         */
        public Builder testBdsObjectStorageConnectionDetails(
                com.oracle.bmc.bds.model.TestBdsObjectStorageConnectionDetails
                        testBdsObjectStorageConnectionDetails) {
            this.testBdsObjectStorageConnectionDetails = testBdsObjectStorageConnectionDetails;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(TestBdsObjectStorageConnectionRequest o) {
            bdsInstanceId(o.getBdsInstanceId());
            apiKeyId(o.getApiKeyId());
            testBdsObjectStorageConnectionDetails(o.getTestBdsObjectStorageConnectionDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of TestBdsObjectStorageConnectionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of TestBdsObjectStorageConnectionRequest
         */
        public TestBdsObjectStorageConnectionRequest build() {
            TestBdsObjectStorageConnectionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.bds.model.TestBdsObjectStorageConnectionDetails body) {
            testBdsObjectStorageConnectionDetails(body);
            return this;
        }

        /**
         * Build the instance of TestBdsObjectStorageConnectionRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of TestBdsObjectStorageConnectionRequest
         */
        public TestBdsObjectStorageConnectionRequest buildWithoutInvocationCallback() {
            TestBdsObjectStorageConnectionRequest request =
                    new TestBdsObjectStorageConnectionRequest();
            request.bdsInstanceId = bdsInstanceId;
            request.apiKeyId = apiKeyId;
            request.testBdsObjectStorageConnectionDetails = testBdsObjectStorageConnectionDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new TestBdsObjectStorageConnectionRequest(bdsInstanceId, apiKeyId, testBdsObjectStorageConnectionDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bdsInstanceId(bdsInstanceId)
                .apiKeyId(apiKeyId)
                .testBdsObjectStorageConnectionDetails(testBdsObjectStorageConnectionDetails)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",bdsInstanceId=").append(String.valueOf(this.bdsInstanceId));
        sb.append(",apiKeyId=").append(String.valueOf(this.apiKeyId));
        sb.append(",testBdsObjectStorageConnectionDetails=")
                .append(String.valueOf(this.testBdsObjectStorageConnectionDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestBdsObjectStorageConnectionRequest)) {
            return false;
        }

        TestBdsObjectStorageConnectionRequest other = (TestBdsObjectStorageConnectionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bdsInstanceId, other.bdsInstanceId)
                && java.util.Objects.equals(this.apiKeyId, other.apiKeyId)
                && java.util.Objects.equals(
                        this.testBdsObjectStorageConnectionDetails,
                        other.testBdsObjectStorageConnectionDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bdsInstanceId == null ? 43 : this.bdsInstanceId.hashCode());
        result = (result * PRIME) + (this.apiKeyId == null ? 43 : this.apiKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.testBdsObjectStorageConnectionDetails == null
                                ? 43
                                : this.testBdsObjectStorageConnectionDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
