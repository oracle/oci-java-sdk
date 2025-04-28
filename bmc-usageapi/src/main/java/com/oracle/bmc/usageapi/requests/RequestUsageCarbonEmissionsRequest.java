/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.requests;

import com.oracle.bmc.usageapi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/usageapi/RequestUsageCarbonEmissionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RequestUsageCarbonEmissionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
public class RequestUsageCarbonEmissionsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.usageapi.model.RequestUsageCarbonEmissionsDetails> {

    /** getUsageCarbonEmissionRequest contains query inforamtion. */
    private com.oracle.bmc.usageapi.model.RequestUsageCarbonEmissionsDetails
            requestUsageCarbonEmissionsDetails;

    /** getUsageCarbonEmissionRequest contains query inforamtion. */
    public com.oracle.bmc.usageapi.model.RequestUsageCarbonEmissionsDetails
            getRequestUsageCarbonEmissionsDetails() {
        return requestUsageCarbonEmissionsDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The maximumimum number of items to return. */
    private Integer limit;

    /** The maximumimum number of items to return. */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.usageapi.model.RequestUsageCarbonEmissionsDetails getBody$() {
        return requestUsageCarbonEmissionsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RequestUsageCarbonEmissionsRequest,
                    com.oracle.bmc.usageapi.model.RequestUsageCarbonEmissionsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** getUsageCarbonEmissionRequest contains query inforamtion. */
        private com.oracle.bmc.usageapi.model.RequestUsageCarbonEmissionsDetails
                requestUsageCarbonEmissionsDetails = null;

        /**
         * getUsageCarbonEmissionRequest contains query inforamtion.
         *
         * @param requestUsageCarbonEmissionsDetails the value to set
         * @return this builder instance
         */
        public Builder requestUsageCarbonEmissionsDetails(
                com.oracle.bmc.usageapi.model.RequestUsageCarbonEmissionsDetails
                        requestUsageCarbonEmissionsDetails) {
            this.requestUsageCarbonEmissionsDetails = requestUsageCarbonEmissionsDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The maximumimum number of items to return. */
        private Integer limit = null;

        /**
         * The maximumimum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
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
        public Builder copy(RequestUsageCarbonEmissionsRequest o) {
            requestUsageCarbonEmissionsDetails(o.getRequestUsageCarbonEmissionsDetails());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RequestUsageCarbonEmissionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RequestUsageCarbonEmissionsRequest
         */
        public RequestUsageCarbonEmissionsRequest build() {
            RequestUsageCarbonEmissionsRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.usageapi.model.RequestUsageCarbonEmissionsDetails body) {
            requestUsageCarbonEmissionsDetails(body);
            return this;
        }

        /**
         * Build the instance of RequestUsageCarbonEmissionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RequestUsageCarbonEmissionsRequest
         */
        public RequestUsageCarbonEmissionsRequest buildWithoutInvocationCallback() {
            RequestUsageCarbonEmissionsRequest request = new RequestUsageCarbonEmissionsRequest();
            request.requestUsageCarbonEmissionsDetails = requestUsageCarbonEmissionsDetails;
            request.opcRequestId = opcRequestId;
            request.page = page;
            request.limit = limit;
            return request;
            // new RequestUsageCarbonEmissionsRequest(requestUsageCarbonEmissionsDetails,
            // opcRequestId, page, limit);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .requestUsageCarbonEmissionsDetails(requestUsageCarbonEmissionsDetails)
                .opcRequestId(opcRequestId)
                .page(page)
                .limit(limit);
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
        sb.append(",requestUsageCarbonEmissionsDetails=")
                .append(String.valueOf(this.requestUsageCarbonEmissionsDetails));
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
        if (!(o instanceof RequestUsageCarbonEmissionsRequest)) {
            return false;
        }

        RequestUsageCarbonEmissionsRequest other = (RequestUsageCarbonEmissionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.requestUsageCarbonEmissionsDetails,
                        other.requestUsageCarbonEmissionsDetails)
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
                        + (this.requestUsageCarbonEmissionsDetails == null
                                ? 43
                                : this.requestUsageCarbonEmissionsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        return result;
    }
}
