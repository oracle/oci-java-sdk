/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.requests;

import com.oracle.bmc.aivision.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/aivision/ChangeStreamGroupCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeStreamGroupCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class ChangeStreamGroupCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.aivision.model.ChangeStreamGroupCompartmentDetails> {

    /** StreamGroup Id. */
    private String streamGroupId;

    /** StreamGroup Id. */
    public String getStreamGroupId() {
        return streamGroupId;
    }
    /** The details of the move. */
    private com.oracle.bmc.aivision.model.ChangeStreamGroupCompartmentDetails
            changeStreamGroupCompartmentDetails;

    /** The details of the move. */
    public com.oracle.bmc.aivision.model.ChangeStreamGroupCompartmentDetails
            getChangeStreamGroupCompartmentDetails() {
        return changeStreamGroupCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
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
    public com.oracle.bmc.aivision.model.ChangeStreamGroupCompartmentDetails getBody$() {
        return changeStreamGroupCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeStreamGroupCompartmentRequest,
                    com.oracle.bmc.aivision.model.ChangeStreamGroupCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** StreamGroup Id. */
        private String streamGroupId = null;

        /**
         * StreamGroup Id.
         *
         * @param streamGroupId the value to set
         * @return this builder instance
         */
        public Builder streamGroupId(String streamGroupId) {
            this.streamGroupId = streamGroupId;
            return this;
        }

        /** The details of the move. */
        private com.oracle.bmc.aivision.model.ChangeStreamGroupCompartmentDetails
                changeStreamGroupCompartmentDetails = null;

        /**
         * The details of the move.
         *
         * @param changeStreamGroupCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeStreamGroupCompartmentDetails(
                com.oracle.bmc.aivision.model.ChangeStreamGroupCompartmentDetails
                        changeStreamGroupCompartmentDetails) {
            this.changeStreamGroupCompartmentDetails = changeStreamGroupCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
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
        public Builder copy(ChangeStreamGroupCompartmentRequest o) {
            streamGroupId(o.getStreamGroupId());
            changeStreamGroupCompartmentDetails(o.getChangeStreamGroupCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeStreamGroupCompartmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeStreamGroupCompartmentRequest
         */
        public ChangeStreamGroupCompartmentRequest build() {
            ChangeStreamGroupCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.aivision.model.ChangeStreamGroupCompartmentDetails body) {
            changeStreamGroupCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeStreamGroupCompartmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeStreamGroupCompartmentRequest
         */
        public ChangeStreamGroupCompartmentRequest buildWithoutInvocationCallback() {
            ChangeStreamGroupCompartmentRequest request = new ChangeStreamGroupCompartmentRequest();
            request.streamGroupId = streamGroupId;
            request.changeStreamGroupCompartmentDetails = changeStreamGroupCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeStreamGroupCompartmentRequest(streamGroupId,
            // changeStreamGroupCompartmentDetails, ifMatch, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .streamGroupId(streamGroupId)
                .changeStreamGroupCompartmentDetails(changeStreamGroupCompartmentDetails)
                .ifMatch(ifMatch)
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
        sb.append(",streamGroupId=").append(String.valueOf(this.streamGroupId));
        sb.append(",changeStreamGroupCompartmentDetails=")
                .append(String.valueOf(this.changeStreamGroupCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
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
        if (!(o instanceof ChangeStreamGroupCompartmentRequest)) {
            return false;
        }

        ChangeStreamGroupCompartmentRequest other = (ChangeStreamGroupCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.streamGroupId, other.streamGroupId)
                && java.util.Objects.equals(
                        this.changeStreamGroupCompartmentDetails,
                        other.changeStreamGroupCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.streamGroupId == null ? 43 : this.streamGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeStreamGroupCompartmentDetails == null
                                ? 43
                                : this.changeStreamGroupCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
