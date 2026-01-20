/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedTrendSecurityScoresExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RequestSummarizedTrendSecurityScoresRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class RequestSummarizedTrendSecurityScoresRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compartment in which to list resources. */
    private String compartmentId;

    /** The OCID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Start time for a filter. If start time is not specified, start time will be set to today's
     * current time - 30 days.
     */
    private java.util.Date timeScoreComputedGreaterThanOrEqualTo;

    /**
     * Start time for a filter. If start time is not specified, start time will be set to today's
     * current time - 30 days.
     */
    public java.util.Date getTimeScoreComputedGreaterThanOrEqualTo() {
        return timeScoreComputedGreaterThanOrEqualTo;
    }
    /**
     * End time for a filter. If end time is not specified, end time will be set to today's current
     * time.
     */
    private java.util.Date timeScoreComputedLessThanOrEqualTo;

    /**
     * End time for a filter. If end time is not specified, end time will be set to today's current
     * time.
     */
    public java.util.Date getTimeScoreComputedLessThanOrEqualTo() {
        return timeScoreComputedLessThanOrEqualTo;
    }
    /** The maximum number of items to return */
    private Integer limit;

    /** The maximum number of items to return */
    public Integer getLimit() {
        return limit;
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
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RequestSummarizedTrendSecurityScoresRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Start time for a filter. If start time is not specified, start time will be set to
         * today's current time - 30 days.
         */
        private java.util.Date timeScoreComputedGreaterThanOrEqualTo = null;

        /**
         * Start time for a filter. If start time is not specified, start time will be set to
         * today's current time - 30 days.
         *
         * @param timeScoreComputedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeScoreComputedGreaterThanOrEqualTo(
                java.util.Date timeScoreComputedGreaterThanOrEqualTo) {
            this.timeScoreComputedGreaterThanOrEqualTo = timeScoreComputedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * End time for a filter. If end time is not specified, end time will be set to today's
         * current time.
         */
        private java.util.Date timeScoreComputedLessThanOrEqualTo = null;

        /**
         * End time for a filter. If end time is not specified, end time will be set to today's
         * current time.
         *
         * @param timeScoreComputedLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeScoreComputedLessThanOrEqualTo(
                java.util.Date timeScoreComputedLessThanOrEqualTo) {
            this.timeScoreComputedLessThanOrEqualTo = timeScoreComputedLessThanOrEqualTo;
            return this;
        }

        /** The maximum number of items to return */
        private Integer limit = null;

        /**
         * The maximum number of items to return
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
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
        public Builder copy(RequestSummarizedTrendSecurityScoresRequest o) {
            compartmentId(o.getCompartmentId());
            timeScoreComputedGreaterThanOrEqualTo(o.getTimeScoreComputedGreaterThanOrEqualTo());
            timeScoreComputedLessThanOrEqualTo(o.getTimeScoreComputedLessThanOrEqualTo());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RequestSummarizedTrendSecurityScoresRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RequestSummarizedTrendSecurityScoresRequest
         */
        public RequestSummarizedTrendSecurityScoresRequest build() {
            RequestSummarizedTrendSecurityScoresRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of RequestSummarizedTrendSecurityScoresRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RequestSummarizedTrendSecurityScoresRequest
         */
        public RequestSummarizedTrendSecurityScoresRequest buildWithoutInvocationCallback() {
            RequestSummarizedTrendSecurityScoresRequest request =
                    new RequestSummarizedTrendSecurityScoresRequest();
            request.compartmentId = compartmentId;
            request.timeScoreComputedGreaterThanOrEqualTo = timeScoreComputedGreaterThanOrEqualTo;
            request.timeScoreComputedLessThanOrEqualTo = timeScoreComputedLessThanOrEqualTo;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new RequestSummarizedTrendSecurityScoresRequest(compartmentId,
            // timeScoreComputedGreaterThanOrEqualTo, timeScoreComputedLessThanOrEqualTo, limit,
            // page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .timeScoreComputedGreaterThanOrEqualTo(timeScoreComputedGreaterThanOrEqualTo)
                .timeScoreComputedLessThanOrEqualTo(timeScoreComputedLessThanOrEqualTo)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",timeScoreComputedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeScoreComputedGreaterThanOrEqualTo));
        sb.append(",timeScoreComputedLessThanOrEqualTo=")
                .append(String.valueOf(this.timeScoreComputedLessThanOrEqualTo));
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
        if (!(o instanceof RequestSummarizedTrendSecurityScoresRequest)) {
            return false;
        }

        RequestSummarizedTrendSecurityScoresRequest other =
                (RequestSummarizedTrendSecurityScoresRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.timeScoreComputedGreaterThanOrEqualTo,
                        other.timeScoreComputedGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeScoreComputedLessThanOrEqualTo,
                        other.timeScoreComputedLessThanOrEqualTo)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScoreComputedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeScoreComputedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScoreComputedLessThanOrEqualTo == null
                                ? 43
                                : this.timeScoreComputedLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
