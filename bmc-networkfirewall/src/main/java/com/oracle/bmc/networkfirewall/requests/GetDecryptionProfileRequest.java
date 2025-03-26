/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.requests;

import com.oracle.bmc.networkfirewall.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/networkfirewall/GetDecryptionProfileExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetDecryptionProfileRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public class GetDecryptionProfileRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Network Firewall Policy identifier
     */
    private String networkFirewallPolicyId;

    /**
     * Unique Network Firewall Policy identifier
     */
    public String getNetworkFirewallPolicyId() {
        return networkFirewallPolicyId;
    }
    /**
     * Unique identifier for Decryption Profiles.
     */
    private String decryptionProfileName;

    /**
     * Unique identifier for Decryption Profiles.
     */
    public String getDecryptionProfileName() {
        return decryptionProfileName;
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
                    GetDecryptionProfileRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Network Firewall Policy identifier
         */
        private String networkFirewallPolicyId = null;

        /**
         * Unique Network Firewall Policy identifier
         * @param networkFirewallPolicyId the value to set
         * @return this builder instance
         */
        public Builder networkFirewallPolicyId(String networkFirewallPolicyId) {
            this.networkFirewallPolicyId = networkFirewallPolicyId;
            return this;
        }

        /**
         * Unique identifier for Decryption Profiles.
         */
        private String decryptionProfileName = null;

        /**
         * Unique identifier for Decryption Profiles.
         * @param decryptionProfileName the value to set
         * @return this builder instance
         */
        public Builder decryptionProfileName(String decryptionProfileName) {
            this.decryptionProfileName = decryptionProfileName;
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
        public Builder copy(GetDecryptionProfileRequest o) {
            networkFirewallPolicyId(o.getNetworkFirewallPolicyId());
            decryptionProfileName(o.getDecryptionProfileName());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDecryptionProfileRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetDecryptionProfileRequest
         */
        public GetDecryptionProfileRequest build() {
            GetDecryptionProfileRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDecryptionProfileRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDecryptionProfileRequest
         */
        public GetDecryptionProfileRequest buildWithoutInvocationCallback() {
            GetDecryptionProfileRequest request = new GetDecryptionProfileRequest();
            request.networkFirewallPolicyId = networkFirewallPolicyId;
            request.decryptionProfileName = decryptionProfileName;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetDecryptionProfileRequest(networkFirewallPolicyId, decryptionProfileName, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .networkFirewallPolicyId(networkFirewallPolicyId)
                .decryptionProfileName(decryptionProfileName)
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
        sb.append(",networkFirewallPolicyId=").append(String.valueOf(this.networkFirewallPolicyId));
        sb.append(",decryptionProfileName=").append(String.valueOf(this.decryptionProfileName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDecryptionProfileRequest)) {
            return false;
        }

        GetDecryptionProfileRequest other = (GetDecryptionProfileRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.networkFirewallPolicyId, other.networkFirewallPolicyId)
                && java.util.Objects.equals(this.decryptionProfileName, other.decryptionProfileName)
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
                        + (this.decryptionProfileName == null
                                ? 43
                                : this.decryptionProfileName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
