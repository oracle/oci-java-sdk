/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.requests;

import com.oracle.bmc.networkfirewall.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/networkfirewall/UpdateTunnelInspectionRuleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateTunnelInspectionRuleRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public class UpdateTunnelInspectionRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.networkfirewall.model.UpdateTunnelInspectionRuleDetails> {

    /** Unique Network Firewall Policy identifier */
    private String networkFirewallPolicyId;

    /** Unique Network Firewall Policy identifier */
    public String getNetworkFirewallPolicyId() {
        return networkFirewallPolicyId;
    }
    /** Unique identifier for Tunnel Inspection Rules in the network firewall policy. */
    private String tunnelInspectionRuleName;

    /** Unique identifier for Tunnel Inspection Rules in the network firewall policy. */
    public String getTunnelInspectionRuleName() {
        return tunnelInspectionRuleName;
    }
    /** The information to be updated. */
    private com.oracle.bmc.networkfirewall.model.UpdateTunnelInspectionRuleDetails
            updateTunnelInspectionRuleDetails;

    /** The information to be updated. */
    public com.oracle.bmc.networkfirewall.model.UpdateTunnelInspectionRuleDetails
            getUpdateTunnelInspectionRuleDetails() {
        return updateTunnelInspectionRuleDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
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
    public com.oracle.bmc.networkfirewall.model.UpdateTunnelInspectionRuleDetails getBody$() {
        return updateTunnelInspectionRuleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateTunnelInspectionRuleRequest,
                    com.oracle.bmc.networkfirewall.model.UpdateTunnelInspectionRuleDetails> {
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

        /** Unique identifier for Tunnel Inspection Rules in the network firewall policy. */
        private String tunnelInspectionRuleName = null;

        /**
         * Unique identifier for Tunnel Inspection Rules in the network firewall policy.
         *
         * @param tunnelInspectionRuleName the value to set
         * @return this builder instance
         */
        public Builder tunnelInspectionRuleName(String tunnelInspectionRuleName) {
            this.tunnelInspectionRuleName = tunnelInspectionRuleName;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.networkfirewall.model.UpdateTunnelInspectionRuleDetails
                updateTunnelInspectionRuleDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateTunnelInspectionRuleDetails the value to set
         * @return this builder instance
         */
        public Builder updateTunnelInspectionRuleDetails(
                com.oracle.bmc.networkfirewall.model.UpdateTunnelInspectionRuleDetails
                        updateTunnelInspectionRuleDetails) {
            this.updateTunnelInspectionRuleDetails = updateTunnelInspectionRuleDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateTunnelInspectionRuleRequest o) {
            networkFirewallPolicyId(o.getNetworkFirewallPolicyId());
            tunnelInspectionRuleName(o.getTunnelInspectionRuleName());
            updateTunnelInspectionRuleDetails(o.getUpdateTunnelInspectionRuleDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateTunnelInspectionRuleRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateTunnelInspectionRuleRequest
         */
        public UpdateTunnelInspectionRuleRequest build() {
            UpdateTunnelInspectionRuleRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.networkfirewall.model.UpdateTunnelInspectionRuleDetails body) {
            updateTunnelInspectionRuleDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateTunnelInspectionRuleRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateTunnelInspectionRuleRequest
         */
        public UpdateTunnelInspectionRuleRequest buildWithoutInvocationCallback() {
            UpdateTunnelInspectionRuleRequest request = new UpdateTunnelInspectionRuleRequest();
            request.networkFirewallPolicyId = networkFirewallPolicyId;
            request.tunnelInspectionRuleName = tunnelInspectionRuleName;
            request.updateTunnelInspectionRuleDetails = updateTunnelInspectionRuleDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateTunnelInspectionRuleRequest(networkFirewallPolicyId,
            // tunnelInspectionRuleName, updateTunnelInspectionRuleDetails, ifMatch, opcRequestId);
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
                .tunnelInspectionRuleName(tunnelInspectionRuleName)
                .updateTunnelInspectionRuleDetails(updateTunnelInspectionRuleDetails)
                .ifMatch(ifMatch)
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
        sb.append(",tunnelInspectionRuleName=")
                .append(String.valueOf(this.tunnelInspectionRuleName));
        sb.append(",updateTunnelInspectionRuleDetails=")
                .append(String.valueOf(this.updateTunnelInspectionRuleDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTunnelInspectionRuleRequest)) {
            return false;
        }

        UpdateTunnelInspectionRuleRequest other = (UpdateTunnelInspectionRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.networkFirewallPolicyId, other.networkFirewallPolicyId)
                && java.util.Objects.equals(
                        this.tunnelInspectionRuleName, other.tunnelInspectionRuleName)
                && java.util.Objects.equals(
                        this.updateTunnelInspectionRuleDetails,
                        other.updateTunnelInspectionRuleDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
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
                        + (this.tunnelInspectionRuleName == null
                                ? 43
                                : this.tunnelInspectionRuleName.hashCode());
        result =
                (result * PRIME)
                        + (this.updateTunnelInspectionRuleDetails == null
                                ? 43
                                : this.updateTunnelInspectionRuleDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
