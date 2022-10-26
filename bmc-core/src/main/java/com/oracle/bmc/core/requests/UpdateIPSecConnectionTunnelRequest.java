/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateIPSecConnectionTunnelExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateIPSecConnectionTunnelRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateIPSecConnectionTunnelRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the IPSec connection.
     */
    private String ipscId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the IPSec connection.
     */
    public String getIpscId() {
        return ipscId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the tunnel.
     */
    private String tunnelId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the tunnel.
     */
    public String getTunnelId() {
        return tunnelId;
    }
    /** Details object for updating a IPSecConnection tunnel's details. */
    private com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelDetails
            updateIPSecConnectionTunnelDetails;

    /** Details object for updating a IPSecConnection tunnel's details. */
    public com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelDetails
            getUpdateIPSecConnectionTunnelDetails() {
        return updateIPSecConnectionTunnelDetails;
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
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
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
    public com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelDetails getBody$() {
        return updateIPSecConnectionTunnelDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateIPSecConnectionTunnelRequest,
                    com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the IPSec connection.
         */
        private String ipscId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the IPSec connection.
         *
         * @param ipscId the value to set
         * @return this builder instance
         */
        public Builder ipscId(String ipscId) {
            this.ipscId = ipscId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the tunnel.
         */
        private String tunnelId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the tunnel.
         *
         * @param tunnelId the value to set
         * @return this builder instance
         */
        public Builder tunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }

        /** Details object for updating a IPSecConnection tunnel's details. */
        private com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelDetails
                updateIPSecConnectionTunnelDetails = null;

        /**
         * Details object for updating a IPSecConnection tunnel's details.
         *
         * @param updateIPSecConnectionTunnelDetails the value to set
         * @return this builder instance
         */
        public Builder updateIPSecConnectionTunnelDetails(
                com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelDetails
                        updateIPSecConnectionTunnelDetails) {
            this.updateIPSecConnectionTunnelDetails = updateIPSecConnectionTunnelDetails;
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

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(UpdateIPSecConnectionTunnelRequest o) {
            ipscId(o.getIpscId());
            tunnelId(o.getTunnelId());
            updateIPSecConnectionTunnelDetails(o.getUpdateIPSecConnectionTunnelDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateIPSecConnectionTunnelRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateIPSecConnectionTunnelRequest
         */
        public UpdateIPSecConnectionTunnelRequest build() {
            UpdateIPSecConnectionTunnelRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateIPSecConnectionTunnelDetails body) {
            updateIPSecConnectionTunnelDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateIPSecConnectionTunnelRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateIPSecConnectionTunnelRequest
         */
        public UpdateIPSecConnectionTunnelRequest buildWithoutInvocationCallback() {
            UpdateIPSecConnectionTunnelRequest request = new UpdateIPSecConnectionTunnelRequest();
            request.ipscId = ipscId;
            request.tunnelId = tunnelId;
            request.updateIPSecConnectionTunnelDetails = updateIPSecConnectionTunnelDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateIPSecConnectionTunnelRequest(ipscId, tunnelId,
            // updateIPSecConnectionTunnelDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .ipscId(ipscId)
                .tunnelId(tunnelId)
                .updateIPSecConnectionTunnelDetails(updateIPSecConnectionTunnelDetails)
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
        sb.append(",ipscId=").append(String.valueOf(this.ipscId));
        sb.append(",tunnelId=").append(String.valueOf(this.tunnelId));
        sb.append(",updateIPSecConnectionTunnelDetails=")
                .append(String.valueOf(this.updateIPSecConnectionTunnelDetails));
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
        if (!(o instanceof UpdateIPSecConnectionTunnelRequest)) {
            return false;
        }

        UpdateIPSecConnectionTunnelRequest other = (UpdateIPSecConnectionTunnelRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.ipscId, other.ipscId)
                && java.util.Objects.equals(this.tunnelId, other.tunnelId)
                && java.util.Objects.equals(
                        this.updateIPSecConnectionTunnelDetails,
                        other.updateIPSecConnectionTunnelDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ipscId == null ? 43 : this.ipscId.hashCode());
        result = (result * PRIME) + (this.tunnelId == null ? 43 : this.tunnelId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateIPSecConnectionTunnelDetails == null
                                ? 43
                                : this.updateIPSecConnectionTunnelDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
