/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.requests;

import com.oracle.bmc.networkfirewall.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/networkfirewall/GetSecurityRuleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetSecurityRuleRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public class GetSecurityRuleRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Network Firewall Policy identifier */
    private String networkFirewallPolicyId;

    /** Unique Network Firewall Policy identifier */
    public String getNetworkFirewallPolicyId() {
        return networkFirewallPolicyId;
    }
    /** Unique identifier for Security Rules in the network firewall policy. */
    private String securityRuleName;

    /** Unique identifier for Security Rules in the network firewall policy. */
    public String getSecurityRuleName() {
        return securityRuleName;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetSecurityRuleRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Network Firewall Policy identifier */
        private String networkFirewallPolicyId = null;

        /**
         * Unique Network Firewall Policy identifier
         *
         * @param networkFirewallPolicyId the value to set
         * @return this builder instance
         */
        public Builder networkFirewallPolicyId(String networkFirewallPolicyId) {
            this.networkFirewallPolicyId = networkFirewallPolicyId;
            return this;
        }

        /** Unique identifier for Security Rules in the network firewall policy. */
        private String securityRuleName = null;

        /**
         * Unique identifier for Security Rules in the network firewall policy.
         *
         * @param securityRuleName the value to set
         * @return this builder instance
         */
        public Builder securityRuleName(String securityRuleName) {
            this.securityRuleName = securityRuleName;
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
        public Builder copy(GetSecurityRuleRequest o) {
            networkFirewallPolicyId(o.getNetworkFirewallPolicyId());
            securityRuleName(o.getSecurityRuleName());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetSecurityRuleRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetSecurityRuleRequest
         */
        public GetSecurityRuleRequest build() {
            GetSecurityRuleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetSecurityRuleRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetSecurityRuleRequest
         */
        public GetSecurityRuleRequest buildWithoutInvocationCallback() {
            GetSecurityRuleRequest request = new GetSecurityRuleRequest();
            request.networkFirewallPolicyId = networkFirewallPolicyId;
            request.securityRuleName = securityRuleName;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetSecurityRuleRequest(networkFirewallPolicyId, securityRuleName, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .networkFirewallPolicyId(networkFirewallPolicyId)
                .securityRuleName(securityRuleName)
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
        sb.append(",networkFirewallPolicyId=").append(String.valueOf(this.networkFirewallPolicyId));
        sb.append(",securityRuleName=").append(String.valueOf(this.securityRuleName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSecurityRuleRequest)) {
            return false;
        }

        GetSecurityRuleRequest other = (GetSecurityRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.networkFirewallPolicyId, other.networkFirewallPolicyId)
                && java.util.Objects.equals(this.securityRuleName, other.securityRuleName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.networkFirewallPolicyId == null
                                ? 43
                                : this.networkFirewallPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.securityRuleName == null ? 43 : this.securityRuleName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
