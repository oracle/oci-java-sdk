/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.requests;

import com.oracle.bmc.servicemesh.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/servicemesh/ChangeVirtualServiceRouteTableCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeVirtualServiceRouteTableCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
public class ChangeVirtualServiceRouteTableCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.servicemesh.model.ChangeVirtualServiceRouteTableCompartmentDetails> {

    /**
     * Unique VirtualServiceRouteTable identifier.
     */
    private String virtualServiceRouteTableId;

    /**
     * Unique VirtualServiceRouteTable identifier.
     */
    public String getVirtualServiceRouteTableId() {
        return virtualServiceRouteTableId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.servicemesh.model.ChangeVirtualServiceRouteTableCompartmentDetails
            changeVirtualServiceRouteTableCompartmentDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.servicemesh.model.ChangeVirtualServiceRouteTableCompartmentDetails
            getChangeVirtualServiceRouteTableCompartmentDetails() {
        return changeVirtualServiceRouteTableCompartmentDetails;
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

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
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
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.servicemesh.model.ChangeVirtualServiceRouteTableCompartmentDetails
            getBody$() {
        return changeVirtualServiceRouteTableCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeVirtualServiceRouteTableCompartmentRequest,
                    com.oracle.bmc.servicemesh.model
                            .ChangeVirtualServiceRouteTableCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique VirtualServiceRouteTable identifier.
         */
        private String virtualServiceRouteTableId = null;

        /**
         * Unique VirtualServiceRouteTable identifier.
         * @param virtualServiceRouteTableId the value to set
         * @return this builder instance
         */
        public Builder virtualServiceRouteTableId(String virtualServiceRouteTableId) {
            this.virtualServiceRouteTableId = virtualServiceRouteTableId;
            return this;
        }

        /**
         * The information to be updated.
         */
        private com.oracle.bmc.servicemesh.model.ChangeVirtualServiceRouteTableCompartmentDetails
                changeVirtualServiceRouteTableCompartmentDetails = null;

        /**
         * The information to be updated.
         * @param changeVirtualServiceRouteTableCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeVirtualServiceRouteTableCompartmentDetails(
                com.oracle.bmc.servicemesh.model.ChangeVirtualServiceRouteTableCompartmentDetails
                        changeVirtualServiceRouteTableCompartmentDetails) {
            this.changeVirtualServiceRouteTableCompartmentDetails =
                    changeVirtualServiceRouteTableCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ChangeVirtualServiceRouteTableCompartmentRequest o) {
            virtualServiceRouteTableId(o.getVirtualServiceRouteTableId());
            changeVirtualServiceRouteTableCompartmentDetails(
                    o.getChangeVirtualServiceRouteTableCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeVirtualServiceRouteTableCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeVirtualServiceRouteTableCompartmentRequest
         */
        public ChangeVirtualServiceRouteTableCompartmentRequest build() {
            ChangeVirtualServiceRouteTableCompartmentRequest request =
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
                com.oracle.bmc.servicemesh.model.ChangeVirtualServiceRouteTableCompartmentDetails
                        body) {
            changeVirtualServiceRouteTableCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeVirtualServiceRouteTableCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeVirtualServiceRouteTableCompartmentRequest
         */
        public ChangeVirtualServiceRouteTableCompartmentRequest buildWithoutInvocationCallback() {
            ChangeVirtualServiceRouteTableCompartmentRequest request =
                    new ChangeVirtualServiceRouteTableCompartmentRequest();
            request.virtualServiceRouteTableId = virtualServiceRouteTableId;
            request.changeVirtualServiceRouteTableCompartmentDetails =
                    changeVirtualServiceRouteTableCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeVirtualServiceRouteTableCompartmentRequest(virtualServiceRouteTableId, changeVirtualServiceRouteTableCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .virtualServiceRouteTableId(virtualServiceRouteTableId)
                .changeVirtualServiceRouteTableCompartmentDetails(
                        changeVirtualServiceRouteTableCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",virtualServiceRouteTableId=")
                .append(String.valueOf(this.virtualServiceRouteTableId));
        sb.append(",changeVirtualServiceRouteTableCompartmentDetails=")
                .append(String.valueOf(this.changeVirtualServiceRouteTableCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeVirtualServiceRouteTableCompartmentRequest)) {
            return false;
        }

        ChangeVirtualServiceRouteTableCompartmentRequest other =
                (ChangeVirtualServiceRouteTableCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.virtualServiceRouteTableId, other.virtualServiceRouteTableId)
                && java.util.Objects.equals(
                        this.changeVirtualServiceRouteTableCompartmentDetails,
                        other.changeVirtualServiceRouteTableCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
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
                        + (this.changeVirtualServiceRouteTableCompartmentDetails == null
                                ? 43
                                : this.changeVirtualServiceRouteTableCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
