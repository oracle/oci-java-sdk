/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.requests;

import com.oracle.bmc.opensearch.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opensearch/ResizeOpensearchClusterVerticalExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ResizeOpensearchClusterVerticalRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class ResizeOpensearchClusterVerticalRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opensearch.model.ResizeOpensearchClusterVerticalDetails> {

    /**
     * unique OpensearchCluster identifier
     */
    private String opensearchClusterId;

    /**
     * unique OpensearchCluster identifier
     */
    public String getOpensearchClusterId() {
        return opensearchClusterId;
    }
    /**
     * Resize the opensearch cluster vertical details.
     */
    private com.oracle.bmc.opensearch.model.ResizeOpensearchClusterVerticalDetails
            resizeOpensearchClusterVerticalDetails;

    /**
     * Resize the opensearch cluster vertical details.
     */
    public com.oracle.bmc.opensearch.model.ResizeOpensearchClusterVerticalDetails
            getResizeOpensearchClusterVerticalDetails() {
        return resizeOpensearchClusterVerticalDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
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
    public com.oracle.bmc.opensearch.model.ResizeOpensearchClusterVerticalDetails getBody$() {
        return resizeOpensearchClusterVerticalDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ResizeOpensearchClusterVerticalRequest,
                    com.oracle.bmc.opensearch.model.ResizeOpensearchClusterVerticalDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * unique OpensearchCluster identifier
         */
        private String opensearchClusterId = null;

        /**
         * unique OpensearchCluster identifier
         * @param opensearchClusterId the value to set
         * @return this builder instance
         */
        public Builder opensearchClusterId(String opensearchClusterId) {
            this.opensearchClusterId = opensearchClusterId;
            return this;
        }

        /**
         * Resize the opensearch cluster vertical details.
         */
        private com.oracle.bmc.opensearch.model.ResizeOpensearchClusterVerticalDetails
                resizeOpensearchClusterVerticalDetails = null;

        /**
         * Resize the opensearch cluster vertical details.
         * @param resizeOpensearchClusterVerticalDetails the value to set
         * @return this builder instance
         */
        public Builder resizeOpensearchClusterVerticalDetails(
                com.oracle.bmc.opensearch.model.ResizeOpensearchClusterVerticalDetails
                        resizeOpensearchClusterVerticalDetails) {
            this.resizeOpensearchClusterVerticalDetails = resizeOpensearchClusterVerticalDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
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
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
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
        public Builder copy(ResizeOpensearchClusterVerticalRequest o) {
            opensearchClusterId(o.getOpensearchClusterId());
            resizeOpensearchClusterVerticalDetails(o.getResizeOpensearchClusterVerticalDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ResizeOpensearchClusterVerticalRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ResizeOpensearchClusterVerticalRequest
         */
        public ResizeOpensearchClusterVerticalRequest build() {
            ResizeOpensearchClusterVerticalRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.opensearch.model.ResizeOpensearchClusterVerticalDetails body) {
            resizeOpensearchClusterVerticalDetails(body);
            return this;
        }

        /**
         * Build the instance of ResizeOpensearchClusterVerticalRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ResizeOpensearchClusterVerticalRequest
         */
        public ResizeOpensearchClusterVerticalRequest buildWithoutInvocationCallback() {
            ResizeOpensearchClusterVerticalRequest request =
                    new ResizeOpensearchClusterVerticalRequest();
            request.opensearchClusterId = opensearchClusterId;
            request.resizeOpensearchClusterVerticalDetails = resizeOpensearchClusterVerticalDetails;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new ResizeOpensearchClusterVerticalRequest(opensearchClusterId, resizeOpensearchClusterVerticalDetails, ifMatch, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .opensearchClusterId(opensearchClusterId)
                .resizeOpensearchClusterVerticalDetails(resizeOpensearchClusterVerticalDetails)
                .ifMatch(ifMatch)
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
        sb.append(",opensearchClusterId=").append(String.valueOf(this.opensearchClusterId));
        sb.append(",resizeOpensearchClusterVerticalDetails=")
                .append(String.valueOf(this.resizeOpensearchClusterVerticalDetails));
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
        if (!(o instanceof ResizeOpensearchClusterVerticalRequest)) {
            return false;
        }

        ResizeOpensearchClusterVerticalRequest other = (ResizeOpensearchClusterVerticalRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opensearchClusterId, other.opensearchClusterId)
                && java.util.Objects.equals(
                        this.resizeOpensearchClusterVerticalDetails,
                        other.resizeOpensearchClusterVerticalDetails)
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
                        + (this.opensearchClusterId == null
                                ? 43
                                : this.opensearchClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.resizeOpensearchClusterVerticalDetails == null
                                ? 43
                                : this.resizeOpensearchClusterVerticalDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
