/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.requests;

import com.oracle.bmc.apmtraces.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/QueryExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use QueryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class QueryRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.apmtraces.model.QueryDetails> {

    /**
     * The APM Domain ID the request is intended for.
     *
     */
    private String apmDomainId;

    public String getApmDomainId() {
        return apmDomainId;
    }
    /**
     * Include spans that have a {@code spanStartTime} equal to or greater than this value.
     *
     */
    private java.util.Date timeSpanStartedGreaterThanOrEqualTo;

    public java.util.Date getTimeSpanStartedGreaterThanOrEqualTo() {
        return timeSpanStartedGreaterThanOrEqualTo;
    }
    /**
     * Include spans that have a {@code spanStartTime}less than this value.
     *
     */
    private java.util.Date timeSpanStartedLessThan;

    public java.util.Date getTimeSpanStartedLessThan() {
        return timeSpanStartedLessThan;
    }
    /**
     * Request body containing the query to be run against the trace data and to filter and
     * retrieve trace data results.
     *
     */
    private com.oracle.bmc.apmtraces.model.QueryDetails queryDetails;

    public com.oracle.bmc.apmtraces.model.QueryDetails getQueryDetails() {
        return queryDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The maximum number of items to return.
     *
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results.
     * This is usually retrieved from a previous response.
     *
     */
    private String page;

    public String getPage() {
        return page;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.apmtraces.model.QueryDetails getBody$() {
        return queryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    QueryRequest, com.oracle.bmc.apmtraces.model.QueryDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String apmDomainId = null;

        /**
         * The APM Domain ID the request is intended for.
         *
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        private java.util.Date timeSpanStartedGreaterThanOrEqualTo = null;

        /**
         * Include spans that have a {@code spanStartTime} equal to or greater than this value.
         *
         * @return this builder instance
         */
        public Builder timeSpanStartedGreaterThanOrEqualTo(
                java.util.Date timeSpanStartedGreaterThanOrEqualTo) {
            this.timeSpanStartedGreaterThanOrEqualTo = timeSpanStartedGreaterThanOrEqualTo;
            return this;
        }

        private java.util.Date timeSpanStartedLessThan = null;

        /**
         * Include spans that have a {@code spanStartTime}less than this value.
         *
         * @return this builder instance
         */
        public Builder timeSpanStartedLessThan(java.util.Date timeSpanStartedLessThan) {
            this.timeSpanStartedLessThan = timeSpanStartedLessThan;
            return this;
        }

        private com.oracle.bmc.apmtraces.model.QueryDetails queryDetails = null;

        /**
         * Request body containing the query to be run against the trace data and to filter and
         * retrieve trace data results.
         *
         * @return this builder instance
         */
        public Builder queryDetails(com.oracle.bmc.apmtraces.model.QueryDetails queryDetails) {
            this.queryDetails = queryDetails;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results.
         * This is usually retrieved from a previous response.
         *
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
        public Builder copy(QueryRequest o) {
            apmDomainId(o.getApmDomainId());
            timeSpanStartedGreaterThanOrEqualTo(o.getTimeSpanStartedGreaterThanOrEqualTo());
            timeSpanStartedLessThan(o.getTimeSpanStartedLessThan());
            queryDetails(o.getQueryDetails());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of QueryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of QueryRequest
         */
        public QueryRequest build() {
            QueryRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.apmtraces.model.QueryDetails body) {
            queryDetails(body);
            return this;
        }

        /**
         * Build the instance of QueryRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of QueryRequest
         */
        public QueryRequest buildWithoutInvocationCallback() {
            QueryRequest request = new QueryRequest();
            request.apmDomainId = apmDomainId;
            request.timeSpanStartedGreaterThanOrEqualTo = timeSpanStartedGreaterThanOrEqualTo;
            request.timeSpanStartedLessThan = timeSpanStartedLessThan;
            request.queryDetails = queryDetails;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            return request;
            // new QueryRequest(apmDomainId, timeSpanStartedGreaterThanOrEqualTo, timeSpanStartedLessThan, queryDetails, opcRequestId, limit, page);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .timeSpanStartedGreaterThanOrEqualTo(timeSpanStartedGreaterThanOrEqualTo)
                .timeSpanStartedLessThan(timeSpanStartedLessThan)
                .queryDetails(queryDetails)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",timeSpanStartedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeSpanStartedGreaterThanOrEqualTo));
        sb.append(",timeSpanStartedLessThan=").append(String.valueOf(this.timeSpanStartedLessThan));
        sb.append(",queryDetails=").append(String.valueOf(this.queryDetails));
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
        if (!(o instanceof QueryRequest)) {
            return false;
        }

        QueryRequest other = (QueryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(
                        this.timeSpanStartedGreaterThanOrEqualTo,
                        other.timeSpanStartedGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeSpanStartedLessThan, other.timeSpanStartedLessThan)
                && java.util.Objects.equals(this.queryDetails, other.queryDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSpanStartedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeSpanStartedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSpanStartedLessThan == null
                                ? 43
                                : this.timeSpanStartedLessThan.hashCode());
        result = (result * PRIME) + (this.queryDetails == null ? 43 : this.queryDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
