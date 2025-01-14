/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocicontrolcenter.requests;

import com.oracle.bmc.ocicontrolcenter.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ocicontrolcenter/RequestSummarizedMetricDataExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RequestSummarizedMetricDataRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230515")
public class RequestSummarizedMetricDataRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ocicontrolcenter.model.RequestSummarizedMetricDataDetails> {

    /** Filters to apply to the metric data query */
    private com.oracle.bmc.ocicontrolcenter.model.RequestSummarizedMetricDataDetails
            requestSummarizedMetricDataDetails;

    /** Filters to apply to the metric data query */
    public com.oracle.bmc.ocicontrolcenter.model.RequestSummarizedMetricDataDetails
            getRequestSummarizedMetricDataDetails() {
        return requestSummarizedMetricDataDetails;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see <a
     * href="https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine">List
     * Pagination</a>.
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see <a
     * href="https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine">List
     * Pagination</a>.
     */
    public String getPage() {
        return page;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call.
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a
     * particular request, please provide the complete request ID.
     */
    private String opcRequestId;

    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a
     * particular request, please provide the complete request ID.
     */
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
    public com.oracle.bmc.ocicontrolcenter.model.RequestSummarizedMetricDataDetails getBody$() {
        return requestSummarizedMetricDataDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RequestSummarizedMetricDataRequest,
                    com.oracle.bmc.ocicontrolcenter.model.RequestSummarizedMetricDataDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Filters to apply to the metric data query */
        private com.oracle.bmc.ocicontrolcenter.model.RequestSummarizedMetricDataDetails
                requestSummarizedMetricDataDetails = null;

        /**
         * Filters to apply to the metric data query
         *
         * @param requestSummarizedMetricDataDetails the value to set
         * @return this builder instance
         */
        public Builder requestSummarizedMetricDataDetails(
                com.oracle.bmc.ocicontrolcenter.model.RequestSummarizedMetricDataDetails
                        requestSummarizedMetricDataDetails) {
            this.requestSummarizedMetricDataDetails = requestSummarizedMetricDataDetails;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see <a
         * href="https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine">List
         * Pagination</a>.
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see <a
         * href="https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine">List
         * Pagination</a>.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call.
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Customer part of the request identifier token. If you need to contact Oracle about a
         * particular request, please provide the complete request ID.
         */
        private String opcRequestId = null;

        /**
         * Customer part of the request identifier token. If you need to contact Oracle about a
         * particular request, please provide the complete request ID.
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
        public Builder copy(RequestSummarizedMetricDataRequest o) {
            requestSummarizedMetricDataDetails(o.getRequestSummarizedMetricDataDetails());
            page(o.getPage());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RequestSummarizedMetricDataRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RequestSummarizedMetricDataRequest
         */
        public RequestSummarizedMetricDataRequest build() {
            RequestSummarizedMetricDataRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.ocicontrolcenter.model.RequestSummarizedMetricDataDetails body) {
            requestSummarizedMetricDataDetails(body);
            return this;
        }

        /**
         * Build the instance of RequestSummarizedMetricDataRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RequestSummarizedMetricDataRequest
         */
        public RequestSummarizedMetricDataRequest buildWithoutInvocationCallback() {
            RequestSummarizedMetricDataRequest request = new RequestSummarizedMetricDataRequest();
            request.requestSummarizedMetricDataDetails = requestSummarizedMetricDataDetails;
            request.page = page;
            request.limit = limit;
            request.opcRequestId = opcRequestId;
            return request;
            // new RequestSummarizedMetricDataRequest(requestSummarizedMetricDataDetails, page,
            // limit, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .requestSummarizedMetricDataDetails(requestSummarizedMetricDataDetails)
                .page(page)
                .limit(limit)
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
        sb.append(",requestSummarizedMetricDataDetails=")
                .append(String.valueOf(this.requestSummarizedMetricDataDetails));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestSummarizedMetricDataRequest)) {
            return false;
        }

        RequestSummarizedMetricDataRequest other = (RequestSummarizedMetricDataRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.requestSummarizedMetricDataDetails,
                        other.requestSummarizedMetricDataDetails)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.requestSummarizedMetricDataDetails == null
                                ? 43
                                : this.requestSummarizedMetricDataDetails.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
