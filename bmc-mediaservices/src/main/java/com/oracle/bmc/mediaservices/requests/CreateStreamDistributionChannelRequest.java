/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.requests;

import com.oracle.bmc.mediaservices.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mediaservices/CreateStreamDistributionChannelExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateStreamDistributionChannelRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class CreateStreamDistributionChannelRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.mediaservices.model.CreateStreamDistributionChannelDetails> {

    /** Details for the new Stream Distribution Channel. */
    private com.oracle.bmc.mediaservices.model.CreateStreamDistributionChannelDetails
            createStreamDistributionChannelDetails;

    /** Details for the new Stream Distribution Channel. */
    public com.oracle.bmc.mediaservices.model.CreateStreamDistributionChannelDetails
            getCreateStreamDistributionChannelDetails() {
        return createStreamDistributionChannelDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without the risk of executing that same action again. Retry tokens expire after
     * 24 hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without the risk of executing that same action again. Retry tokens expire after
     * 24 hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.mediaservices.model.CreateStreamDistributionChannelDetails getBody$() {
        return createStreamDistributionChannelDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateStreamDistributionChannelRequest,
                    com.oracle.bmc.mediaservices.model.CreateStreamDistributionChannelDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for the new Stream Distribution Channel. */
        private com.oracle.bmc.mediaservices.model.CreateStreamDistributionChannelDetails
                createStreamDistributionChannelDetails = null;

        /**
         * Details for the new Stream Distribution Channel.
         *
         * @param createStreamDistributionChannelDetails the value to set
         * @return this builder instance
         */
        public Builder createStreamDistributionChannelDetails(
                com.oracle.bmc.mediaservices.model.CreateStreamDistributionChannelDetails
                        createStreamDistributionChannelDetails) {
            this.createStreamDistributionChannelDetails = createStreamDistributionChannelDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without the risk of executing that same action again. Retry tokens expire
         * after 24 hours, but can be invalidated before then due to conflicting operations. For
         * example, if a resource has been deleted and purged from the system, then a retry of the
         * original creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without the risk of executing that same action again. Retry tokens expire
         * after 24 hours, but can be invalidated before then due to conflicting operations. For
         * example, if a resource has been deleted and purged from the system, then a retry of the
         * original creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreateStreamDistributionChannelRequest o) {
            createStreamDistributionChannelDetails(o.getCreateStreamDistributionChannelDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateStreamDistributionChannelRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateStreamDistributionChannelRequest
         */
        public CreateStreamDistributionChannelRequest build() {
            CreateStreamDistributionChannelRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.mediaservices.model.CreateStreamDistributionChannelDetails body) {
            createStreamDistributionChannelDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateStreamDistributionChannelRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateStreamDistributionChannelRequest
         */
        public CreateStreamDistributionChannelRequest buildWithoutInvocationCallback() {
            CreateStreamDistributionChannelRequest request =
                    new CreateStreamDistributionChannelRequest();
            request.createStreamDistributionChannelDetails = createStreamDistributionChannelDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateStreamDistributionChannelRequest(createStreamDistributionChannelDetails,
            // opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createStreamDistributionChannelDetails(createStreamDistributionChannelDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId);
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
        sb.append(",createStreamDistributionChannelDetails=")
                .append(String.valueOf(this.createStreamDistributionChannelDetails));
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
        if (!(o instanceof CreateStreamDistributionChannelRequest)) {
            return false;
        }

        CreateStreamDistributionChannelRequest other = (CreateStreamDistributionChannelRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createStreamDistributionChannelDetails,
                        other.createStreamDistributionChannelDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createStreamDistributionChannelDetails == null
                                ? 43
                                : this.createStreamDistributionChannelDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
