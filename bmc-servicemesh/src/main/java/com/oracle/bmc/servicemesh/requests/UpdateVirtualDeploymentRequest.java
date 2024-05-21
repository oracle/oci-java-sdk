/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.requests;

import com.oracle.bmc.servicemesh.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/servicemesh/UpdateVirtualDeploymentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateVirtualDeploymentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
public class UpdateVirtualDeploymentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.servicemesh.model.UpdateVirtualDeploymentDetails> {

    /**
     * Unique VirtualDeployment identifier.
     */
    private String virtualDeploymentId;

    /**
     * Unique VirtualDeployment identifier.
     */
    public String getVirtualDeploymentId() {
        return virtualDeploymentId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.servicemesh.model.UpdateVirtualDeploymentDetails
            updateVirtualDeploymentDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.servicemesh.model.UpdateVirtualDeploymentDetails
            getUpdateVirtualDeploymentDetails() {
        return updateVirtualDeploymentDetails;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.servicemesh.model.UpdateVirtualDeploymentDetails getBody$() {
        return updateVirtualDeploymentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateVirtualDeploymentRequest,
                    com.oracle.bmc.servicemesh.model.UpdateVirtualDeploymentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique VirtualDeployment identifier.
         */
        private String virtualDeploymentId = null;

        /**
         * Unique VirtualDeployment identifier.
         * @param virtualDeploymentId the value to set
         * @return this builder instance
         */
        public Builder virtualDeploymentId(String virtualDeploymentId) {
            this.virtualDeploymentId = virtualDeploymentId;
            return this;
        }

        /**
         * The information to be updated.
         */
        private com.oracle.bmc.servicemesh.model.UpdateVirtualDeploymentDetails
                updateVirtualDeploymentDetails = null;

        /**
         * The information to be updated.
         * @param updateVirtualDeploymentDetails the value to set
         * @return this builder instance
         */
        public Builder updateVirtualDeploymentDetails(
                com.oracle.bmc.servicemesh.model.UpdateVirtualDeploymentDetails
                        updateVirtualDeploymentDetails) {
            this.updateVirtualDeploymentDetails = updateVirtualDeploymentDetails;
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
        public Builder copy(UpdateVirtualDeploymentRequest o) {
            virtualDeploymentId(o.getVirtualDeploymentId());
            updateVirtualDeploymentDetails(o.getUpdateVirtualDeploymentDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateVirtualDeploymentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateVirtualDeploymentRequest
         */
        public UpdateVirtualDeploymentRequest build() {
            UpdateVirtualDeploymentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.servicemesh.model.UpdateVirtualDeploymentDetails body) {
            updateVirtualDeploymentDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateVirtualDeploymentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateVirtualDeploymentRequest
         */
        public UpdateVirtualDeploymentRequest buildWithoutInvocationCallback() {
            UpdateVirtualDeploymentRequest request = new UpdateVirtualDeploymentRequest();
            request.virtualDeploymentId = virtualDeploymentId;
            request.updateVirtualDeploymentDetails = updateVirtualDeploymentDetails;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateVirtualDeploymentRequest(virtualDeploymentId, updateVirtualDeploymentDetails, ifMatch, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .virtualDeploymentId(virtualDeploymentId)
                .updateVirtualDeploymentDetails(updateVirtualDeploymentDetails)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",virtualDeploymentId=").append(String.valueOf(this.virtualDeploymentId));
        sb.append(",updateVirtualDeploymentDetails=")
                .append(String.valueOf(this.updateVirtualDeploymentDetails));
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
        if (!(o instanceof UpdateVirtualDeploymentRequest)) {
            return false;
        }

        UpdateVirtualDeploymentRequest other = (UpdateVirtualDeploymentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.virtualDeploymentId, other.virtualDeploymentId)
                && java.util.Objects.equals(
                        this.updateVirtualDeploymentDetails, other.updateVirtualDeploymentDetails)
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
                        + (this.virtualDeploymentId == null
                                ? 43
                                : this.virtualDeploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateVirtualDeploymentDetails == null
                                ? 43
                                : this.updateVirtualDeploymentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
