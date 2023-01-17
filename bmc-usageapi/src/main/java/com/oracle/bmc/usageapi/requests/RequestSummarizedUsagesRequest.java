/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.requests;

import com.oracle.bmc.usageapi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/usageapi/RequestSummarizedUsagesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RequestSummarizedUsagesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
public class RequestSummarizedUsagesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.usageapi.model.RequestSummarizedUsagesDetails> {

    /**
     * getUsageRequest contains query inforamtion.
     *
     */
    private com.oracle.bmc.usageapi.model.RequestSummarizedUsagesDetails
            requestSummarizedUsagesDetails;

    /**
     * getUsageRequest contains query inforamtion.
     *
     */
    public com.oracle.bmc.usageapi.model.RequestSummarizedUsagesDetails
            getRequestSummarizedUsagesDetails() {
        return requestSummarizedUsagesDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The page token representing the page at which to start retrieving results.
     * This is usually retrieved from a previous list call.
     *
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results.
     * This is usually retrieved from a previous list call.
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The maximumimum number of items to return.
     */
    private Integer limit;

    /**
     * The maximumimum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.usageapi.model.RequestSummarizedUsagesDetails getBody$() {
        return requestSummarizedUsagesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RequestSummarizedUsagesRequest,
                    com.oracle.bmc.usageapi.model.RequestSummarizedUsagesDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * getUsageRequest contains query inforamtion.
         *
         */
        private com.oracle.bmc.usageapi.model.RequestSummarizedUsagesDetails
                requestSummarizedUsagesDetails = null;

        /**
         * getUsageRequest contains query inforamtion.
         *
         * @param requestSummarizedUsagesDetails the value to set
         * @return this builder instance
         */
        public Builder requestSummarizedUsagesDetails(
                com.oracle.bmc.usageapi.model.RequestSummarizedUsagesDetails
                        requestSummarizedUsagesDetails) {
            this.requestSummarizedUsagesDetails = requestSummarizedUsagesDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results.
         * This is usually retrieved from a previous list call.
         *
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results.
         * This is usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The maximumimum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximumimum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
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
        public Builder copy(RequestSummarizedUsagesRequest o) {
            requestSummarizedUsagesDetails(o.getRequestSummarizedUsagesDetails());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RequestSummarizedUsagesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RequestSummarizedUsagesRequest
         */
        public RequestSummarizedUsagesRequest build() {
            RequestSummarizedUsagesRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.usageapi.model.RequestSummarizedUsagesDetails body) {
            requestSummarizedUsagesDetails(body);
            return this;
        }

        /**
         * Build the instance of RequestSummarizedUsagesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RequestSummarizedUsagesRequest
         */
        public RequestSummarizedUsagesRequest buildWithoutInvocationCallback() {
            RequestSummarizedUsagesRequest request = new RequestSummarizedUsagesRequest();
            request.requestSummarizedUsagesDetails = requestSummarizedUsagesDetails;
            request.opcRequestId = opcRequestId;
            request.page = page;
            request.limit = limit;
            return request;
            // new RequestSummarizedUsagesRequest(requestSummarizedUsagesDetails, opcRequestId, page, limit);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .requestSummarizedUsagesDetails(requestSummarizedUsagesDetails)
                .opcRequestId(opcRequestId)
                .page(page)
                .limit(limit);
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
        sb.append(",requestSummarizedUsagesDetails=")
                .append(String.valueOf(this.requestSummarizedUsagesDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestSummarizedUsagesRequest)) {
            return false;
        }

        RequestSummarizedUsagesRequest other = (RequestSummarizedUsagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.requestSummarizedUsagesDetails, other.requestSummarizedUsagesDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.requestSummarizedUsagesDetails == null
                                ? 43
                                : this.requestSummarizedUsagesDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        return result;
    }
}
