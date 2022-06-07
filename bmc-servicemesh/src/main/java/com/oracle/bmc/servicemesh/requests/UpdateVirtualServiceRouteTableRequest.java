/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.requests;

import com.oracle.bmc.servicemesh.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/servicemesh/UpdateVirtualServiceRouteTableExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateVirtualServiceRouteTableRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
public class UpdateVirtualServiceRouteTableRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.servicemesh.model.UpdateVirtualServiceRouteTableDetails> {

    /**
     * Unique VirtualServiceRouteTable identifier.
     */
    private String virtualServiceRouteTableId;

    public String getVirtualServiceRouteTableId() {
        return virtualServiceRouteTableId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.servicemesh.model.UpdateVirtualServiceRouteTableDetails
            updateVirtualServiceRouteTableDetails;

    public com.oracle.bmc.servicemesh.model.UpdateVirtualServiceRouteTableDetails
            getUpdateVirtualServiceRouteTableDetails() {
        return updateVirtualServiceRouteTableDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.servicemesh.model.UpdateVirtualServiceRouteTableDetails getBody$() {
        return updateVirtualServiceRouteTableDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateVirtualServiceRouteTableRequest,
                    com.oracle.bmc.servicemesh.model.UpdateVirtualServiceRouteTableDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String virtualServiceRouteTableId = null;

        /**
         * Unique VirtualServiceRouteTable identifier.
         * @return this builder instance
         */
        public Builder virtualServiceRouteTableId(String virtualServiceRouteTableId) {
            this.virtualServiceRouteTableId = virtualServiceRouteTableId;
            return this;
        }

        private com.oracle.bmc.servicemesh.model.UpdateVirtualServiceRouteTableDetails
                updateVirtualServiceRouteTableDetails = null;

        /**
         * The information to be updated.
         * @return this builder instance
         */
        public Builder updateVirtualServiceRouteTableDetails(
                com.oracle.bmc.servicemesh.model.UpdateVirtualServiceRouteTableDetails
                        updateVirtualServiceRouteTableDetails) {
            this.updateVirtualServiceRouteTableDetails = updateVirtualServiceRouteTableDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdateVirtualServiceRouteTableRequest o) {
            virtualServiceRouteTableId(o.getVirtualServiceRouteTableId());
            updateVirtualServiceRouteTableDetails(o.getUpdateVirtualServiceRouteTableDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateVirtualServiceRouteTableRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateVirtualServiceRouteTableRequest
         */
        public UpdateVirtualServiceRouteTableRequest build() {
            UpdateVirtualServiceRouteTableRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.servicemesh.model.UpdateVirtualServiceRouteTableDetails body) {
            updateVirtualServiceRouteTableDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateVirtualServiceRouteTableRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateVirtualServiceRouteTableRequest
         */
        public UpdateVirtualServiceRouteTableRequest buildWithoutInvocationCallback() {
            UpdateVirtualServiceRouteTableRequest request =
                    new UpdateVirtualServiceRouteTableRequest();
            request.virtualServiceRouteTableId = virtualServiceRouteTableId;
            request.updateVirtualServiceRouteTableDetails = updateVirtualServiceRouteTableDetails;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateVirtualServiceRouteTableRequest(virtualServiceRouteTableId, updateVirtualServiceRouteTableDetails, ifMatch, opcRetryToken, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .virtualServiceRouteTableId(virtualServiceRouteTableId)
                .updateVirtualServiceRouteTableDetails(updateVirtualServiceRouteTableDetails)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",virtualServiceRouteTableId=")
                .append(String.valueOf(this.virtualServiceRouteTableId));
        sb.append(",updateVirtualServiceRouteTableDetails=")
                .append(String.valueOf(this.updateVirtualServiceRouteTableDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVirtualServiceRouteTableRequest)) {
            return false;
        }

        UpdateVirtualServiceRouteTableRequest other = (UpdateVirtualServiceRouteTableRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.virtualServiceRouteTableId, other.virtualServiceRouteTableId)
                && java.util.Objects.equals(
                        this.updateVirtualServiceRouteTableDetails,
                        other.updateVirtualServiceRouteTableDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.virtualServiceRouteTableId == null
                                ? 43
                                : this.virtualServiceRouteTableId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateVirtualServiceRouteTableDetails == null
                                ? 43
                                : this.updateVirtualServiceRouteTableDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
