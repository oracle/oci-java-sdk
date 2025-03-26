/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.requests;

import com.oracle.bmc.generativeaiinference.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiinference/SummarizeTextExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeTextRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class SummarizeTextRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.generativeaiinference.model.SummarizeTextDetails> {

    /**
     * Details for summarizing the text.
     */
    private com.oracle.bmc.generativeaiinference.model.SummarizeTextDetails summarizeTextDetails;

    /**
     * Details for summarizing the text.
     */
    public com.oracle.bmc.generativeaiinference.model.SummarizeTextDetails
            getSummarizeTextDetails() {
        return summarizeTextDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before that, in case of conflicting operations. For example, if a resource is deleted and purged from the system, then a retry of the original creation request
     * is rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before that, in case of conflicting operations. For example, if a resource is deleted and purged from the system, then a retry of the original creation request
     * is rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.generativeaiinference.model.SummarizeTextDetails getBody$() {
        return summarizeTextDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeTextRequest,
                    com.oracle.bmc.generativeaiinference.model.SummarizeTextDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details for summarizing the text.
         */
        private com.oracle.bmc.generativeaiinference.model.SummarizeTextDetails
                summarizeTextDetails = null;

        /**
         * Details for summarizing the text.
         * @param summarizeTextDetails the value to set
         * @return this builder instance
         */
        public Builder summarizeTextDetails(
                com.oracle.bmc.generativeaiinference.model.SummarizeTextDetails
                        summarizeTextDetails) {
            this.summarizeTextDetails = summarizeTextDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before that, in case of conflicting operations. For example, if a resource is deleted and purged from the system, then a retry of the original creation request
         * is rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before that, in case of conflicting operations. For example, if a resource is deleted and purged from the system, then a retry of the original creation request
         * is rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(SummarizeTextRequest o) {
            summarizeTextDetails(o.getSummarizeTextDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeTextRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeTextRequest
         */
        public SummarizeTextRequest build() {
            SummarizeTextRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.generativeaiinference.model.SummarizeTextDetails body) {
            summarizeTextDetails(body);
            return this;
        }

        /**
         * Build the instance of SummarizeTextRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeTextRequest
         */
        public SummarizeTextRequest buildWithoutInvocationCallback() {
            SummarizeTextRequest request = new SummarizeTextRequest();
            request.summarizeTextDetails = summarizeTextDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeTextRequest(summarizeTextDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .summarizeTextDetails(summarizeTextDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",summarizeTextDetails=").append(String.valueOf(this.summarizeTextDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeTextRequest)) {
            return false;
        }

        SummarizeTextRequest other = (SummarizeTextRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.summarizeTextDetails, other.summarizeTextDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.summarizeTextDetails == null
                                ? 43
                                : this.summarizeTextDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
