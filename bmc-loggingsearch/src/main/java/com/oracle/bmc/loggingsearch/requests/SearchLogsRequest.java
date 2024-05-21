/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingsearch.requests;

import com.oracle.bmc.loggingsearch.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loggingsearch/SearchLogsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SearchLogsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190909")
public class SearchLogsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loggingsearch.model.SearchLogsDetails> {

    /**
     * Search request.
     *
     */
    private com.oracle.bmc.loggingsearch.model.SearchLogsDetails searchLogsDetails;

    /**
     * Search request.
     *
     */
    public com.oracle.bmc.loggingsearch.model.SearchLogsDetails getSearchLogsDetails() {
        return searchLogsDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The maximum number of items to return in a response. Pagination is not supported in this API.
     *
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a response. Pagination is not supported in this API.
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the opc-next-page response header from the previous "Search" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the opc-next-page response header from the previous "Search" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.loggingsearch.model.SearchLogsDetails getBody$() {
        return searchLogsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SearchLogsRequest, com.oracle.bmc.loggingsearch.model.SearchLogsDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Search request.
         *
         */
        private com.oracle.bmc.loggingsearch.model.SearchLogsDetails searchLogsDetails = null;

        /**
         * Search request.
         *
         * @param searchLogsDetails the value to set
         * @return this builder instance
         */
        public Builder searchLogsDetails(
                com.oracle.bmc.loggingsearch.model.SearchLogsDetails searchLogsDetails) {
            this.searchLogsDetails = searchLogsDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The maximum number of items to return in a response. Pagination is not supported in this API.
         *
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a response. Pagination is not supported in this API.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the opc-next-page response header from the previous "Search" call.
         * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the opc-next-page response header from the previous "Search" call.
         * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(SearchLogsRequest o) {
            searchLogsDetails(o.getSearchLogsDetails());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SearchLogsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SearchLogsRequest
         */
        public SearchLogsRequest build() {
            SearchLogsRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.loggingsearch.model.SearchLogsDetails body) {
            searchLogsDetails(body);
            return this;
        }

        /**
         * Build the instance of SearchLogsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SearchLogsRequest
         */
        public SearchLogsRequest buildWithoutInvocationCallback() {
            SearchLogsRequest request = new SearchLogsRequest();
            request.searchLogsDetails = searchLogsDetails;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            return request;
            // new SearchLogsRequest(searchLogsDetails, opcRequestId, limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .searchLogsDetails(searchLogsDetails)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page);
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
        sb.append(",searchLogsDetails=").append(String.valueOf(this.searchLogsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchLogsRequest)) {
            return false;
        }

        SearchLogsRequest other = (SearchLogsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.searchLogsDetails, other.searchLogsDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.searchLogsDetails == null ? 43 : this.searchLogsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
