/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.requests;

import com.oracle.bmc.goldengate.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/goldengate/TestPipelineConnectionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * TestPipelineConnectionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class TestPipelineConnectionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.goldengate.model.TestPipelineConnectionDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * pipeline created.
     */
    private String pipelineId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * pipeline created.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    /** Additional metadata required to test the connection assigned to the pipeline. */
    private com.oracle.bmc.goldengate.model.TestPipelineConnectionDetails
            testPipelineConnectionDetails;

    /** Additional metadata required to test the connection assigned to the pipeline. */
    public com.oracle.bmc.goldengate.model.TestPipelineConnectionDetails
            getTestPipelineConnectionDetails() {
        return testPipelineConnectionDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A token that uniquely identifies a request so it can be retried, in case of a timeout or
     * server error, without the risk of executing that same action again. Retry tokens expire after
     * 24 hours but can be invalidated before then due to conflicting operations. For example, if a
     * resource was deleted and purged from the system, then a retry of the original creation
     * request is rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried, in case of a timeout or
     * server error, without the risk of executing that same action again. Retry tokens expire after
     * 24 hours but can be invalidated before then due to conflicting operations. For example, if a
     * resource was deleted and purged from the system, then a retry of the original creation
     * request is rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.goldengate.model.TestPipelineConnectionDetails getBody$() {
        return testPipelineConnectionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    TestPipelineConnectionRequest,
                    com.oracle.bmc.goldengate.model.TestPipelineConnectionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * pipeline created.
         */
        private String pipelineId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * pipeline created.
         *
         * @param pipelineId the value to set
         * @return this builder instance
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /** Additional metadata required to test the connection assigned to the pipeline. */
        private com.oracle.bmc.goldengate.model.TestPipelineConnectionDetails
                testPipelineConnectionDetails = null;

        /**
         * Additional metadata required to test the connection assigned to the pipeline.
         *
         * @param testPipelineConnectionDetails the value to set
         * @return this builder instance
         */
        public Builder testPipelineConnectionDetails(
                com.oracle.bmc.goldengate.model.TestPipelineConnectionDetails
                        testPipelineConnectionDetails) {
            this.testPipelineConnectionDetails = testPipelineConnectionDetails;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried, in case of a timeout or
         * server error, without the risk of executing that same action again. Retry tokens expire
         * after 24 hours but can be invalidated before then due to conflicting operations. For
         * example, if a resource was deleted and purged from the system, then a retry of the
         * original creation request is rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried, in case of a timeout or
         * server error, without the risk of executing that same action again. Retry tokens expire
         * after 24 hours but can be invalidated before then due to conflicting operations. For
         * example, if a resource was deleted and purged from the system, then a retry of the
         * original creation request is rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(TestPipelineConnectionRequest o) {
            pipelineId(o.getPipelineId());
            testPipelineConnectionDetails(o.getTestPipelineConnectionDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of TestPipelineConnectionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of TestPipelineConnectionRequest
         */
        public TestPipelineConnectionRequest build() {
            TestPipelineConnectionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.goldengate.model.TestPipelineConnectionDetails body) {
            testPipelineConnectionDetails(body);
            return this;
        }

        /**
         * Build the instance of TestPipelineConnectionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of TestPipelineConnectionRequest
         */
        public TestPipelineConnectionRequest buildWithoutInvocationCallback() {
            TestPipelineConnectionRequest request = new TestPipelineConnectionRequest();
            request.pipelineId = pipelineId;
            request.testPipelineConnectionDetails = testPipelineConnectionDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new TestPipelineConnectionRequest(pipelineId, testPipelineConnectionDetails,
            // opcRequestId, ifMatch, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .pipelineId(pipelineId)
                .testPipelineConnectionDetails(testPipelineConnectionDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",pipelineId=").append(String.valueOf(this.pipelineId));
        sb.append(",testPipelineConnectionDetails=")
                .append(String.valueOf(this.testPipelineConnectionDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestPipelineConnectionRequest)) {
            return false;
        }

        TestPipelineConnectionRequest other = (TestPipelineConnectionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.pipelineId, other.pipelineId)
                && java.util.Objects.equals(
                        this.testPipelineConnectionDetails, other.testPipelineConnectionDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.pipelineId == null ? 43 : this.pipelineId.hashCode());
        result =
                (result * PRIME)
                        + (this.testPipelineConnectionDetails == null
                                ? 43
                                : this.testPipelineConnectionDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
