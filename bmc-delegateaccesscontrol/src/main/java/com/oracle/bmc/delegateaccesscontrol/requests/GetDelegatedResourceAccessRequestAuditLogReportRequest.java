/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.requests;

import com.oracle.bmc.delegateaccesscontrol.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/delegateaccesscontrol/GetDelegatedResourceAccessRequestAuditLogReportExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDelegatedResourceAccessRequestAuditLogReportRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class GetDelegatedResourceAccessRequestAuditLogReportRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Delegated Resource Access Request identifier */
    private String delegatedResourceAccessRequestId;

    /** Unique Delegated Resource Access Request identifier */
    public String getDelegatedResourceAccessRequestId() {
        return delegatedResourceAccessRequestId;
    }
    /** Set to true to enable process tree computation in audit report */
    private Boolean isProcessTreeEnabled;

    /** Set to true to enable process tree computation in audit report */
    public Boolean getIsProcessTreeEnabled() {
        return isProcessTreeEnabled;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDelegatedResourceAccessRequestAuditLogReportRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Delegated Resource Access Request identifier */
        private String delegatedResourceAccessRequestId = null;

        /**
         * Unique Delegated Resource Access Request identifier
         *
         * @param delegatedResourceAccessRequestId the value to set
         * @return this builder instance
         */
        public Builder delegatedResourceAccessRequestId(String delegatedResourceAccessRequestId) {
            this.delegatedResourceAccessRequestId = delegatedResourceAccessRequestId;
            return this;
        }

        /** Set to true to enable process tree computation in audit report */
        private Boolean isProcessTreeEnabled = null;

        /**
         * Set to true to enable process tree computation in audit report
         *
         * @param isProcessTreeEnabled the value to set
         * @return this builder instance
         */
        public Builder isProcessTreeEnabled(Boolean isProcessTreeEnabled) {
            this.isProcessTreeEnabled = isProcessTreeEnabled;
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
        public Builder copy(GetDelegatedResourceAccessRequestAuditLogReportRequest o) {
            delegatedResourceAccessRequestId(o.getDelegatedResourceAccessRequestId());
            isProcessTreeEnabled(o.getIsProcessTreeEnabled());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDelegatedResourceAccessRequestAuditLogReportRequest as
         * configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDelegatedResourceAccessRequestAuditLogReportRequest
         */
        public GetDelegatedResourceAccessRequestAuditLogReportRequest build() {
            GetDelegatedResourceAccessRequestAuditLogReportRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDelegatedResourceAccessRequestAuditLogReportRequest as
         * configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDelegatedResourceAccessRequestAuditLogReportRequest
         */
        public GetDelegatedResourceAccessRequestAuditLogReportRequest
                buildWithoutInvocationCallback() {
            GetDelegatedResourceAccessRequestAuditLogReportRequest request =
                    new GetDelegatedResourceAccessRequestAuditLogReportRequest();
            request.delegatedResourceAccessRequestId = delegatedResourceAccessRequestId;
            request.isProcessTreeEnabled = isProcessTreeEnabled;
            request.opcRequestId = opcRequestId;
            return request;
            // new
            // GetDelegatedResourceAccessRequestAuditLogReportRequest(delegatedResourceAccessRequestId, isProcessTreeEnabled, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .delegatedResourceAccessRequestId(delegatedResourceAccessRequestId)
                .isProcessTreeEnabled(isProcessTreeEnabled)
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
        sb.append(",delegatedResourceAccessRequestId=")
                .append(String.valueOf(this.delegatedResourceAccessRequestId));
        sb.append(",isProcessTreeEnabled=").append(String.valueOf(this.isProcessTreeEnabled));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDelegatedResourceAccessRequestAuditLogReportRequest)) {
            return false;
        }

        GetDelegatedResourceAccessRequestAuditLogReportRequest other =
                (GetDelegatedResourceAccessRequestAuditLogReportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.delegatedResourceAccessRequestId,
                        other.delegatedResourceAccessRequestId)
                && java.util.Objects.equals(this.isProcessTreeEnabled, other.isProcessTreeEnabled)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.delegatedResourceAccessRequestId == null
                                ? 43
                                : this.delegatedResourceAccessRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isProcessTreeEnabled == null
                                ? 43
                                : this.isProcessTreeEnabled.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
