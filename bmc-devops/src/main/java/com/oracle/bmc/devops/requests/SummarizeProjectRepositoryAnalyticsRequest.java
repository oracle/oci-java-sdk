/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/SummarizeProjectRepositoryAnalyticsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeProjectRepositoryAnalyticsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class SummarizeProjectRepositoryAnalyticsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.devops.model.SummarizeProjectRepositoryAnalyticsDetails> {

    /** Unique project identifier. */
    private String projectId;

    /** Unique project identifier. */
    public String getProjectId() {
        return projectId;
    }
    /** Details to fetch the repository analytics. */
    private com.oracle.bmc.devops.model.SummarizeProjectRepositoryAnalyticsDetails
            summarizeProjectRepositoryAnalyticsDetails;

    /** Details to fetch the repository analytics. */
    public com.oracle.bmc.devops.model.SummarizeProjectRepositoryAnalyticsDetails
            getSummarizeProjectRepositoryAnalyticsDetails() {
        return summarizeProjectRepositoryAnalyticsDetails;
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
    public com.oracle.bmc.devops.model.SummarizeProjectRepositoryAnalyticsDetails getBody$() {
        return summarizeProjectRepositoryAnalyticsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeProjectRepositoryAnalyticsRequest,
                    com.oracle.bmc.devops.model.SummarizeProjectRepositoryAnalyticsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique project identifier. */
        private String projectId = null;

        /**
         * Unique project identifier.
         *
         * @param projectId the value to set
         * @return this builder instance
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /** Details to fetch the repository analytics. */
        private com.oracle.bmc.devops.model.SummarizeProjectRepositoryAnalyticsDetails
                summarizeProjectRepositoryAnalyticsDetails = null;

        /**
         * Details to fetch the repository analytics.
         *
         * @param summarizeProjectRepositoryAnalyticsDetails the value to set
         * @return this builder instance
         */
        public Builder summarizeProjectRepositoryAnalyticsDetails(
                com.oracle.bmc.devops.model.SummarizeProjectRepositoryAnalyticsDetails
                        summarizeProjectRepositoryAnalyticsDetails) {
            this.summarizeProjectRepositoryAnalyticsDetails =
                    summarizeProjectRepositoryAnalyticsDetails;
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
        public Builder copy(SummarizeProjectRepositoryAnalyticsRequest o) {
            projectId(o.getProjectId());
            summarizeProjectRepositoryAnalyticsDetails(
                    o.getSummarizeProjectRepositoryAnalyticsDetails());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeProjectRepositoryAnalyticsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SummarizeProjectRepositoryAnalyticsRequest
         */
        public SummarizeProjectRepositoryAnalyticsRequest build() {
            SummarizeProjectRepositoryAnalyticsRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.devops.model.SummarizeProjectRepositoryAnalyticsDetails body) {
            summarizeProjectRepositoryAnalyticsDetails(body);
            return this;
        }

        /**
         * Build the instance of SummarizeProjectRepositoryAnalyticsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeProjectRepositoryAnalyticsRequest
         */
        public SummarizeProjectRepositoryAnalyticsRequest buildWithoutInvocationCallback() {
            SummarizeProjectRepositoryAnalyticsRequest request =
                    new SummarizeProjectRepositoryAnalyticsRequest();
            request.projectId = projectId;
            request.summarizeProjectRepositoryAnalyticsDetails =
                    summarizeProjectRepositoryAnalyticsDetails;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeProjectRepositoryAnalyticsRequest(projectId,
            // summarizeProjectRepositoryAnalyticsDetails, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .projectId(projectId)
                .summarizeProjectRepositoryAnalyticsDetails(
                        summarizeProjectRepositoryAnalyticsDetails)
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
        sb.append(",projectId=").append(String.valueOf(this.projectId));
        sb.append(",summarizeProjectRepositoryAnalyticsDetails=")
                .append(String.valueOf(this.summarizeProjectRepositoryAnalyticsDetails));
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
        if (!(o instanceof SummarizeProjectRepositoryAnalyticsRequest)) {
            return false;
        }

        SummarizeProjectRepositoryAnalyticsRequest other =
                (SummarizeProjectRepositoryAnalyticsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(
                        this.summarizeProjectRepositoryAnalyticsDetails,
                        other.summarizeProjectRepositoryAnalyticsDetails)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result =
                (result * PRIME)
                        + (this.summarizeProjectRepositoryAnalyticsDetails == null
                                ? 43
                                : this.summarizeProjectRepositoryAnalyticsDetails.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
