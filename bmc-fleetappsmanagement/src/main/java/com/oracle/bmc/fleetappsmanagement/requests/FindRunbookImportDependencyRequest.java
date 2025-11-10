/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/FindRunbookImportDependencyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * FindRunbookImportDependencyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class FindRunbookImportDependencyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.fleetappsmanagement.model.FindRunbookImportDependencyDetails> {

    /** Details for finding runbook import dependencies. */
    private com.oracle.bmc.fleetappsmanagement.model.FindRunbookImportDependencyDetails
            findRunbookImportDependencyDetails;

    /** Details for finding runbook import dependencies. */
    public com.oracle.bmc.fleetappsmanagement.model.FindRunbookImportDependencyDetails
            getFindRunbookImportDependencyDetails() {
        return findRunbookImportDependencyDetails;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.fleetappsmanagement.model.FindRunbookImportDependencyDetails getBody$() {
        return findRunbookImportDependencyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    FindRunbookImportDependencyRequest,
                    com.oracle.bmc.fleetappsmanagement.model.FindRunbookImportDependencyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for finding runbook import dependencies. */
        private com.oracle.bmc.fleetappsmanagement.model.FindRunbookImportDependencyDetails
                findRunbookImportDependencyDetails = null;

        /**
         * Details for finding runbook import dependencies.
         *
         * @param findRunbookImportDependencyDetails the value to set
         * @return this builder instance
         */
        public Builder findRunbookImportDependencyDetails(
                com.oracle.bmc.fleetappsmanagement.model.FindRunbookImportDependencyDetails
                        findRunbookImportDependencyDetails) {
            this.findRunbookImportDependencyDetails = findRunbookImportDependencyDetails;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
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
        public Builder copy(FindRunbookImportDependencyRequest o) {
            findRunbookImportDependencyDetails(o.getFindRunbookImportDependencyDetails());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of FindRunbookImportDependencyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of FindRunbookImportDependencyRequest
         */
        public FindRunbookImportDependencyRequest build() {
            FindRunbookImportDependencyRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.fleetappsmanagement.model.FindRunbookImportDependencyDetails body) {
            findRunbookImportDependencyDetails(body);
            return this;
        }

        /**
         * Build the instance of FindRunbookImportDependencyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of FindRunbookImportDependencyRequest
         */
        public FindRunbookImportDependencyRequest buildWithoutInvocationCallback() {
            FindRunbookImportDependencyRequest request = new FindRunbookImportDependencyRequest();
            request.findRunbookImportDependencyDetails = findRunbookImportDependencyDetails;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new FindRunbookImportDependencyRequest(findRunbookImportDependencyDetails, limit,
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
                .findRunbookImportDependencyDetails(findRunbookImportDependencyDetails)
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
        sb.append(",findRunbookImportDependencyDetails=")
                .append(String.valueOf(this.findRunbookImportDependencyDetails));
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
        if (!(o instanceof FindRunbookImportDependencyRequest)) {
            return false;
        }

        FindRunbookImportDependencyRequest other = (FindRunbookImportDependencyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.findRunbookImportDependencyDetails,
                        other.findRunbookImportDependencyDetails)
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
                        + (this.findRunbookImportDependencyDetails == null
                                ? 43
                                : this.findRunbookImportDependencyDetails.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
