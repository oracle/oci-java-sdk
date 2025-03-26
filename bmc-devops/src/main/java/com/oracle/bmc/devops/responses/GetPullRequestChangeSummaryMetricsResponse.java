/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.responses;

import com.oracle.bmc.devops.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class GetPullRequestChangeSummaryMetricsResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned PullRequestChangeSummaryMetrics instance.
     */
    private com.oracle.bmc.devops.model.PullRequestChangeSummaryMetrics
            pullRequestChangeSummaryMetrics;

    /**
     * The returned PullRequestChangeSummaryMetrics instance.
     * @return the value
     */
    public com.oracle.bmc.devops.model.PullRequestChangeSummaryMetrics
            getPullRequestChangeSummaryMetrics() {
        return pullRequestChangeSummaryMetrics;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "pullRequestChangeSummaryMetrics"
    })
    private GetPullRequestChangeSummaryMetricsResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.devops.model.PullRequestChangeSummaryMetrics
                    pullRequestChangeSummaryMetrics) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.pullRequestChangeSummaryMetrics = pullRequestChangeSummaryMetrics;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned PullRequestChangeSummaryMetrics instance.
         */
        private com.oracle.bmc.devops.model.PullRequestChangeSummaryMetrics
                pullRequestChangeSummaryMetrics;

        /**
         * The returned PullRequestChangeSummaryMetrics instance.
         * @param pullRequestChangeSummaryMetrics the value to set
         * @return this builder
         */
        public Builder pullRequestChangeSummaryMetrics(
                com.oracle.bmc.devops.model.PullRequestChangeSummaryMetrics
                        pullRequestChangeSummaryMetrics) {
            this.pullRequestChangeSummaryMetrics = pullRequestChangeSummaryMetrics;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetPullRequestChangeSummaryMetricsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            pullRequestChangeSummaryMetrics(o.getPullRequestChangeSummaryMetrics());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetPullRequestChangeSummaryMetricsResponse build() {
            return new GetPullRequestChangeSummaryMetricsResponse(
                    __httpStatusCode__, headers, opcRequestId, pullRequestChangeSummaryMetrics);
        }
    }

    /**
     * Return a new builder for this response object.
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",pullRequestChangeSummaryMetrics=")
                .append(String.valueOf(pullRequestChangeSummaryMetrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetPullRequestChangeSummaryMetricsResponse)) {
            return false;
        }

        GetPullRequestChangeSummaryMetricsResponse other =
                (GetPullRequestChangeSummaryMetricsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.pullRequestChangeSummaryMetrics,
                        other.pullRequestChangeSummaryMetrics);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.pullRequestChangeSummaryMetrics == null
                                ? 43
                                : this.pullRequestChangeSummaryMetrics.hashCode());
        return result;
    }
}
