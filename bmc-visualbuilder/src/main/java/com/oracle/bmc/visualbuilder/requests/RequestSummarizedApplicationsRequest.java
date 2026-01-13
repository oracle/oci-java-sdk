/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.requests;

import com.oracle.bmc.visualbuilder.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/visualbuilder/RequestSummarizedApplicationsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RequestSummarizedApplicationsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
public class RequestSummarizedApplicationsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.visualbuilder.model.RequestSummarizedApplicationsDetails> {

    /**
     * The parameter holding information to request the summarized applications for a Vb instance
     */
    private com.oracle.bmc.visualbuilder.model.RequestSummarizedApplicationsDetails
            requestSummarizedApplicationsDetails;

    /**
     * The parameter holding information to request the summarized applications for a Vb instance
     */
    public com.oracle.bmc.visualbuilder.model.RequestSummarizedApplicationsDetails
            getRequestSummarizedApplicationsDetails() {
        return requestSummarizedApplicationsDetails;
    }
    /** Unique Vb Instance identifier. */
    private String vbInstanceId;

    /** Unique Vb Instance identifier. */
    public String getVbInstanceId() {
        return vbInstanceId;
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
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
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
    public com.oracle.bmc.visualbuilder.model.RequestSummarizedApplicationsDetails getBody$() {
        return requestSummarizedApplicationsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RequestSummarizedApplicationsRequest,
                    com.oracle.bmc.visualbuilder.model.RequestSummarizedApplicationsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The parameter holding information to request the summarized applications for a Vb
         * instance
         */
        private com.oracle.bmc.visualbuilder.model.RequestSummarizedApplicationsDetails
                requestSummarizedApplicationsDetails = null;

        /**
         * The parameter holding information to request the summarized applications for a Vb
         * instance
         *
         * @param requestSummarizedApplicationsDetails the value to set
         * @return this builder instance
         */
        public Builder requestSummarizedApplicationsDetails(
                com.oracle.bmc.visualbuilder.model.RequestSummarizedApplicationsDetails
                        requestSummarizedApplicationsDetails) {
            this.requestSummarizedApplicationsDetails = requestSummarizedApplicationsDetails;
            return this;
        }

        /** Unique Vb Instance identifier. */
        private String vbInstanceId = null;

        /**
         * Unique Vb Instance identifier.
         *
         * @param vbInstanceId the value to set
         * @return this builder instance
         */
        public Builder vbInstanceId(String vbInstanceId) {
            this.vbInstanceId = vbInstanceId;
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
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
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
        public Builder copy(RequestSummarizedApplicationsRequest o) {
            requestSummarizedApplicationsDetails(o.getRequestSummarizedApplicationsDetails());
            vbInstanceId(o.getVbInstanceId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RequestSummarizedApplicationsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RequestSummarizedApplicationsRequest
         */
        public RequestSummarizedApplicationsRequest build() {
            RequestSummarizedApplicationsRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.visualbuilder.model.RequestSummarizedApplicationsDetails body) {
            requestSummarizedApplicationsDetails(body);
            return this;
        }

        /**
         * Build the instance of RequestSummarizedApplicationsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RequestSummarizedApplicationsRequest
         */
        public RequestSummarizedApplicationsRequest buildWithoutInvocationCallback() {
            RequestSummarizedApplicationsRequest request =
                    new RequestSummarizedApplicationsRequest();
            request.requestSummarizedApplicationsDetails = requestSummarizedApplicationsDetails;
            request.vbInstanceId = vbInstanceId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new RequestSummarizedApplicationsRequest(requestSummarizedApplicationsDetails,
            // vbInstanceId, opcRequestId, ifMatch, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .requestSummarizedApplicationsDetails(requestSummarizedApplicationsDetails)
                .vbInstanceId(vbInstanceId)
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
        sb.append(",requestSummarizedApplicationsDetails=")
                .append(String.valueOf(this.requestSummarizedApplicationsDetails));
        sb.append(",vbInstanceId=").append(String.valueOf(this.vbInstanceId));
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
        if (!(o instanceof RequestSummarizedApplicationsRequest)) {
            return false;
        }

        RequestSummarizedApplicationsRequest other = (RequestSummarizedApplicationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.requestSummarizedApplicationsDetails,
                        other.requestSummarizedApplicationsDetails)
                && java.util.Objects.equals(this.vbInstanceId, other.vbInstanceId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.requestSummarizedApplicationsDetails == null
                                ? 43
                                : this.requestSummarizedApplicationsDetails.hashCode());
        result = (result * PRIME) + (this.vbInstanceId == null ? 43 : this.vbInstanceId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
