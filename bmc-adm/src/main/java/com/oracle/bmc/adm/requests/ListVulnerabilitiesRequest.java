/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.requests;

import com.oracle.bmc.adm.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListVulnerabilitiesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListVulnerabilitiesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class ListVulnerabilitiesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Vulnerability Audit identifier path parameter.
     */
    private String vulnerabilityAuditId;

    /**
     * Unique Vulnerability Audit identifier path parameter.
     */
    public String getVulnerabilityAuditId() {
        return vulnerabilityAuditId;
    }
    /**
     * A filter when set returns only vulnerabilities that are immediately(directly) affecting any artifact, when unset all vulnerabilities are returned.
     */
    private Boolean isDirectVulnerability;

    /**
     * A filter when set returns only vulnerabilities that are immediately(directly) affecting any artifact, when unset all vulnerabilities are returned.
     */
    public Boolean getIsDirectVulnerability() {
        return isDirectVulnerability;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListVulnerabilitiesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Vulnerability Audit identifier path parameter.
         */
        private String vulnerabilityAuditId = null;

        /**
         * Unique Vulnerability Audit identifier path parameter.
         * @param vulnerabilityAuditId the value to set
         * @return this builder instance
         */
        public Builder vulnerabilityAuditId(String vulnerabilityAuditId) {
            this.vulnerabilityAuditId = vulnerabilityAuditId;
            return this;
        }

        /**
         * A filter when set returns only vulnerabilities that are immediately(directly) affecting any artifact, when unset all vulnerabilities are returned.
         */
        private Boolean isDirectVulnerability = null;

        /**
         * A filter when set returns only vulnerabilities that are immediately(directly) affecting any artifact, when unset all vulnerabilities are returned.
         * @param isDirectVulnerability the value to set
         * @return this builder instance
         */
        public Builder isDirectVulnerability(Boolean isDirectVulnerability) {
            this.isDirectVulnerability = isDirectVulnerability;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(ListVulnerabilitiesRequest o) {
            vulnerabilityAuditId(o.getVulnerabilityAuditId());
            isDirectVulnerability(o.getIsDirectVulnerability());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListVulnerabilitiesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListVulnerabilitiesRequest
         */
        public ListVulnerabilitiesRequest build() {
            ListVulnerabilitiesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListVulnerabilitiesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListVulnerabilitiesRequest
         */
        public ListVulnerabilitiesRequest buildWithoutInvocationCallback() {
            ListVulnerabilitiesRequest request = new ListVulnerabilitiesRequest();
            request.vulnerabilityAuditId = vulnerabilityAuditId;
            request.isDirectVulnerability = isDirectVulnerability;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListVulnerabilitiesRequest(vulnerabilityAuditId, isDirectVulnerability, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .vulnerabilityAuditId(vulnerabilityAuditId)
                .isDirectVulnerability(isDirectVulnerability)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId);
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
        sb.append(",vulnerabilityAuditId=").append(String.valueOf(this.vulnerabilityAuditId));
        sb.append(",isDirectVulnerability=").append(String.valueOf(this.isDirectVulnerability));
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
        if (!(o instanceof ListVulnerabilitiesRequest)) {
            return false;
        }

        ListVulnerabilitiesRequest other = (ListVulnerabilitiesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.vulnerabilityAuditId, other.vulnerabilityAuditId)
                && java.util.Objects.equals(this.isDirectVulnerability, other.isDirectVulnerability)
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
                        + (this.vulnerabilityAuditId == null
                                ? 43
                                : this.vulnerabilityAuditId.hashCode());
        result =
                (result * PRIME)
                        + (this.isDirectVulnerability == null
                                ? 43
                                : this.isDirectVulnerability.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
