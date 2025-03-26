/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.requests;

import com.oracle.bmc.operatoraccesscontrol.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/operatoraccesscontrol/GetAuditLogReportExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetAuditLogReportRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetAuditLogReportRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * unique AccessRequest identifier
     */
    private String accessRequestId;

    /**
     * unique AccessRequest identifier
     */
    public String getAccessRequestId() {
        return accessRequestId;
    }
    /**
     * To enable process tree computation in audit report
     */
    private Integer enableProcessTree;

    /**
     * To enable process tree computation in audit report
     */
    public Integer getEnableProcessTree() {
        return enableProcessTree;
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
                    GetAuditLogReportRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * unique AccessRequest identifier
         */
        private String accessRequestId = null;

        /**
         * unique AccessRequest identifier
         * @param accessRequestId the value to set
         * @return this builder instance
         */
        public Builder accessRequestId(String accessRequestId) {
            this.accessRequestId = accessRequestId;
            return this;
        }

        /**
         * To enable process tree computation in audit report
         */
        private Integer enableProcessTree = null;

        /**
         * To enable process tree computation in audit report
         * @param enableProcessTree the value to set
         * @return this builder instance
         */
        public Builder enableProcessTree(Integer enableProcessTree) {
            this.enableProcessTree = enableProcessTree;
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
        public Builder copy(GetAuditLogReportRequest o) {
            accessRequestId(o.getAccessRequestId());
            enableProcessTree(o.getEnableProcessTree());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAuditLogReportRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetAuditLogReportRequest
         */
        public GetAuditLogReportRequest build() {
            GetAuditLogReportRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetAuditLogReportRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetAuditLogReportRequest
         */
        public GetAuditLogReportRequest buildWithoutInvocationCallback() {
            GetAuditLogReportRequest request = new GetAuditLogReportRequest();
            request.accessRequestId = accessRequestId;
            request.enableProcessTree = enableProcessTree;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetAuditLogReportRequest(accessRequestId, enableProcessTree, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .accessRequestId(accessRequestId)
                .enableProcessTree(enableProcessTree)
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
        sb.append(",accessRequestId=").append(String.valueOf(this.accessRequestId));
        sb.append(",enableProcessTree=").append(String.valueOf(this.enableProcessTree));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAuditLogReportRequest)) {
            return false;
        }

        GetAuditLogReportRequest other = (GetAuditLogReportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.accessRequestId, other.accessRequestId)
                && java.util.Objects.equals(this.enableProcessTree, other.enableProcessTree)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.accessRequestId == null ? 43 : this.accessRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.enableProcessTree == null ? 43 : this.enableProcessTree.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
