/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane.requests;

import com.oracle.bmc.governancerulescontrolplane.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/GetEnforcedGovernanceRuleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetEnforcedGovernanceRuleRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
public class GetEnforcedGovernanceRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique enforced governance rule identifier. */
    private String enforcedGovernanceRuleId;

    /** Unique enforced governance rule identifier. */
    public String getEnforcedGovernanceRuleId() {
        return enforcedGovernanceRuleId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetEnforcedGovernanceRuleRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique enforced governance rule identifier. */
        private String enforcedGovernanceRuleId = null;

        /**
         * Unique enforced governance rule identifier.
         *
         * @param enforcedGovernanceRuleId the value to set
         * @return this builder instance
         */
        public Builder enforcedGovernanceRuleId(String enforcedGovernanceRuleId) {
            this.enforcedGovernanceRuleId = enforcedGovernanceRuleId;
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
        public Builder copy(GetEnforcedGovernanceRuleRequest o) {
            enforcedGovernanceRuleId(o.getEnforcedGovernanceRuleId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetEnforcedGovernanceRuleRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetEnforcedGovernanceRuleRequest
         */
        public GetEnforcedGovernanceRuleRequest build() {
            GetEnforcedGovernanceRuleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetEnforcedGovernanceRuleRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetEnforcedGovernanceRuleRequest
         */
        public GetEnforcedGovernanceRuleRequest buildWithoutInvocationCallback() {
            GetEnforcedGovernanceRuleRequest request = new GetEnforcedGovernanceRuleRequest();
            request.enforcedGovernanceRuleId = enforcedGovernanceRuleId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetEnforcedGovernanceRuleRequest(enforcedGovernanceRuleId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .enforcedGovernanceRuleId(enforcedGovernanceRuleId)
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
        sb.append(",enforcedGovernanceRuleId=")
                .append(String.valueOf(this.enforcedGovernanceRuleId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetEnforcedGovernanceRuleRequest)) {
            return false;
        }

        GetEnforcedGovernanceRuleRequest other = (GetEnforcedGovernanceRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.enforcedGovernanceRuleId, other.enforcedGovernanceRuleId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.enforcedGovernanceRuleId == null
                                ? 43
                                : this.enforcedGovernanceRuleId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
