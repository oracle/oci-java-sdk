/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateIPSecConnectionTunnelSharedSecretExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateIPSecConnectionTunnelSharedSecretRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateIPSecConnectionTunnelSharedSecretRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelSharedSecretDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPSec connection.
     */
    private String ipscId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPSec connection.
     */
    public String getIpscId() {
        return ipscId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tunnel.
     */
    private String tunnelId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tunnel.
     */
    public String getTunnelId() {
        return tunnelId;
    }
    /**
     * Details object for updating a IPSec connection tunnel's sharedSecret.
     */
    private com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelSharedSecretDetails
            updateIPSecConnectionTunnelSharedSecretDetails;

    /**
     * Details object for updating a IPSec connection tunnel's sharedSecret.
     */
    public com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelSharedSecretDetails
            getUpdateIPSecConnectionTunnelSharedSecretDetails() {
        return updateIPSecConnectionTunnelSharedSecretDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelSharedSecretDetails getBody$() {
        return updateIPSecConnectionTunnelSharedSecretDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateIPSecConnectionTunnelSharedSecretRequest,
                    com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelSharedSecretDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPSec connection.
         */
        private String ipscId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IPSec connection.
         * @param ipscId the value to set
         * @return this builder instance
         */
        public Builder ipscId(String ipscId) {
            this.ipscId = ipscId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tunnel.
         */
        private String tunnelId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tunnel.
         * @param tunnelId the value to set
         * @return this builder instance
         */
        public Builder tunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }

        /**
         * Details object for updating a IPSec connection tunnel's sharedSecret.
         */
        private com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelSharedSecretDetails
                updateIPSecConnectionTunnelSharedSecretDetails = null;

        /**
         * Details object for updating a IPSec connection tunnel's sharedSecret.
         * @param updateIPSecConnectionTunnelSharedSecretDetails the value to set
         * @return this builder instance
         */
        public Builder updateIPSecConnectionTunnelSharedSecretDetails(
                com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelSharedSecretDetails
                        updateIPSecConnectionTunnelSharedSecretDetails) {
            this.updateIPSecConnectionTunnelSharedSecretDetails =
                    updateIPSecConnectionTunnelSharedSecretDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateIPSecConnectionTunnelSharedSecretRequest o) {
            ipscId(o.getIpscId());
            tunnelId(o.getTunnelId());
            updateIPSecConnectionTunnelSharedSecretDetails(
                    o.getUpdateIPSecConnectionTunnelSharedSecretDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateIPSecConnectionTunnelSharedSecretRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateIPSecConnectionTunnelSharedSecretRequest
         */
        public UpdateIPSecConnectionTunnelSharedSecretRequest build() {
            UpdateIPSecConnectionTunnelSharedSecretRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelSharedSecretDetails body) {
            updateIPSecConnectionTunnelSharedSecretDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateIPSecConnectionTunnelSharedSecretRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateIPSecConnectionTunnelSharedSecretRequest
         */
        public UpdateIPSecConnectionTunnelSharedSecretRequest buildWithoutInvocationCallback() {
            UpdateIPSecConnectionTunnelSharedSecretRequest request =
                    new UpdateIPSecConnectionTunnelSharedSecretRequest();
            request.ipscId = ipscId;
            request.tunnelId = tunnelId;
            request.updateIPSecConnectionTunnelSharedSecretDetails =
                    updateIPSecConnectionTunnelSharedSecretDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateIPSecConnectionTunnelSharedSecretRequest(ipscId, tunnelId, updateIPSecConnectionTunnelSharedSecretDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .ipscId(ipscId)
                .tunnelId(tunnelId)
                .updateIPSecConnectionTunnelSharedSecretDetails(
                        updateIPSecConnectionTunnelSharedSecretDetails)
                .ifMatch(ifMatch);
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
        sb.append(",ipscId=").append(String.valueOf(this.ipscId));
        sb.append(",tunnelId=").append(String.valueOf(this.tunnelId));
        sb.append(",updateIPSecConnectionTunnelSharedSecretDetails=")
                .append(String.valueOf(this.updateIPSecConnectionTunnelSharedSecretDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateIPSecConnectionTunnelSharedSecretRequest)) {
            return false;
        }

        UpdateIPSecConnectionTunnelSharedSecretRequest other =
                (UpdateIPSecConnectionTunnelSharedSecretRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.ipscId, other.ipscId)
                && java.util.Objects.equals(this.tunnelId, other.tunnelId)
                && java.util.Objects.equals(
                        this.updateIPSecConnectionTunnelSharedSecretDetails,
                        other.updateIPSecConnectionTunnelSharedSecretDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ipscId == null ? 43 : this.ipscId.hashCode());
        result = (result * PRIME) + (this.tunnelId == null ? 43 : this.tunnelId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateIPSecConnectionTunnelSharedSecretDetails == null
                                ? 43
                                : this.updateIPSecConnectionTunnelSharedSecretDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
