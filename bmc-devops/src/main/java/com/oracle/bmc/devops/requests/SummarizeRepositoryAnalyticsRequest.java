/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/SummarizeRepositoryAnalyticsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeRepositoryAnalyticsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class SummarizeRepositoryAnalyticsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.devops.model.SummarizeRepositoryAnalyticsDetails> {

    /** Unique repository identifier. */
    private String repositoryId;

    /** Unique repository identifier. */
    public String getRepositoryId() {
        return repositoryId;
    }
    /** Details to fetch the repository analytics. */
    private com.oracle.bmc.devops.model.SummarizeRepositoryAnalyticsDetails
            summarizeRepositoryAnalyticsDetails;

    /** Details to fetch the repository analytics. */
    public com.oracle.bmc.devops.model.SummarizeRepositoryAnalyticsDetails
            getSummarizeRepositoryAnalyticsDetails() {
        return summarizeRepositoryAnalyticsDetails;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
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
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
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
    public com.oracle.bmc.devops.model.SummarizeRepositoryAnalyticsDetails getBody$() {
        return summarizeRepositoryAnalyticsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeRepositoryAnalyticsRequest,
                    com.oracle.bmc.devops.model.SummarizeRepositoryAnalyticsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique repository identifier. */
        private String repositoryId = null;

        /**
         * Unique repository identifier.
         *
         * @param repositoryId the value to set
         * @return this builder instance
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        /** Details to fetch the repository analytics. */
        private com.oracle.bmc.devops.model.SummarizeRepositoryAnalyticsDetails
                summarizeRepositoryAnalyticsDetails = null;

        /**
         * Details to fetch the repository analytics.
         *
         * @param summarizeRepositoryAnalyticsDetails the value to set
         * @return this builder instance
         */
        public Builder summarizeRepositoryAnalyticsDetails(
                com.oracle.bmc.devops.model.SummarizeRepositoryAnalyticsDetails
                        summarizeRepositoryAnalyticsDetails) {
            this.summarizeRepositoryAnalyticsDetails = summarizeRepositoryAnalyticsDetails;
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

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
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
        public Builder copy(SummarizeRepositoryAnalyticsRequest o) {
            repositoryId(o.getRepositoryId());
            summarizeRepositoryAnalyticsDetails(o.getSummarizeRepositoryAnalyticsDetails());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeRepositoryAnalyticsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SummarizeRepositoryAnalyticsRequest
         */
        public SummarizeRepositoryAnalyticsRequest build() {
            SummarizeRepositoryAnalyticsRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.devops.model.SummarizeRepositoryAnalyticsDetails body) {
            summarizeRepositoryAnalyticsDetails(body);
            return this;
        }

        /**
         * Build the instance of SummarizeRepositoryAnalyticsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeRepositoryAnalyticsRequest
         */
        public SummarizeRepositoryAnalyticsRequest buildWithoutInvocationCallback() {
            SummarizeRepositoryAnalyticsRequest request = new SummarizeRepositoryAnalyticsRequest();
            request.repositoryId = repositoryId;
            request.summarizeRepositoryAnalyticsDetails = summarizeRepositoryAnalyticsDetails;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeRepositoryAnalyticsRequest(repositoryId,
            // summarizeRepositoryAnalyticsDetails, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .repositoryId(repositoryId)
                .summarizeRepositoryAnalyticsDetails(summarizeRepositoryAnalyticsDetails)
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
        sb.append(",repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(",summarizeRepositoryAnalyticsDetails=")
                .append(String.valueOf(this.summarizeRepositoryAnalyticsDetails));
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
        if (!(o instanceof SummarizeRepositoryAnalyticsRequest)) {
            return false;
        }

        SummarizeRepositoryAnalyticsRequest other = (SummarizeRepositoryAnalyticsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(
                        this.summarizeRepositoryAnalyticsDetails,
                        other.summarizeRepositoryAnalyticsDetails)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.summarizeRepositoryAnalyticsDetails == null
                                ? 43
                                : this.summarizeRepositoryAnalyticsDetails.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
