/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.requests;

import com.oracle.bmc.networkfirewall.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/networkfirewall/GetDecryptionRuleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetDecryptionRuleRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public class GetDecryptionRuleRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Network Firewall Policy identifier */
    private String networkFirewallPolicyId;

    /** Unique Network Firewall Policy identifier */
    public String getNetworkFirewallPolicyId() {
        return networkFirewallPolicyId;
    }
    /** Unique identifier for Decryption Rules in the network firewall policy. */
    private String decryptionRuleName;

    /** Unique identifier for Decryption Rules in the network firewall policy. */
    public String getDecryptionRuleName() {
        return decryptionRuleName;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} or {@code opc-prev-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} or {@code opc-prev-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDecryptionRuleRequest, java.lang.Void> {
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

        /** Unique identifier for Decryption Rules in the network firewall policy. */
        private String decryptionRuleName = null;

        /**
         * Unique identifier for Decryption Rules in the network firewall policy.
         *
         * @param decryptionRuleName the value to set
         * @return this builder instance
         */
        public Builder decryptionRuleName(String decryptionRuleName) {
            this.decryptionRuleName = decryptionRuleName;
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
         * from the {@code opc-next-page} or {@code opc-prev-page} header field of a previous
         * response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} or {@code opc-prev-page} header field of a previous
         * response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(GetDecryptionRuleRequest o) {
            networkFirewallPolicyId(o.getNetworkFirewallPolicyId());
            decryptionRuleName(o.getDecryptionRuleName());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDecryptionRuleRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDecryptionRuleRequest
         */
        public GetDecryptionRuleRequest build() {
            GetDecryptionRuleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDecryptionRuleRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDecryptionRuleRequest
         */
        public GetDecryptionRuleRequest buildWithoutInvocationCallback() {
            GetDecryptionRuleRequest request = new GetDecryptionRuleRequest();
            request.networkFirewallPolicyId = networkFirewallPolicyId;
            request.decryptionRuleName = decryptionRuleName;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            return request;
            // new GetDecryptionRuleRequest(networkFirewallPolicyId, decryptionRuleName,
            // opcRequestId, limit, page);
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
                .decryptionRuleName(decryptionRuleName)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page);
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
        sb.append(",decryptionRuleName=").append(String.valueOf(this.decryptionRuleName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDecryptionRuleRequest)) {
            return false;
        }

        GetDecryptionRuleRequest other = (GetDecryptionRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.networkFirewallPolicyId, other.networkFirewallPolicyId)
                && java.util.Objects.equals(this.decryptionRuleName, other.decryptionRuleName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
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
                        + (this.decryptionRuleName == null
                                ? 43
                                : this.decryptionRuleName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
