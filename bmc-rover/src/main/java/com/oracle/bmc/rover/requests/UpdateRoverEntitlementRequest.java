/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.requests;

import com.oracle.bmc.rover.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/UpdateRoverEntitlementExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateRoverEntitlementRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public class UpdateRoverEntitlementRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.rover.model.UpdateRoverEntitlementDetails> {

    /**
     * ID of the rover node or cluster entitlement
     */
    private String roverEntitlementId;

    public String getRoverEntitlementId() {
        return roverEntitlementId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.rover.model.UpdateRoverEntitlementDetails updateRoverEntitlementDetails;

    public com.oracle.bmc.rover.model.UpdateRoverEntitlementDetails
            getUpdateRoverEntitlementDetails() {
        return updateRoverEntitlementDetails;
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
    public com.oracle.bmc.rover.model.UpdateRoverEntitlementDetails getBody$() {
        return updateRoverEntitlementDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateRoverEntitlementRequest,
                    com.oracle.bmc.rover.model.UpdateRoverEntitlementDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String roverEntitlementId = null;

        /**
         * ID of the rover node or cluster entitlement
         * @return this builder instance
         */
        public Builder roverEntitlementId(String roverEntitlementId) {
            this.roverEntitlementId = roverEntitlementId;
            return this;
        }

        private com.oracle.bmc.rover.model.UpdateRoverEntitlementDetails
                updateRoverEntitlementDetails = null;

        /**
         * The information to be updated.
         * @return this builder instance
         */
        public Builder updateRoverEntitlementDetails(
                com.oracle.bmc.rover.model.UpdateRoverEntitlementDetails
                        updateRoverEntitlementDetails) {
            this.updateRoverEntitlementDetails = updateRoverEntitlementDetails;
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
        public Builder copy(UpdateRoverEntitlementRequest o) {
            roverEntitlementId(o.getRoverEntitlementId());
            updateRoverEntitlementDetails(o.getUpdateRoverEntitlementDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateRoverEntitlementRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateRoverEntitlementRequest
         */
        public UpdateRoverEntitlementRequest build() {
            UpdateRoverEntitlementRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.rover.model.UpdateRoverEntitlementDetails body) {
            updateRoverEntitlementDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateRoverEntitlementRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateRoverEntitlementRequest
         */
        public UpdateRoverEntitlementRequest buildWithoutInvocationCallback() {
            UpdateRoverEntitlementRequest request = new UpdateRoverEntitlementRequest();
            request.roverEntitlementId = roverEntitlementId;
            request.updateRoverEntitlementDetails = updateRoverEntitlementDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateRoverEntitlementRequest(roverEntitlementId, updateRoverEntitlementDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .roverEntitlementId(roverEntitlementId)
                .updateRoverEntitlementDetails(updateRoverEntitlementDetails)
                .ifMatch(ifMatch)
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
        sb.append(",roverEntitlementId=").append(String.valueOf(this.roverEntitlementId));
        sb.append(",updateRoverEntitlementDetails=")
                .append(String.valueOf(this.updateRoverEntitlementDetails));
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
        if (!(o instanceof UpdateRoverEntitlementRequest)) {
            return false;
        }

        UpdateRoverEntitlementRequest other = (UpdateRoverEntitlementRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.roverEntitlementId, other.roverEntitlementId)
                && java.util.Objects.equals(
                        this.updateRoverEntitlementDetails, other.updateRoverEntitlementDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.roverEntitlementId == null
                                ? 43
                                : this.roverEntitlementId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateRoverEntitlementDetails == null
                                ? 43
                                : this.updateRoverEntitlementDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
