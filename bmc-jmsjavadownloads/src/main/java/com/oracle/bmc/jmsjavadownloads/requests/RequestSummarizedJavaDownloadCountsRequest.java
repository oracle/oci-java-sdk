/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.requests;

import com.oracle.bmc.jmsjavadownloads.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jmsjavadownloads/RequestSummarizedJavaDownloadCountsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RequestSummarizedJavaDownloadCountsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
public class RequestSummarizedJavaDownloadCountsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.jmsjavadownloads.model.RequestSummarizedJavaDownloadCountsDetails> {

    /**
     * Details for retreiving the summary of download counts.
     */
    private com.oracle.bmc.jmsjavadownloads.model.RequestSummarizedJavaDownloadCountsDetails
            requestSummarizedJavaDownloadCountsDetails;

    /**
     * Details for retreiving the summary of download counts.
     */
    public com.oracle.bmc.jmsjavadownloads.model.RequestSummarizedJavaDownloadCountsDetails
            getRequestSummarizedJavaDownloadCountsDetails() {
        return requestSummarizedJavaDownloadCountsDetails;
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
    public com.oracle.bmc.jmsjavadownloads.model.RequestSummarizedJavaDownloadCountsDetails
            getBody$() {
        return requestSummarizedJavaDownloadCountsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RequestSummarizedJavaDownloadCountsRequest,
                    com.oracle.bmc.jmsjavadownloads.model
                            .RequestSummarizedJavaDownloadCountsDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details for retreiving the summary of download counts.
         */
        private com.oracle.bmc.jmsjavadownloads.model.RequestSummarizedJavaDownloadCountsDetails
                requestSummarizedJavaDownloadCountsDetails = null;

        /**
         * Details for retreiving the summary of download counts.
         * @param requestSummarizedJavaDownloadCountsDetails the value to set
         * @return this builder instance
         */
        public Builder requestSummarizedJavaDownloadCountsDetails(
                com.oracle.bmc.jmsjavadownloads.model.RequestSummarizedJavaDownloadCountsDetails
                        requestSummarizedJavaDownloadCountsDetails) {
            this.requestSummarizedJavaDownloadCountsDetails =
                    requestSummarizedJavaDownloadCountsDetails;
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
        public Builder copy(RequestSummarizedJavaDownloadCountsRequest o) {
            requestSummarizedJavaDownloadCountsDetails(
                    o.getRequestSummarizedJavaDownloadCountsDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RequestSummarizedJavaDownloadCountsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RequestSummarizedJavaDownloadCountsRequest
         */
        public RequestSummarizedJavaDownloadCountsRequest build() {
            RequestSummarizedJavaDownloadCountsRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.jmsjavadownloads.model.RequestSummarizedJavaDownloadCountsDetails
                        body) {
            requestSummarizedJavaDownloadCountsDetails(body);
            return this;
        }

        /**
         * Build the instance of RequestSummarizedJavaDownloadCountsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RequestSummarizedJavaDownloadCountsRequest
         */
        public RequestSummarizedJavaDownloadCountsRequest buildWithoutInvocationCallback() {
            RequestSummarizedJavaDownloadCountsRequest request =
                    new RequestSummarizedJavaDownloadCountsRequest();
            request.requestSummarizedJavaDownloadCountsDetails =
                    requestSummarizedJavaDownloadCountsDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new RequestSummarizedJavaDownloadCountsRequest(requestSummarizedJavaDownloadCountsDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .requestSummarizedJavaDownloadCountsDetails(
                        requestSummarizedJavaDownloadCountsDetails)
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
        sb.append(",requestSummarizedJavaDownloadCountsDetails=")
                .append(String.valueOf(this.requestSummarizedJavaDownloadCountsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestSummarizedJavaDownloadCountsRequest)) {
            return false;
        }

        RequestSummarizedJavaDownloadCountsRequest other =
                (RequestSummarizedJavaDownloadCountsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.requestSummarizedJavaDownloadCountsDetails,
                        other.requestSummarizedJavaDownloadCountsDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.requestSummarizedJavaDownloadCountsDetails == null
                                ? 43
                                : this.requestSummarizedJavaDownloadCountsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
