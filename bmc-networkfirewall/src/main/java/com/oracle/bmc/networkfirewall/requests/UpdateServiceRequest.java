/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.requests;

import com.oracle.bmc.networkfirewall.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/networkfirewall/UpdateServiceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateServiceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public class UpdateServiceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.networkfirewall.model.UpdateServiceDetails> {

    /** Unique Network Firewall Policy identifier */
    private String networkFirewallPolicyId;

    /** Unique Network Firewall Policy identifier */
    public String getNetworkFirewallPolicyId() {
        return networkFirewallPolicyId;
    }
    /** Unique identifier for Services. */
    private String serviceName;

    /** Unique identifier for Services. */
    public String getServiceName() {
        return serviceName;
    }
    /** The information to be updated. */
    private com.oracle.bmc.networkfirewall.model.UpdateServiceDetails updateServiceDetails;

    /** The information to be updated. */
    public com.oracle.bmc.networkfirewall.model.UpdateServiceDetails getUpdateServiceDetails() {
        return updateServiceDetails;
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
    public com.oracle.bmc.networkfirewall.model.UpdateServiceDetails getBody$() {
        return updateServiceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateServiceRequest,
                    com.oracle.bmc.networkfirewall.model.UpdateServiceDetails> {
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

        /** Unique identifier for Services. */
        private String serviceName = null;

        /**
         * Unique identifier for Services.
         *
         * @param serviceName the value to set
         * @return this builder instance
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.networkfirewall.model.UpdateServiceDetails updateServiceDetails =
                null;

        /**
         * The information to be updated.
         *
         * @param updateServiceDetails the value to set
         * @return this builder instance
         */
        public Builder updateServiceDetails(
                com.oracle.bmc.networkfirewall.model.UpdateServiceDetails updateServiceDetails) {
            this.updateServiceDetails = updateServiceDetails;
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
        public Builder copy(UpdateServiceRequest o) {
            networkFirewallPolicyId(o.getNetworkFirewallPolicyId());
            serviceName(o.getServiceName());
            updateServiceDetails(o.getUpdateServiceDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateServiceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateServiceRequest
         */
        public UpdateServiceRequest build() {
            UpdateServiceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.networkfirewall.model.UpdateServiceDetails body) {
            updateServiceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateServiceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateServiceRequest
         */
        public UpdateServiceRequest buildWithoutInvocationCallback() {
            UpdateServiceRequest request = new UpdateServiceRequest();
            request.networkFirewallPolicyId = networkFirewallPolicyId;
            request.serviceName = serviceName;
            request.updateServiceDetails = updateServiceDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateServiceRequest(networkFirewallPolicyId, serviceName, updateServiceDetails,
            // ifMatch, opcRequestId);
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
                .serviceName(serviceName)
                .updateServiceDetails(updateServiceDetails)
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
        sb.append(",serviceName=").append(String.valueOf(this.serviceName));
        sb.append(",updateServiceDetails=").append(String.valueOf(this.updateServiceDetails));
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
        if (!(o instanceof UpdateServiceRequest)) {
            return false;
        }

        UpdateServiceRequest other = (UpdateServiceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.networkFirewallPolicyId, other.networkFirewallPolicyId)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.updateServiceDetails, other.updateServiceDetails)
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
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result =
                (result * PRIME)
                        + (this.updateServiceDetails == null
                                ? 43
                                : this.updateServiceDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
