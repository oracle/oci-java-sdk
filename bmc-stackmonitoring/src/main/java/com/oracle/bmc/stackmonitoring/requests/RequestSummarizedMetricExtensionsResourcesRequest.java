/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/RequestSummarizedMetricExtensionsResourcesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RequestSummarizedMetricExtensionsResourcesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class RequestSummarizedMetricExtensionsResourcesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.stackmonitoring.model
                        .RequestSummarizedMetricExtensionsResourcesDetails> {

    /**
     * Summarize Resource details to filter the data that match the criteria specified in the
     * request.
     */
    private com.oracle.bmc.stackmonitoring.model.RequestSummarizedMetricExtensionsResourcesDetails
            requestSummarizedMetricExtensionsResourcesDetails;

    /**
     * Summarize Resource details to filter the data that match the criteria specified in the
     * request.
     */
    public com.oracle.bmc.stackmonitoring.model.RequestSummarizedMetricExtensionsResourcesDetails
            getRequestSummarizedMetricExtensionsResourcesDetails() {
        return requestSummarizedMetricExtensionsResourcesDetails;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.stackmonitoring.model.RequestSummarizedMetricExtensionsResourcesDetails
            getBody$() {
        return requestSummarizedMetricExtensionsResourcesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RequestSummarizedMetricExtensionsResourcesRequest,
                    com.oracle.bmc.stackmonitoring.model
                            .RequestSummarizedMetricExtensionsResourcesDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Summarize Resource details to filter the data that match the criteria specified in the
         * request.
         */
        private com.oracle.bmc.stackmonitoring.model
                        .RequestSummarizedMetricExtensionsResourcesDetails
                requestSummarizedMetricExtensionsResourcesDetails = null;

        /**
         * Summarize Resource details to filter the data that match the criteria specified in the
         * request.
         *
         * @param requestSummarizedMetricExtensionsResourcesDetails the value to set
         * @return this builder instance
         */
        public Builder requestSummarizedMetricExtensionsResourcesDetails(
                com.oracle.bmc.stackmonitoring.model
                                .RequestSummarizedMetricExtensionsResourcesDetails
                        requestSummarizedMetricExtensionsResourcesDetails) {
            this.requestSummarizedMetricExtensionsResourcesDetails =
                    requestSummarizedMetricExtensionsResourcesDetails;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(RequestSummarizedMetricExtensionsResourcesRequest o) {
            requestSummarizedMetricExtensionsResourcesDetails(
                    o.getRequestSummarizedMetricExtensionsResourcesDetails());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RequestSummarizedMetricExtensionsResourcesRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RequestSummarizedMetricExtensionsResourcesRequest
         */
        public RequestSummarizedMetricExtensionsResourcesRequest build() {
            RequestSummarizedMetricExtensionsResourcesRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.stackmonitoring.model
                                .RequestSummarizedMetricExtensionsResourcesDetails
                        body) {
            requestSummarizedMetricExtensionsResourcesDetails(body);
            return this;
        }

        /**
         * Build the instance of RequestSummarizedMetricExtensionsResourcesRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RequestSummarizedMetricExtensionsResourcesRequest
         */
        public RequestSummarizedMetricExtensionsResourcesRequest buildWithoutInvocationCallback() {
            RequestSummarizedMetricExtensionsResourcesRequest request =
                    new RequestSummarizedMetricExtensionsResourcesRequest();
            request.requestSummarizedMetricExtensionsResourcesDetails =
                    requestSummarizedMetricExtensionsResourcesDetails;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new
            // RequestSummarizedMetricExtensionsResourcesRequest(requestSummarizedMetricExtensionsResourcesDetails, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .requestSummarizedMetricExtensionsResourcesDetails(
                        requestSummarizedMetricExtensionsResourcesDetails)
                .limit(limit)
                .page(page)
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
        sb.append(",requestSummarizedMetricExtensionsResourcesDetails=")
                .append(String.valueOf(this.requestSummarizedMetricExtensionsResourcesDetails));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestSummarizedMetricExtensionsResourcesRequest)) {
            return false;
        }

        RequestSummarizedMetricExtensionsResourcesRequest other =
                (RequestSummarizedMetricExtensionsResourcesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.requestSummarizedMetricExtensionsResourcesDetails,
                        other.requestSummarizedMetricExtensionsResourcesDetails)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.requestSummarizedMetricExtensionsResourcesDetails == null
                                ? 43
                                : this.requestSummarizedMetricExtensionsResourcesDetails
                                        .hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
